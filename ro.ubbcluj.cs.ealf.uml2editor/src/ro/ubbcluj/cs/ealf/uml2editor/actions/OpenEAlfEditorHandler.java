package ro.ubbcluj.cs.ealf.uml2editor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

import ro.ubbcluj.cs.ealf.ui.extra.EAlfEditorInput;

public class OpenEAlfEditorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out
				.println("ENTER - OpenEAlfEditorHandler.execute(ExecutionEvent)");

		UMLEditor umlEditor = getUMLEditor();

		if (umlEditor == null
				|| !(umlEditor.getSelection() instanceof TreeSelection)
				|| (!umlEditor.getViewer().getControl().isFocusControl())) {
			return null;
		}

		TreeSelection selection = (TreeSelection) umlEditor.getSelection();
		if (selection.size() != 1) {
			showDialogMessage(event, "Select one element");
			return null;
		}

		// element should be the selected Activity,
		// or the method:Activity of the selected Operation
		NamedElement element = null;
		URI uri = null;
		String ownerFragment = null;

		if (selection.getFirstElement() instanceof NamedElement) {
			element = (NamedElement) selection.getFirstElement();
			if (element.getOwner() != null) {
				ownerFragment = element.eResource().getURIFragment(
						element.getOwner());
			}

			if (element instanceof Operation
					&& element.getOwner() instanceof BehavioredClassifier) {
				Operation operation = (Operation) element;
				createActivity(operation);
				Activity activity = (Activity) operation.getMethod(operation
						.getName());
				createActivityComment(activity);
				// Change element to the Activity
				element = activity;
			} else if (element instanceof Activity) {
				Activity activity = (Activity) element;
				createActivityComment(activity);
			} else {
				showDialogMessage(event, "Select Operation or Activity");
				return null;
			}

			uri = element.eResource().getURI();

			System.out.println(element.eResource());

			NamedElement ownerElement = element;
			while (ownerElement != null && ownerElement instanceof NamedElement) {
				if (ownerElement.getName() == null
						|| ownerElement.getName().trim().length() == 0) {
					showDialogMessage(event,
							"Selected element and all parent elements must have a name set.");
					return null;
				} else {
					if (uri.fragment() == null) {
						uri = uri.appendFragment(ownerElement.getName());
					} else {
						uri = uri.appendFragment(ownerElement.getName() + "/"
								+ uri.fragment());
					}
				}
				ownerElement = (NamedElement) ownerElement.getOwner();
			}

			// showDialogMessage(event, uri.toString());

		}

		if (uri != null) {
			openEditor(uri, ownerFragment, umlEditor, element.eResource());
		} else {
			showDialogMessage(event, "URI of element is null, for some reason");
		}
		return null;
		// platform:/resource/test.xtext/testOther.ealf
	}

	private void openEditor(URI uri, String ownerFragment,
			UMLEditor mainUMLEditor, Resource mainResource) {
		System.out.println("URI to open: " + uri);
		try {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();

			IEditorDescriptor editorDescriptor;
			IEditorInput editorInput;

			editorDescriptor = PlatformUI.getWorkbench().getEditorRegistry()
					.getDefaultEditor(".ealf");
			editorInput = new EAlfEditorInput(uri, ownerFragment);

			page.openEditor(editorInput, editorDescriptor.getId(), true,
					IWorkbenchPage.MATCH_ID + IWorkbenchPage.MATCH_INPUT);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void createActivity(final Operation operation) {
		if (operation.getMethods().isEmpty()) {
			final BehavioredClassifier operationClassifier = (BehavioredClassifier) operation
					.getOwner();
			EditingDomain editingDomain = getUMLEditor().getEditingDomain();
			editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {
						public void run() {
							Activity activity = UMLFactory.eINSTANCE
									.createActivity();
							activity.setName(operation.getName());
							operationClassifier.getOwnedBehaviors().add(
									activity);
							operation.getMethods().add(activity);
							// activity.setSpecification(operation);
							System.out.println(operation.getName()
									+ " Activity was added for Operation");
						}
					}, "Open EAlf for Operation"));
			getUMLEditor().doSave(null);
		}
	}

	private void createActivityComment(final Activity activity) {
		if (activity.getOwnedComments().isEmpty()) {
			EditingDomain editingDomain = getUMLEditor().getEditingDomain();
			editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {
						public void run() {
							Comment comment = UMLFactory.eINSTANCE
									.createComment();
							comment.setBody("activity " + activity.getName()
									+ "() {\n}");
							activity.getOwnedComments().add(comment);
							System.out.println(activity.getName()
									+ " Comment was added to Activity");
						}
					}, "Open EAlf for Operation"));
			getUMLEditor().doSave(null);
		}
	}

	private UMLEditor getUMLEditor() {
		UMLEditor umlEditor = null;
		try {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();
			IEditorPart editor = page.getActiveEditor();
			if (editor instanceof UMLEditor) {
				umlEditor = (UMLEditor) editor;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return umlEditor;
	}

	private void showDialogMessage(ExecutionEvent event, String message) {
		MessageDialog.openInformation(
				HandlerUtil.getActiveWorkbenchWindow(event).getShell(),
				"Info Message", message);
	}

}

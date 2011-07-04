package ro.ubbcluj.cs.ealf.uml2editor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

import ro.ubbcluj.cs.ealf.ui.extra.EAlfEditorInput;
import ro.ubbcluj.cs.ealf.ui.extra.EAlfUtil;

public class OpenEAlfEditorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out
				.println("ENTER - OpenEAlfEditorHandler.execute(ExecutionEvent)");

		UMLEditor umlEditor = EAlfUtil.getActiveEditorAsUMLEditor();

		if (umlEditor == null
				|| !(umlEditor.getSelection() instanceof TreeSelection)
				|| (!umlEditor.getViewer().getControl().isFocusControl())) {
			return null;
		}

		TreeSelection selection = (TreeSelection) umlEditor.getSelection();
		if (selection.size() != 1) {
			EAlfUtil.showDialogMessage(event, "Select one element");
			return null;
		}

		// element should be the selected Activity,
		// or the method:Activity of the selected Operation
		NamedElement element = null;
		String commentFragment = null;
		URI elementURI = null;
		URI umlURI = null;

		if (selection.getFirstElement() instanceof NamedElement) {
			element = (NamedElement) selection.getFirstElement();

			if (!(element instanceof Operation || element instanceof Activity)) {
				EAlfUtil.showDialogMessage(event,
						"Select Operation or Activity");
				return null;
			}

			Activity activity = null;
			if (element instanceof Operation
					&& element.getOwner() instanceof BehavioredClassifier) {
				Operation operation = (Operation) element;
				activity = EAlfUtil.createActivityForOperation(umlEditor,
						operation);

				// Change element to the Activity
				element = activity;
			} else {
				activity = (Activity) element;
			}

			EAlfUtil.createCommentForActivity(umlEditor, activity);
			Comment comment = EAlfUtil.getCommentForActivity(activity);
			commentFragment = comment.eResource().getURIFragment(comment);

			umlURI = comment.eResource().getURI();

			if (element.eResource() == comment.eResource()) {
				elementURI = EAlfUtil.getEAlfURI(umlURI, commentFragment);
				EAlfUtil.controlActivity(umlEditor, activity, comment,
						elementURI);
			} else {
				elementURI = element.eResource().getURI();
			}

			// EAlfUMLCommentsListener listener = new
			// EAlfUMLCommentsListener().//(comment.getOwner());

			NamedElement ownerElement = element;
			while (ownerElement != null && ownerElement instanceof NamedElement) {
				if (ownerElement.getName() == null
						|| ownerElement.getName().trim().length() == 0) {
					EAlfUtil.showDialogMessage(event,
							"Selected element and all parent elements must have a name set.");
					return null;
				} else {
					// if (uri.fragment() == null) {
					// uri = uri.appendFragment(ownerElement.getName());
					// } else {
					// uri = uri.appendFragment(ownerElement.getName() + "/"
					// + uri.fragment());
					// }
				}
				ownerElement = (NamedElement) ownerElement.getOwner();
			}

			// showDialogMessage(event, uri.toString());

		}

		System.out.println(elementURI);
		System.out.println(umlURI);

		if (elementURI != null) {
			openEditor(umlURI, elementURI);
		} else {
			EAlfUtil.showDialogMessage(event,
					"URI of element is null, for some reason");
		}
		return null;
	}

	private void openEditor(URI umlURI, URI elementURI) {
		System.out.println("URI to open: " + elementURI);
		try {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();

			IEditorDescriptor editorDescriptor;
			EAlfEditorInput editorInput;

			editorDescriptor = PlatformUI.getWorkbench().getEditorRegistry()
					.getDefaultEditor(".ealf");
			editorInput = new EAlfEditorInput(umlURI, elementURI);

			IEditorPart newPage = page.openEditor(editorInput,
					editorDescriptor.getId(), true, IWorkbenchPage.MATCH_ID
							+ IWorkbenchPage.MATCH_INPUT);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

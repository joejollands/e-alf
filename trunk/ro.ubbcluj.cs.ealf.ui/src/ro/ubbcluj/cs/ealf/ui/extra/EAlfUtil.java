package ro.ubbcluj.cs.ealf.ui.extra;

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
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
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

public class EAlfUtil {

	public static IFile getIFileFromURI(URI uri) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = root.getFile(new Path(uri.toPlatformString(true)));
		return file;
	}

	public static URI getURIFromIFile(IFile file) {
		URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(),
				true);
		return uri;
	}

	public static IEditorPart getActiveEditor() {
		IEditorPart editor = null;
		try {
			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();
			editor = page.getActiveEditor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return editor;
	}

	public static UMLEditor getActiveEditorAsUMLEditor() {
		IEditorPart editor = getActiveEditor();
		if (editor instanceof UMLEditor) {
			return (UMLEditor) editor;
		}
		return null;
	}

	public static Comment createCommentForActivity(UMLEditor umlEditor,
			final Activity activity) {
		Comment returnComment = getCommentForActivity(activity);
		if (returnComment == null) {
			final Comment comment = UMLFactory.eINSTANCE.createComment();
			returnComment = comment;
			EditingDomain editingDomain = umlEditor.getEditingDomain();
			editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {
						public void run() {
							comment.setBody(getCommentPrefixForActivity(activity)
									+ "() {\n}");
							getRootElement(activity).getOwnedComments().add(
									comment);
							System.out.println(activity.getName()
									+ " Comment was added to Activity's owner");
						}
					}, "Open EAlf for Operation"));
			umlEditor.doSave(null);
		}
		return returnComment;
	}

	public static Comment getCommentForActivity(Activity activity) {
		String prefix = getCommentPrefixForActivity(activity);
		for (Iterator<Comment> iterator = getRootElement(activity)
				.getOwnedComments().iterator(); iterator.hasNext();) {
			Comment comment = iterator.next();
			String body = comment.getBody();
			if (body.startsWith(prefix)) {
				return comment;
			}
		}
		return null;
	}

	private static String getCommentPrefixForActivity(Activity activity) {
		return "activity " + activity.getName();
	}

	public static Activity createActivityForOperation(UMLEditor umlEditor,
			final Operation operation) {
		final BehavioredClassifier operationClassifier = (BehavioredClassifier) operation
				.getOwner();
		Activity returnActivity = (Activity) operationClassifier
				.getOwnedBehavior(operation.getName());
		if (returnActivity == null) {
			final Activity activity = UMLFactory.eINSTANCE.createActivity();
			returnActivity = activity;
			EditingDomain editingDomain = umlEditor.getEditingDomain();
			editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {
						public void run() {
							activity.setName(operation.getName());
							operationClassifier.getOwnedBehaviors().add(
									activity);
							// operation.getMethods().add(activity);
							// activity.setSpecification(operation);
							System.out.println(operation.getName()
									+ " Activity was added for Operation");
						}
					}, "Open EAlf for Operation"));
			umlEditor.doSave(null);
		}
		return returnActivity;
	}

	public static URI getMainUMLURI(URI uri) {
		String ealfPath = uri.appendQuery(null).toString();
		String platformPath = ealfPath.replaceFirst("ealf", "platform");
		URI umlResourceURI = URI.createURI(platformPath);
		return umlResourceURI;
	}

	public static URI getEAlfURI(URI umlURI, String commentFragment) {
		String umlPath = umlURI.appendQuery(commentFragment).toString();
		String ealfPath = umlPath.replaceFirst("platform", "ealf");
		// ealfPath += "#/";
		URI ealfResourceURI = URI.createURI(ealfPath);
		return ealfResourceURI;
	}

	public static Element getRootElement(Element element) {
		Element rootElement = element;
		while (rootElement.getOwner() != null) {
			rootElement = rootElement.getOwner();
		}
		return rootElement;
	}

	public static void showDialogMessage(ExecutionEvent event, String message) {
		MessageDialog.openInformation(
				HandlerUtil.getActiveWorkbenchWindow(event).getShell(),
				"Info Message", message);
	}

}

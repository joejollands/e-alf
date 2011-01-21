package ro.ubbcluj.cs.ealf.uml2editor.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

public class OpenEAlfEditorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		UMLEditor umlEditor = getUMLEditor();
		if (umlEditor == null
				|| !(umlEditor.getSelection() instanceof TreeSelection)) {
			return null;
		}
		TreeSelection selection = (TreeSelection) umlEditor.getSelection();
		if (selection.size() == 1) {
			Object object = selection.getFirstElement();
			if (object instanceof Operation) {
				Operation operation = (Operation) object;
				MessageDialog.openInformation(HandlerUtil
						.getActiveWorkbenchWindow(event).getShell(), "Info",
						operation.toString());
			}
		}
		return null;
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

}

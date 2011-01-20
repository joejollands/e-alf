package ro.ubbcluj.cs.ealf.uml2editor.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.common.edit.command.ChangeCommand;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.editor.actions.UMLCommandAction;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;

public class OpenEAlfEditorActionDelegate extends UMLCommandAction {

	public OpenEAlfEditorActionDelegate() {
		super();
	}

	@Override
	protected Command createActionCommand(EditingDomain editingDomain,
			Collection<?> collection) {
		if (collection.size() == 1
				&& collection.iterator().next() instanceof Operation) {
			return IdentityCommand.INSTANCE;
		}
		return UnexecutableCommand.INSTANCE;
	}

	@Override
	public void run(IAction action) {
		if (command != UnexecutableCommand.INSTANCE) {
			final Operation operation = (Operation) collection.iterator()
					.next();
			if (operation.getOwner() instanceof BehavioredClassifier) {
				final BehavioredClassifier operationClassifier = (BehavioredClassifier) operation
						.getOwner();
				if (operation.getMethod(operation.getName()) == null) {
					editingDomain.getCommandStack().execute(
							new ChangeCommand(editingDomain, new Runnable() {
								public void run() {
									Activity activity = UMLFactory.eINSTANCE
											.createActivity();
									activity.setName(operation.getName());
									operationClassifier.getOwnedBehaviors()
											.add(activity);
									operation.getMethods().add(activity);
									// activity.setSpecification(operation);
									System.out.println(operation.getName()
											+ " Activity was added");
								}
							}, "Open EAlf for Operation"));
					saveUMLEditor();

				} else { // operation.getMethod(operation.getName()) != null
					System.out
							.println(operation.getName() + " Activity exists");
				}
			}
		}
	}

	void saveUMLEditor() {
		try {
			if (workbenchPart instanceof UMLEditor) {
				((UMLEditor) workbenchPart).doSave(null);
			} else {
				IWorkbench wb = PlatformUI.getWorkbench();
				IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
				IWorkbenchPage page = win.getActivePage();
				IEditorPart editor = page.getActiveEditor();
				editor.doSave(null);
				System.out.println(editor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

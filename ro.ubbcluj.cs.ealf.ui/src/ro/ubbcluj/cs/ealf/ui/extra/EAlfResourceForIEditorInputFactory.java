package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

public class EAlfResourceForIEditorInputFactory extends
		JavaClassPathResourceForIEditorInputFactory {

	public Resource createResource(IEditorInput editorInput) {
		try {
			System.out
					.println("EAlfResourceForIEditorInputFactory.createResource");
			if (editorInput instanceof EAlfEditorInput) {
				EAlfEditorInput castedEditorInput = (EAlfEditorInput) editorInput;
				ResourceSet resourceSet = getResourceSetProvider().get(
						castedEditorInput.getFile().getProject());
				((EAlfResourceSet) resourceSet)
						.setEditorInput(castedEditorInput);
				// configureResourceSet(resourceSet,
				// castedEditorInput.getElementURI());
				URI fileURI = URI.createPlatformResourceURI(castedEditorInput
						.getFile().toString(), true);
				configureResourceSet(resourceSet, fileURI);
				XtextResource resource;
				resource = (XtextResource) resourceSet.createResource(
						castedEditorInput.getElementURI(), castedEditorInput
								.getFile().getCharset());
				resource.setValidationDisabled(false);

				System.out
						.println("EAlfResourceForIEditorInputFactory.createResource - FileAndElementEditorInput");
				return resource;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return super.createResource(editorInput);
	}
}

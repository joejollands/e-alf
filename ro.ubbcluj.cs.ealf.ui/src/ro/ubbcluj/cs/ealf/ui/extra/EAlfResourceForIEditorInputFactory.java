package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;

public class EAlfResourceForIEditorInputFactory extends
		JavaClassPathResourceForIEditorInputFactory {

	public Resource createResource(IEditorInput editorInput) {
		System.out.println("EAlfResourceForIEditorInputFactory.createResource "
				+ editorInput.getName() + " - "
				+ editorInput.getClass().getName());
		if (editorInput instanceof EAlfEditorInput) {
			EAlfEditorInput ealfEditorInput = (EAlfEditorInput) editorInput;
			EAlfResourceSet resourceSet = (EAlfResourceSet) getResourceSetProvider()
					.get(ealfEditorInput.getFile().getProject());
			resourceSet.setEditorInput(ealfEditorInput);

			URI elementURI = ealfEditorInput.getElementURI();

			configureResourceSet(resourceSet, ealfEditorInput.getMainFileURI());

			XtextResource xtextResource = (XtextResource) resourceSet
					.createResource(elementURI, null);
			xtextResource.setValidationDisabled(false);
			ealfEditorInput.setXtextResource(xtextResource);

			System.out
					.println("EAlfResourceForIEditorInputFactory.createResource - END");
			return xtextResource;
		}
		return super.createResource(editorInput);
	}
}

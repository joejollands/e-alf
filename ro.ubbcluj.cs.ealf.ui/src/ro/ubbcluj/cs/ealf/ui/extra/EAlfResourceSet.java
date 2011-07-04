package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

public class EAlfResourceSet extends XtextResourceSet {

	private EAlfEditorInput editorInput;

	public Resource createResource(URI uri, String contentType) {
		Resource.Factory ealfResourceFactory = null;
		if (uri.fileExtension().equals("ealf")
				|| (uri.fileExtension().equals("uml") && uri.fragment() != null)) {
			Object ealfResourceFactoryObject = Resource.Factory.Registry.INSTANCE
					.getExtensionToFactoryMap().get("ealf");
			ealfResourceFactory = ResourceFactoryRegistryImpl
					.convert(ealfResourceFactoryObject);
		}
		if (ealfResourceFactory != null) {
			// add EAlf resource
			Resource resultResource = ealfResourceFactory.createResource(uri);
			getResources().add(resultResource);

			// add UML resource
			// added in EAlfResourceForIEditorInputFactory

			// URI mainUMLResourceURI = uri.appendFragment(null);
			// Object umlResourceFactoryObject =
			// Resource.Factory.Registry.INSTANCE
			// .getExtensionToFactoryMap().get("uml");
			// Resource.Factory umlResourceFactory = ResourceFactoryRegistryImpl
			// .convert(umlResourceFactoryObject);
			// Resource mainUMLResource = umlResourceFactory
			// .createResource(mainUMLResourceURI);
			// getResources().add(mainUMLResource);

			return resultResource;
		} else {
			return super.createResource(uri, contentType);
		}
	}

	@Override
	public URIConverter getURIConverter() {
		System.out
				.println("XtextResourceSet.getURIConverter() " + uriConverter);
		if (uriConverter == null) {
			uriConverter = new EAlfURIConverter(this);
			// uriConverter.getURIHandlers().add(0, new EAlfURIHandler(this));
		}
		return uriConverter;
	}

	public EAlfEditorInput getEditorInput() {
		return editorInput;
	}

	public void setEditorInput(EAlfEditorInput editorInput) {
		this.editorInput = editorInput;
	}

}

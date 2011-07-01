package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.xtext.resource.ClasspathUriResolutionException;
import org.eclipse.xtext.resource.ClasspathUriUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

public class EAlfResourceSet extends XtextResourceSet {

	private EAlfEditorInput editorInput;

	public Resource createResource(URI uri, String contentType) {
		Resource.Factory resourceFactory = null;
		if (uri.fileExtension().equals("ealf")
				|| (uri.fileExtension().equals("uml") && uri.fragment() != null)) {
			Object rf = Resource.Factory.Registry.INSTANCE
					.getExtensionToFactoryMap().get("ealf");
			resourceFactory = ResourceFactoryRegistryImpl.convert(rf);
		}
		if (resourceFactory != null) {
			Resource result = resourceFactory.createResource(uri);
			getResources().add(result);
			return result;
		} else {
			return super.createResource(uri, contentType);
		}
	}

	@Override
	public URIConverter getURIConverter() {
		if (uriConverter == null) {
			uriConverter = new EAlfURIConverter(this);
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

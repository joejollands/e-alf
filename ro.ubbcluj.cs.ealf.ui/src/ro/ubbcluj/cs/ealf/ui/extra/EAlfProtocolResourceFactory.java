package ro.ubbcluj.cs.ealf.ui.extra;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.editor.presentation.UMLEditor;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.XtextResource;

public class EAlfProtocolResourceFactory implements Factory {

	@Override
	public Resource createResource(URI uri) {
		// System.out.println("EAlfProtocolResourceFactory " + uri);
		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE
				.getExtensionToFactoryMap();
		Object resourceFactoryObject = extensionToFactoryMap.get("ealf");
		Factory resourceFactory = ResourceFactoryRegistryImpl
				.convert(resourceFactoryObject);
		XtextResource xtextResource = (XtextResource) resourceFactory
				.createResource(uri);

		UMLEditor umlEditor = EAlfUtil.getActiveEditorAsUMLEditor();
		if (umlEditor != null) {
			// ealf resource to be created inside an UMLEditor
			// we need to register the handler with the UML resource set
			ResourceSet resourceSet = umlEditor.getEditingDomain()
					.getResourceSet();
			URI umlResourceURI = EAlfUtil.getMainUMLURI(uri);
			UMLResource umlResource = (UMLResource) resourceSet.getResource(
					umlResourceURI, true);

			registerURIHandler(resourceSet.getURIConverter(), umlEditor,
					umlResource);

			registerUMLCommentsDeleteListener(umlResource);
		} else {
			System.out
					.println("EAlfProtocolResourceFactory - UMLEditor is null");
			// return null;
		}

		return xtextResource;
	}

	private void registerUMLCommentsDeleteListener(UMLResource umlResource) {
		EAlfUMLCommentsListener listener = new EAlfUMLCommentsListener();
		listener.observeElement((Element) umlResource.getContents().get(0));
	}

	private void registerURIHandler(URIConverter uriConverter,
			UMLEditor umlEditor, UMLResource umlResource) {
		EList<URIHandler> uriHandlers = uriConverter.getURIHandlers();
		boolean uriHandlerExists = false;
		for (Iterator<URIHandler> iterator = uriHandlers.iterator(); iterator
				.hasNext();) {
			URIHandler uriHandler = iterator.next();
			if (uriHandler instanceof EAlfInUMLURIHandler) {
				uriHandlerExists = true;
			}
		}
		if (!uriHandlerExists) {
			EAlfInUMLURIHandler ealfURIHandler = new EAlfInUMLURIHandler(
					umlEditor.getEditorSite(), umlEditor.getEditingDomain(),
					umlResource);
			uriConverter.getURIHandlers().add(0, ealfURIHandler);
		}
	}
}

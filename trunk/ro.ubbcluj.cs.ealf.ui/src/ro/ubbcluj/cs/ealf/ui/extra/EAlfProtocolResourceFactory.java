package ro.ubbcluj.cs.ealf.ui.extra;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
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
		ResourceSet resourceSet = umlEditor.getEditingDomain().getResourceSet();
		URI umlResourceURI = EAlfUtil.getMainUMLURI(uri);
		UMLResource umlResource = (UMLResource) resourceSet.getResource(
				umlResourceURI, true);

		// for (Iterator<EObject> iterator = umlResource.getAllContents();
		// iterator
		// .hasNext();) {
		// EObject eobj = iterator.next();
		// System.out.println(umlResource.getURIFragment(eobj) + " " + eobj);
		// }

		EList<URIHandler> uriHandlers = resourceSet.getURIConverter()
				.getURIHandlers();
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
					umlEditor, umlResource);
			resourceSet.getURIConverter().getURIHandlers()
					.add(0, ealfURIHandler);
		}
		return xtextResource;
	}
}

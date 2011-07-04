package ro.ubbcluj.cs.ealf.ui.extra;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class EAlfXtextDocumentProvider extends XtextDocumentProvider {
	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument doc = null;
		// eventually delegates to setDocumentContent()
		doc = super.createDocument(element);
		return doc;
	}

	@Override
	protected boolean setDocumentContent(IDocument document,
			IEditorInput editorInput, String encoding) throws CoreException {
		if (editorInput instanceof EAlfEditorInput) {
			EAlfEditorInput ealfEditorInput = (EAlfEditorInput) editorInput;

			// create Xtext resource
			XtextResource xtextResource = (XtextResource) getResourceForEditorInputFactory()
					.createResource(editorInput);

			// create main UML resource in the same ResourceSet
			XtextResourceSet resourceSet = (XtextResourceSet) xtextResource
					.getResourceSet();
			UMLResource umlResource = (UMLResource) resourceSet.getResource(
					ealfEditorInput.getMainFileURI(), true);
			ealfEditorInput.setMainUMLResource(umlResource);

			// get the content for the Activity's Comment
			XtextDocument xtextDocument = (XtextDocument) document;
			Element umlElement = ealfEditorInput.getElement();
			if (umlElement instanceof Comment) {
				Comment comment = (Comment) umlElement;
				if (comment != null) {
					xtextDocument.set(comment.getBody());
				}
			}

			// load content into resource
			loadResource(xtextResource, xtextDocument.get(), encoding);
			xtextDocument.setInput(xtextResource);

			// register uri handler for other ealf references in UML resource
			registerURIHandler(resourceSet.getURIConverter(), umlResource);

			// EAlfUtil.visit(umlResource, umlResource.getContents());
			// for(umlResource.getAllContents())
			// EcoreUtil.resolveAll(resourceSet);
			EcoreUtil.resolveAll(umlResource);
			// EcoreUtil.resolveAll(umlResource.getContents().get(0));

			Element root = (Element) xtextResource.getContents().get(0);
			System.out.println(root.getOwner());
			if (root.getOwner() != null) {
				new EAlfUMLActivityOwnerListener().observe(xtextResource,
						root.getOwner());
			}
			return true;
		} else {
			return super.setDocumentContent(document, editorInput, encoding);
		}
	}

	private void registerURIHandler(URIConverter uriConverter,
			UMLResource umlResource) {
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
					umlResource);
			uriConverter.getURIHandlers().add(0, ealfURIHandler);
		}
	}

	/*
	 * @see AbstractDocumentProvider#doSaveDocument(IProgressMonitor, Object,
	 * IDocument, boolean)
	 */
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		System.out.println("EAlfXtextDocumentProvider.doSaveDocument()");
		if (element instanceof EAlfEditorInput) {
			EAlfEditorInput ealfEditorInput = (EAlfEditorInput) element;
			XtextDocument xtextDocument = (XtextDocument) document;
			String content = xtextDocument.get();
			Element umlElement = ealfEditorInput.getElement();
			if (umlElement instanceof Comment) {
				Comment comment = (Comment) umlElement;
				comment.setBody(content);
			}
			try {
				ealfEditorInput.getMainUMLResource().save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Saved in Comment for Activity");
		} else {
			super.doSaveDocument(monitor, element, document, overwrite);
		}
	}

	@Override
	public String getEncoding(Object element) {
		String encoding = super.getEncoding(element);
		if (encoding == null && element instanceof EAlfEditorInput) {
			try {
				EAlfEditorInput editorInput = (EAlfEditorInput) element;
				IFile file = editorInput.getFile();
				return file.getCharset();
			} catch (CoreException e) {
				throw new WrappedException(e);
			}
		}
		return encoding;
	}

}

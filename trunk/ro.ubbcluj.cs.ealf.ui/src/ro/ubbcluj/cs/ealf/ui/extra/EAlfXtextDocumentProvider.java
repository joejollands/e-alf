package ro.ubbcluj.cs.ealf.ui.extra;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.XtextResource;
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
			ResourceSet resourceSet = xtextResource.getResourceSet();
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

			return true;
		} else {
			return super.setDocumentContent(document, editorInput, encoding);
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
			if (umlElement instanceof Activity) {
				Comment comment = EAlfUtil
						.getCommentForActivity((Activity) umlElement);
				if (comment != null) {
					comment.setBody(content);
				}
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

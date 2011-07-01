package ro.ubbcluj.cs.ealf.ui.extra;

import java.io.ByteArrayInputStream;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;

public class EAlfXtextDocumentProvider extends XtextDocumentProvider {
	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument doc = null;
		doc = super.createDocument(element);

		// add document content from Comment

		// doc = createEmptyDocument();
		// InputStream is = null;
		// try {
		// java.net.URI uri = new java.net.URI("file:d:/test.drv");
		//
		// is = uri.toURL().openStream();
		// setDocumentContent(doc, is, getEncoding(element));
		// setupDocument(element, doc);
		// } catch (Exception ex) {
		// System.out.println(" MyDocumentProvider - createDocument :"
		// + ex.getMessage());
		// }
		return doc;
	}

	@Override
	protected boolean setDocumentContent(IDocument document,
			IEditorInput editorInput, String encoding) throws CoreException {
		if (editorInput instanceof EAlfEditorInput) {
			document.set("activity testFrom_setDocumentContent() {\n}");
			XtextDocument xtextDocument = (XtextDocument) document;
			XtextResource xtextResource = (XtextResource) getResourceForEditorInputFactory()
					.createResource(editorInput);
			loadResource(xtextResource, xtextDocument.get(), encoding);
			xtextDocument.setInput(xtextResource);
			return true;
		} else {
			return super.setDocumentContent(document, editorInput, encoding);
		}
		// boolean result = super.setDocumentContent(document, editorInput,
		// encoding);
		// if (result) {
		// XtextDocument xtextDocument = (XtextDocument) document;
		// XtextResource xtextResource = (XtextResource)
		// getResourceForEditorInputFactory()
		// .createResource(editorInput);
		// loadResource(xtextResource, xtextDocument.get(), encoding);
		// xtextDocument.setInput(xtextResource);
		// }
		// return result;
	}

	/*
	 * @see AbstractDocumentProvider#doSaveDocument(IProgressMonitor, Object,
	 * IDocument, boolean)
	 */
	protected void doSaveDocument(IProgressMonitor monitor, Object element,
			IDocument document, boolean overwrite) throws CoreException {
		if (element instanceof EAlfEditorInput) {
			System.out.println(document.get());
		} else {
			super.doSaveDocument(monitor, element, document, overwrite);
		}
	}

	protected void loadResource(XtextResource resource, String document,
			String encoding) throws CoreException {
		try {
			resource.load(new ByteArrayInputStream(document.getBytes()),
					Collections.singletonMap(XtextResource.OPTION_ENCODING,
							encoding));
		} catch (Exception ex) {
			ex.printStackTrace();
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

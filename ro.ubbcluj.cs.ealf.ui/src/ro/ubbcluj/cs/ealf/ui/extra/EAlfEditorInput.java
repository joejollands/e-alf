package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtext.resource.XtextResource;

public class EAlfEditorInput extends FileEditorInput {

	private URI mainFileURI = null;
	private URI elementURI;

	private XtextResource xtextResource;
	private UMLResource mainUMLResource;

	public EAlfEditorInput(URI mainFileURI, URI elementURI) {
		super(EAlfUtil.getIFileFromURI(mainFileURI));
		this.setElementURI(elementURI);
		this.setMainFileURI(mainFileURI);
	}

	/*
	 * (non-Javadoc) Method declared on IEditorInput.
	 */
	public String getName() {
		return elementURI.query() == null ? elementURI.lastSegment()
				: elementURI.lastSegment() + "#" + elementURI.query();
	}

	/*
	 * (non-Javadoc) Method declared on IEditorInput.
	 */
	public String getToolTipText() {
		return "EAlf - " + getName();
	}

	/*
	 * (non-Javadoc) Method declared on IEditorInput.
	 */
	@Override
	public boolean exists() {
		return super.exists();
	}

	/*
	 * (non-Javadoc) Method declared on IEditorInput.
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return super.getImageDescriptor();
	}

	/*
	 * (non-Javadoc) Method declared on IEditorInput.
	 */
	@Override
	public IPersistableElement getPersistable() {
		return this;
	}

	/*
	 * Allows for the return of an {@link IWorkbenchAdapter} adapter.
	 * 
	 * @since 3.5
	 * 
	 * @see org.eclipse.core.runtime.PlatformObject#getAdapter(java.lang.Class)
	 * 
	 * (non-Javadoc) Method declared on IAdaptable
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		return super.getAdapter(adapter);
	}

	/*
	 * (non-Javadoc) Method declared on IPersistableElement.
	 */
	@Override
	public void saveState(IMemento memento) {
		EAlfEditorInputFactory.saveState(memento, EAlfEditorInput.this);
	}

	/*
	 * (non-Javadoc) Method declared on IPersistableElement.
	 */
	@Override
	public String getFactoryId() {
		return EAlfEditorInputFactory.getFactoryId();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof EAlfEditorInput)) {
			return false;
		}
		EAlfEditorInput other = (EAlfEditorInput) obj;
		return getElementURI().equals(other.getElementURI());
	}

	@Override
	public int hashCode() {
		return getElementURI().hashCode();
	}

	@Override
	public String toString() {
		return getClass().getName() + "(" + getElementURI() + ")";
	}

	public void setElementURI(URI elementURI) {
		this.elementURI = elementURI;
	}

	public URI getElementURI() {
		return elementURI;
	}

	public URI getMainFileURI() {
		return mainFileURI;
	}

	public void setMainFileURI(URI mainFileURI) {
		this.mainFileURI = mainFileURI;
	}

	public Element getElement() {
		Element element = null;
		if (mainUMLResource != null) {
			element = (Element) mainUMLResource.getEObject(elementURI.query());
		}
		return element;
	}

	public XtextResource getXtextResource() {
		return xtextResource;
	}

	public void setXtextResource(XtextResource xtextResource) {
		this.xtextResource = xtextResource;
	}

	public UMLResource getMainUMLResource() {
		return mainUMLResource;
	}

	public void setMainUMLResource(UMLResource mainUMLResource) {
		this.mainUMLResource = mainUMLResource;
	}

}

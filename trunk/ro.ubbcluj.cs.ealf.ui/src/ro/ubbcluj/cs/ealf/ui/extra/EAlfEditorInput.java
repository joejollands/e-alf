package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.part.FileEditorInput;

public class EAlfEditorInput extends FileEditorInput {

	private URI elementURI;
	private String ownerFragment;

	public EAlfEditorInput(URI elementURI, String ownerFragment) {
		super(getIFileFromURI(elementURI));
		this.setElementURI(elementURI);
		this.setOwnerFragment(ownerFragment);
	}

	public static IFile getIFileFromURI(URI uri) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IFile file = root.getFile(new Path(uri.toPlatformString(true)));
		return file;
	}

	/*
	 * (non-Javadoc) Method declared on IEditorInput.
	 */
	public String getName() {
		return elementURI.fragment() == null ? elementURI.lastSegment()
				: elementURI.lastSegment() + "#" + elementURI.fragment();
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

	public void setOwnerFragment(String ownerFragment) {
		this.ownerFragment = ownerFragment;
	}

	public String getOwnerFragment() {
		return ownerFragment;
	}

}

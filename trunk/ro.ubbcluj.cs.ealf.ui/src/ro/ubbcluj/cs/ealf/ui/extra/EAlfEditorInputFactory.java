package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;

public class EAlfEditorInputFactory implements IElementFactory {

	/**
	 * Factory id. The workbench plug-in registers a factory by this name with
	 * the "org.eclipse.ui.elementFactories" extension point.
	 */
	private static final String ID_FACTORY = "ro.ubbcluj.cs.ealf.ui.extra.EAlfEditorInputFactory"; //$NON-NLS-1$

	/**
	 * Tag for the elementURI of the resource.
	 */
	private static final String TAG_ELEMENT_URI = "elementURI"; //$NON-NLS-1$

	/**
	 * Tag for the element's owner fragment of the resource.
	 */
	private static final String TAG_OWNER_FRAGMENT = "ownerFragment"; //$NON-NLS-1$

	/**
	 * Creates a new factory.
	 */
	public EAlfEditorInputFactory() {
	}

	/*
	 * (non-Javadoc) Method declared on IElementFactory.
	 */
	public IAdaptable createElement(IMemento memento) {
		// Get the file name.
		String elementURIString = memento.getString(TAG_ELEMENT_URI);
		String ownerFragment = memento.getString(TAG_OWNER_FRAGMENT);

		if (elementURIString == null || ownerFragment == null) {
			return null;
		}

		URI elementURI = URI.createURI(elementURIString);

		if (elementURI != null) {
			return new EAlfEditorInput(elementURI, ownerFragment);
		}
		return null;
	}

	/**
	 * Returns the element factory id for this class.
	 * 
	 * @return the element factory id
	 */
	public static String getFactoryId() {
		return ID_FACTORY;
	}

	/**
	 * Saves the state of the given file editor input into the given memento.
	 * 
	 * @param memento
	 *            the storage area for element state
	 * @param input
	 *            the file editor input
	 */
	public static void saveState(IMemento memento, EAlfEditorInput input) {
		IFile file = input.getFile();
		memento.putString(TAG_ELEMENT_URI, input.getElementURI().toString());
		memento.putString(TAG_OWNER_FRAGMENT, file.getFullPath().toString());
	}

}

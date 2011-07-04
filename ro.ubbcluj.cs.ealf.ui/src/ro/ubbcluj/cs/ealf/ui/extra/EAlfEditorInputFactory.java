package ro.ubbcluj.cs.ealf.ui.extra;

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
	 * Tag for the main resource uri.
	 */
	private static final String TAG_MAIN_FILE_URI = "mainFileURI"; //$NON-NLS-1$

	/**
	 * Creates a new factory.
	 */
	public EAlfEditorInputFactory() {
	}

	/*
	 * (non-Javadoc) Method declared on IElementFactory.
	 */
	public IAdaptable createElement(IMemento memento) {
		String mainFileURIString = memento.getString(TAG_MAIN_FILE_URI);
		String elementURIString = memento.getString(TAG_ELEMENT_URI);

		if (mainFileURIString == null || elementURIString == null) {
			return null;
		}

		URI mainFileURI = URI.createURI(mainFileURIString);
		URI elementURI = URI.createURI(elementURIString);

		if (elementURI != null) {
			return new EAlfEditorInput(mainFileURI, elementURI);
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
		memento.putString(TAG_MAIN_FILE_URI, input.getMainFileURI().toString());
		memento.putString(TAG_ELEMENT_URI, input.getElementURI().toString());
	}

}

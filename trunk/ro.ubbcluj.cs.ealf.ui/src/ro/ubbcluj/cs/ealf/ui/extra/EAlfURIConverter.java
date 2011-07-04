package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.xtext.resource.ClasspathUriResolutionException;
import org.eclipse.xtext.resource.ClasspathUriUtil;

public class EAlfURIConverter extends ExtensibleURIConverterImpl {

	private EAlfResourceSet eAlfResourceSet;

	public EAlfURIConverter(EAlfResourceSet eAlfResourceSet) {
		this.eAlfResourceSet = eAlfResourceSet;
	}

	/*
	 * (non-Javadoc)
	 * Similar to Xtext URIConverter:
	 * @see org.eclipse.xtext.resource.XTextResource.getURIConverter()
	 * anonymous new ExtensibleURIConverterImpl() { ... }
	 */
	@Override
	public URI normalize(URI uri) {
		if (ClasspathUriUtil.isClasspathUri(uri)) {
			URI result = eAlfResourceSet.getClasspathUriResolver().resolve(
					eAlfResourceSet.getClasspathURIContext(), uri);
			if (ClasspathUriUtil.isClasspathUri(result))
				throw new ClasspathUriResolutionException(result);
			result = super.normalize(result);
			return result;
		}
		return super.normalize(uri);
	}

	// @Override
	// public InputStream createInputStream(URI uri, Map<?, ?> options)
	// throws IOException {
	// System.out.println("EAlfURIConverter.createInputStream - " + uri);
	// if (uri.fileExtension().equals("uml") && uri.fragment() != null) {
	// // URI normalizedURI = normalize(uri);
	// return new ByteArrayInputStream(
	// "activity EAlfURIConverter(){\n}".getBytes());
	// } else {
	// System.out
	// .println("EAlfURIConverter.createInputStream - normal path");
	// return super.createInputStream(uri, options);
	// }
	// }
	//
	// @Override
	// public OutputStream createOutputStream(URI uri, Map<?, ?> options)
	// throws IOException {
	// System.out.println("EAlfURIConverter.createOutputStream - " + uri);
	// if (uri.fileExtension().equals("uml") && uri.fragment() != null) {
	// // URI normalizedURI = normalize(uri);
	// return System.out;
	// } else {
	// System.out
	// .println("EAlfURIConverter.createOutputStream - normal path");
	// return super.createOutputStream(uri, options);
	// }
	// }
}

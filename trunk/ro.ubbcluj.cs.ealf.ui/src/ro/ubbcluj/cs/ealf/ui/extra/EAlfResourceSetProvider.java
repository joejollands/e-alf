package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.util.JdtClasspathUriResolver;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class EAlfResourceSetProvider implements IResourceSetProvider {

	@Inject
	private Provider<EAlfResourceSet> resourceSetProvider;

	@Override
	public ResourceSet get(IProject project) {
		EAlfResourceSet set = resourceSetProvider.get();
		IJavaProject javaProject = JavaCore.create(project);
		if (javaProject != null && javaProject.exists()) {
			set.setClasspathURIContext(javaProject);
			set.setClasspathUriResolver(new JdtClasspathUriResolver());
		}
		return set;
	}

}

package ro.ubbcluj.cs.ealf.ui.extra;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.reconstr.impl.CrossReferenceSerializer;

public class EAlfCrossReferenceSerializer extends CrossReferenceSerializer {

	@Override
	public boolean equalsOrReplacesNode(EObject context,
			CrossReference crossref, EObject target, AbstractNode node) {
		// System.out.println("equalsOrReplacesNode " + context + " " + crossref
		// + " " + target + " " + node);
		boolean result = super.equalsOrReplacesNode(context, crossref, target,
				node);
		// System.out.println("equalsOrReplacesNode " + result);
		return result;
	}

	@Override
	public String serializeCrossRef(EObject context, CrossReference crossref,
			EObject target, AbstractNode node) {
		// System.out.println("serializeCrossRef " + context + " " + crossref
		// + " " + target + " " + node);
		String result = super
				.serializeCrossRef(context, crossref, target, node);
		if (result == null) {
			if (target instanceof NamedElement) {
				result = ((NamedElement) target).getName();
			}
		}
		// System.out.println("serializeCrossRef " + result);
		return result;
	}

}

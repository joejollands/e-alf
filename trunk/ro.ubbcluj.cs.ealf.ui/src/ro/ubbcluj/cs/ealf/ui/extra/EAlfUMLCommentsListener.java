package ro.ubbcluj.cs.ealf.ui.extra;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;

public class EAlfUMLCommentsListener extends AdapterImpl {

	private Map<Comment, URI> ealfURIs = new HashMap<Comment, URI>();

	public EAlfUMLCommentsListener() {
	}

	// start observing an element
	public void observeElement(Element element) {
		for (Adapter adapter : element.eAdapters()) {
			if (adapter instanceof EAlfUMLCommentsListener) {
				return;
			}
		}
		element.eAdapters().add(this);

		Resource umlResource = element.eResource();
		for (Comment comment : element.getOwnedComments()) {
			URI ealfURI = EAlfUtil.getEAlfURI(umlResource.getURI(),
					umlResource.getURIFragment(comment));
			ealfURIs.put(comment, ealfURI);
		}
	}

	public boolean isAdapterForType(Object type) {
		if (type.equals(Comment.class)) {
			return true;
		}
		return false;
	}

	// override the notifyChanged method
	public void notifyChanged(Notification n) {
		// System.out.println(n);
		Object notifier = n.getNotifier();
		if (notifier instanceof Model) {
			handleCommentNotification(n, (Model) notifier);
		}
	}

	private void handleCommentNotification(Notification n, Model notifier) {
		int featureID = n.getFeatureID(Element.class);
		if (featureID == UMLPackage.ELEMENT__OWNED_COMMENT) {
			if (n.getEventType() == Notification.ADD) {
				Resource umlResource = notifier.eResource();
				Comment comment = (Comment) n.getNewValue();
				URI ealfURI = EAlfUtil.getEAlfURI(umlResource.getURI(),
						umlResource.getURIFragment(comment));
				ealfURIs.put(comment, ealfURI);
			} else if (n.getEventType() == Notification.REMOVE) {
				Comment comment = (Comment) n.getOldValue();
				Resource umlResource = notifier.eResource();
				ResourceSet resourceSet = umlResource.getResourceSet();
				URI ealfURI = ealfURIs.remove(comment);
				Resource ealfResource = resourceSet.getResource(ealfURI, false);
				if (ealfResource != null) {
					ealfResource.getContents().clear();

					ealfResource.unload();
					resourceSet.getResources().remove(ealfResource);
				}
				System.out.println("Deleted Comment: " + comment.getBody());
			}
		}
	}
}

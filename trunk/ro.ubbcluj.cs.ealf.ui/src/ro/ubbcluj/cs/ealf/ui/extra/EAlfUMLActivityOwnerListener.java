package ro.ubbcluj.cs.ealf.ui.extra;

import java.util.Arrays;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.xtext.resource.XtextResource;

public class EAlfUMLActivityOwnerListener extends AdapterImpl {

	private BehavioredClassifier owner;

	public EAlfUMLActivityOwnerListener() {
	}

	// start observing an element
	public void observe(XtextResource resource, Element ownerElement) {
		this.owner = (BehavioredClassifier) ownerElement;
		for (Adapter adapter : resource.eAdapters()) {
			if (adapter instanceof EAlfUMLActivityOwnerListener) {
				return;
			}
		}
		resource.eAdapters().add(this);
	}

	public boolean isAdapterForType(Object type) {
		// if (type.equals(Activity.class)) {
		return true;
		// }
		// return false;
	}

	// override the notifyChanged method
	public void notifyChanged(Notification n) {
		System.out.println(n);
		Object notifier = n.getNotifier();
		if (notifier instanceof Resource) {
			handleResourceNotification(n, (Resource) notifier);
		}
	}

	private boolean cyclic = false;
	private int oldIndex = 0;

	private void handleResourceNotification(Notification n, Resource notifier) {
		if (!cyclic) {
			cyclic = true;
			Resource resource = (Resource) n.getNotifier();
			if (n.getEventType() == Notification.REMOVE) {
				Activity oldActivity = (Activity) n.getOldValue();
				oldIndex = owner.getOwnedBehaviors().indexOf(oldActivity);
				owner.getOwnedBehaviors().remove(oldActivity);
				System.out.println(oldActivity.eResource() + " "
						+ oldActivity.getOwner());
			} else if (n.getNewValue() instanceof Activity
					&& n.getEventType() == Notification.ADD) {
				// resolve added activity
				Adapter[] adapters = new Adapter[resource.eAdapters().size()];
				resource.eAdapters().toArray(adapters);
				resource.eAdapters().clear();

				try {
					Activity newActivity = (Activity) n.getNewValue();
					newActivity = (Activity) resource.getContents().get(0);
					System.out.println(newActivity.eResource() + " "
							+ newActivity.getOwner());
					resource.getContents().remove(newActivity);
					owner.getOwnedBehaviors().add(oldIndex, newActivity);
					oldIndex = 0;
					System.out.println(newActivity.eResource() + " "
							+ newActivity.getOwner());
					resource.getContents().add(newActivity);
					System.out.println(newActivity.eResource() + " "
							+ newActivity.getOwner());
					EcoreUtil.resolveAll(owner);
					System.out.println("Is resolved? - "
							+ newActivity.getOwner());
				} finally {
					resource.eAdapters().addAll(Arrays.asList(adapters));
				}
			} else if (n.getEventType() == Notification.REMOVE_MANY) {
				// Activity newActivity = (Activity)
				// resource.getContents().get(0);
				// System.out.println(newActivity.eResource() + " "
				// + newActivity.getOwner());
			}
		}
		cyclic = false;
	}
}

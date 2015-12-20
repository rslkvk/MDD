/*
* 
*/
package hochschuleemf.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import hochschuleemf.Fachbereich;
import hochschuleemf.Hochschule;
import hochschuleemf.Studiengang;
import hochschuleemf.diagram.edit.parts.FachbereichEditPart;
import hochschuleemf.diagram.edit.parts.FachbereichFachbereichStudiengangCompartmentEditPart;
import hochschuleemf.diagram.edit.parts.HochschuleEditPart;
import hochschuleemf.diagram.edit.parts.StudiengangEditPart;

/**
 * @generated
 */
public class HochschuleemfDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<HochschuleemfNodeDescriptor> getSemanticChildren(View view) {
		switch (HochschuleemfVisualIDRegistry.getVisualID(view)) {
		case HochschuleEditPart.VISUAL_ID:
			return getHochschule_1000SemanticChildren(view);
		case FachbereichFachbereichStudiengangCompartmentEditPart.VISUAL_ID:
			return getFachbereichFachbereichStudiengangCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HochschuleemfNodeDescriptor> getHochschule_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Hochschule modelElement = (Hochschule) view.getElement();
		LinkedList<HochschuleemfNodeDescriptor> result = new LinkedList<HochschuleemfNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFachbereich().iterator(); it.hasNext();) {
			Fachbereich childElement = (Fachbereich) it.next();
			int visualID = HochschuleemfVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == FachbereichEditPart.VISUAL_ID) {
				result.add(new HochschuleemfNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HochschuleemfNodeDescriptor> getFachbereichFachbereichStudiengangCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Fachbereich modelElement = (Fachbereich) containerView.getElement();
		LinkedList<HochschuleemfNodeDescriptor> result = new LinkedList<HochschuleemfNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStudiengang().iterator(); it.hasNext();) {
			Studiengang childElement = (Studiengang) it.next();
			int visualID = HochschuleemfVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StudiengangEditPart.VISUAL_ID) {
				result.add(new HochschuleemfNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<HochschuleemfLinkDescriptor> getContainedLinks(View view) {
		switch (HochschuleemfVisualIDRegistry.getVisualID(view)) {
		case HochschuleEditPart.VISUAL_ID:
			return getHochschule_1000ContainedLinks(view);
		case FachbereichEditPart.VISUAL_ID:
			return getFachbereich_2001ContainedLinks(view);
		case StudiengangEditPart.VISUAL_ID:
			return getStudiengang_3001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HochschuleemfLinkDescriptor> getIncomingLinks(View view) {
		switch (HochschuleemfVisualIDRegistry.getVisualID(view)) {
		case FachbereichEditPart.VISUAL_ID:
			return getFachbereich_2001IncomingLinks(view);
		case StudiengangEditPart.VISUAL_ID:
			return getStudiengang_3001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<HochschuleemfLinkDescriptor> getOutgoingLinks(View view) {
		switch (HochschuleemfVisualIDRegistry.getVisualID(view)) {
		case FachbereichEditPart.VISUAL_ID:
			return getFachbereich_2001OutgoingLinks(view);
		case StudiengangEditPart.VISUAL_ID:
			return getStudiengang_3001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HochschuleemfLinkDescriptor> getHochschule_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HochschuleemfLinkDescriptor> getFachbereich_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HochschuleemfLinkDescriptor> getStudiengang_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HochschuleemfLinkDescriptor> getFachbereich_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HochschuleemfLinkDescriptor> getStudiengang_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HochschuleemfLinkDescriptor> getFachbereich_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<HochschuleemfLinkDescriptor> getStudiengang_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<HochschuleemfNodeDescriptor> getSemanticChildren(View view) {
			return HochschuleemfDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HochschuleemfLinkDescriptor> getContainedLinks(View view) {
			return HochschuleemfDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HochschuleemfLinkDescriptor> getIncomingLinks(View view) {
			return HochschuleemfDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<HochschuleemfLinkDescriptor> getOutgoingLinks(View view) {
			return HochschuleemfDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
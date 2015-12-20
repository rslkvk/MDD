/*
* 
*/
package hochschuleemf.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import hochschuleemf.Hochschule;
import hochschuleemf.HochschuleemfPackage;
import hochschuleemf.diagram.edit.parts.FachbereichEditPart;
import hochschuleemf.diagram.edit.parts.FachbereichFachbereichStudiengangCompartmentEditPart;
import hochschuleemf.diagram.edit.parts.FachbereichNameEditPart;
import hochschuleemf.diagram.edit.parts.HochschuleEditPart;
import hochschuleemf.diagram.edit.parts.StudiengangEditPart;
import hochschuleemf.diagram.edit.parts.StudiengangNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class HochschuleemfVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "HochschuleEMF.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (HochschuleEditPart.MODEL_ID.equals(view.getType())) {
				return HochschuleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				HochschuleemfDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (HochschuleemfPackage.eINSTANCE.getHochschule().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((Hochschule) domainElement)) {
			return HochschuleEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getModelID(containerView);
		if (!HochschuleEditPart.MODEL_ID.equals(containerModelID) && !"hochschuleemf".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (HochschuleEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HochschuleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case HochschuleEditPart.VISUAL_ID:
			if (HochschuleemfPackage.eINSTANCE.getFachbereich().isSuperTypeOf(domainElement.eClass())) {
				return FachbereichEditPart.VISUAL_ID;
			}
			break;
		case FachbereichFachbereichStudiengangCompartmentEditPart.VISUAL_ID:
			if (HochschuleemfPackage.eINSTANCE.getStudiengang().isSuperTypeOf(domainElement.eClass())) {
				return StudiengangEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getModelID(containerView);
		if (!HochschuleEditPart.MODEL_ID.equals(containerModelID) && !"hochschuleemf".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (HochschuleEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HochschuleEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case HochschuleEditPart.VISUAL_ID:
			if (FachbereichEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FachbereichEditPart.VISUAL_ID:
			if (FachbereichNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FachbereichFachbereichStudiengangCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StudiengangEditPart.VISUAL_ID:
			if (StudiengangNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FachbereichFachbereichStudiengangCompartmentEditPart.VISUAL_ID:
			if (StudiengangEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(Hochschule element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case FachbereichFachbereichStudiengangCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case HochschuleEditPart.VISUAL_ID:
			return false;
		case StudiengangEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
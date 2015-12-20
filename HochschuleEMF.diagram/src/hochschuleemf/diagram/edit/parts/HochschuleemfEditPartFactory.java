/*
 * 
 */
package hochschuleemf.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry;

/**
 * @generated
 */
public class HochschuleemfEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (HochschuleemfVisualIDRegistry.getVisualID(view)) {

			case HochschuleEditPart.VISUAL_ID:
				return new HochschuleEditPart(view);

			case FachbereichEditPart.VISUAL_ID:
				return new FachbereichEditPart(view);

			case FachbereichNameEditPart.VISUAL_ID:
				return new FachbereichNameEditPart(view);

			case StudiengangEditPart.VISUAL_ID:
				return new StudiengangEditPart(view);

			case StudiengangNameEditPart.VISUAL_ID:
				return new StudiengangNameEditPart(view);

			case FachbereichFachbereichStudiengangCompartmentEditPart.VISUAL_ID:
				return new FachbereichFachbereichStudiengangCompartmentEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}

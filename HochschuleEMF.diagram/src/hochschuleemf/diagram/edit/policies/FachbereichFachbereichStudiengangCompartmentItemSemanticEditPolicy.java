/*
* 
*/
package hochschuleemf.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import hochschuleemf.diagram.edit.commands.StudiengangCreateCommand;
import hochschuleemf.diagram.providers.HochschuleemfElementTypes;

/**
 * @generated
 */
public class FachbereichFachbereichStudiengangCompartmentItemSemanticEditPolicy
		extends HochschuleemfBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FachbereichFachbereichStudiengangCompartmentItemSemanticEditPolicy() {
		super(HochschuleemfElementTypes.Fachbereich_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (HochschuleemfElementTypes.Studiengang_3001 == req.getElementType()) {
			return getGEFWrapper(new StudiengangCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

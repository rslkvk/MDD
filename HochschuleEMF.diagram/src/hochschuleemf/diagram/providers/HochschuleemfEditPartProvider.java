/*
 * 
 */
package hochschuleemf.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import hochschuleemf.diagram.edit.parts.HochschuleEditPart;
import hochschuleemf.diagram.edit.parts.HochschuleemfEditPartFactory;
import hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry;

/**
 * @generated
 */
public class HochschuleemfEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public HochschuleemfEditPartProvider() {
		super(new HochschuleemfEditPartFactory(), HochschuleemfVisualIDRegistry.TYPED_INSTANCE,
				HochschuleEditPart.MODEL_ID);
	}

}

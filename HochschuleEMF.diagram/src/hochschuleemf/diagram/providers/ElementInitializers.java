/*
 * 
 */
package hochschuleemf.diagram.providers;

import hochschuleemf.diagram.part.HochschuleemfDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = HochschuleemfDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			HochschuleemfDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}

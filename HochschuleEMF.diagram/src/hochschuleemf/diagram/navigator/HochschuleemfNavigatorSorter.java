/*
* 
*/
package hochschuleemf.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry;

/**
 * @generated
 */
public class HochschuleemfNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof HochschuleemfNavigatorItem) {
			HochschuleemfNavigatorItem item = (HochschuleemfNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return HochschuleemfVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

/*
* 
*/
package hochschuleemf.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import hochschuleemf.Hochschule;
import hochschuleemf.diagram.edit.parts.FachbereichEditPart;
import hochschuleemf.diagram.edit.parts.FachbereichNameEditPart;
import hochschuleemf.diagram.edit.parts.HochschuleEditPart;
import hochschuleemf.diagram.edit.parts.StudiengangEditPart;
import hochschuleemf.diagram.edit.parts.StudiengangNameEditPart;
import hochschuleemf.diagram.part.HochschuleemfDiagramEditorPlugin;
import hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry;
import hochschuleemf.diagram.providers.HochschuleemfElementTypes;
import hochschuleemf.diagram.providers.HochschuleemfParserProvider;

/**
 * @generated
 */
public class HochschuleemfNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		HochschuleemfDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		HochschuleemfDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof HochschuleemfNavigatorItem
				&& !isOwnView(((HochschuleemfNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof HochschuleemfNavigatorGroup) {
			HochschuleemfNavigatorGroup group = (HochschuleemfNavigatorGroup) element;
			return HochschuleemfDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof HochschuleemfNavigatorItem) {
			HochschuleemfNavigatorItem navigatorItem = (HochschuleemfNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (HochschuleemfVisualIDRegistry.getVisualID(view)) {
		case HochschuleEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/hochschule?Hochschule", //$NON-NLS-1$
					HochschuleemfElementTypes.Hochschule_1000);
		case FachbereichEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/hochschule?Fachbereich", //$NON-NLS-1$
					HochschuleemfElementTypes.Fachbereich_2001);
		case StudiengangEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/hochschule?Studiengang", //$NON-NLS-1$
					HochschuleemfElementTypes.Studiengang_3001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = HochschuleemfDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && HochschuleemfElementTypes.isKnownElementType(elementType)) {
			image = HochschuleemfElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof HochschuleemfNavigatorGroup) {
			HochschuleemfNavigatorGroup group = (HochschuleemfNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof HochschuleemfNavigatorItem) {
			HochschuleemfNavigatorItem navigatorItem = (HochschuleemfNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (HochschuleemfVisualIDRegistry.getVisualID(view)) {
		case HochschuleEditPart.VISUAL_ID:
			return getHochschule_1000Text(view);
		case FachbereichEditPart.VISUAL_ID:
			return getFachbereich_2001Text(view);
		case StudiengangEditPart.VISUAL_ID:
			return getStudiengang_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getHochschule_1000Text(View view) {
		Hochschule domainModelElement = (Hochschule) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			HochschuleemfDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFachbereich_2001Text(View view) {
		IParser parser = HochschuleemfParserProvider.getParser(HochschuleemfElementTypes.Fachbereich_2001,
				view.getElement() != null ? view.getElement() : view,
				HochschuleemfVisualIDRegistry.getType(FachbereichNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HochschuleemfDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStudiengang_3001Text(View view) {
		IParser parser = HochschuleemfParserProvider.getParser(HochschuleemfElementTypes.Studiengang_3001,
				view.getElement() != null ? view.getElement() : view,
				HochschuleemfVisualIDRegistry.getType(StudiengangNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			HochschuleemfDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return HochschuleEditPart.MODEL_ID.equals(HochschuleemfVisualIDRegistry.getModelID(view));
	}

}

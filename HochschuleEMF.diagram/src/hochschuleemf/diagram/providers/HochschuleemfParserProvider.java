/*
 * 
 */
package hochschuleemf.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import hochschuleemf.HochschuleemfPackage;
import hochschuleemf.diagram.edit.parts.FachbereichNameEditPart;
import hochschuleemf.diagram.edit.parts.StudiengangNameEditPart;
import hochschuleemf.diagram.parsers.MessageFormatParser;
import hochschuleemf.diagram.part.HochschuleemfVisualIDRegistry;

/**
 * @generated
 */
public class HochschuleemfParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser fachbereichName_5002Parser;

	/**
	* @generated
	*/
	private IParser getFachbereichName_5002Parser() {
		if (fachbereichName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { HochschuleemfPackage.eINSTANCE.getFachbereich_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fachbereichName_5002Parser = parser;
		}
		return fachbereichName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser studiengangName_5003Parser;

	/**
	* @generated
	*/
	private IParser getStudiengangName_5003Parser() {
		if (studiengangName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { HochschuleemfPackage.eINSTANCE.getStudiengang_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			studiengangName_5003Parser = parser;
		}
		return studiengangName_5003Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FachbereichNameEditPart.VISUAL_ID:
			return getFachbereichName_5002Parser();
		case StudiengangNameEditPart.VISUAL_ID:
			return getStudiengangName_5003Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(HochschuleemfVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(HochschuleemfVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (HochschuleemfElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

/*
 * 
 */
package hochschuleemf.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import hochschuleemf.diagram.providers.HochschuleemfElementTypes;

/**
 * @generated
 */
public class HochschuleemfPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createFachbereich1CreationTool());
		paletteContainer.add(createStudiengang2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createFachbereich1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Fachbereich1CreationTool_title,
				Messages.Fachbereich1CreationTool_desc,
				Collections.singletonList(HochschuleemfElementTypes.Fachbereich_2001));
		entry.setId("createFachbereich1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HochschuleemfElementTypes.getImageDescriptor(HochschuleemfElementTypes.Fachbereich_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStudiengang2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Studiengang2CreationTool_title,
				Messages.Studiengang2CreationTool_desc,
				Collections.singletonList(HochschuleemfElementTypes.Studiengang_3001));
		entry.setId("createStudiengang2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(HochschuleemfElementTypes.getImageDescriptor(HochschuleemfElementTypes.Studiengang_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
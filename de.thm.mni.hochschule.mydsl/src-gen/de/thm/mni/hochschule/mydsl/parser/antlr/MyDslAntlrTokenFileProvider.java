/*
 * generated by Xtext
 */
package de.thm.mni.hochschule.mydsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/thm/mni/hochschule/mydsl/parser/antlr/internal/InternalMyDsl.tokens");
	}
}
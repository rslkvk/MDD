/*
 * generated by Xtext
 */
package de.thm.mni.htmlgen.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.thm.mni.htmlgen.ui.internal.HTMLGenActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HTMLGenExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return HTMLGenActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return HTMLGenActivator.getInstance().getInjector(HTMLGenActivator.DE_THM_MNI_HTMLGEN_HTMLGEN);
	}
	
}
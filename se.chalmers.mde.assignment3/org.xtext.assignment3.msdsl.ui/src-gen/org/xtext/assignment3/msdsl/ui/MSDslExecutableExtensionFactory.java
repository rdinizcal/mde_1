/*
 * generated by Xtext 2.19.0
 */
package org.xtext.assignment3.msdsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.assignment3.msdsl.ui.internal.MsdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MSDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MsdslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MsdslActivator activator = MsdslActivator.getInstance();
		return activator != null ? activator.getInjector(MsdslActivator.ORG_XTEXT_ASSIGNMENT3_MSDSL_MSDSL) : null;
	}

}
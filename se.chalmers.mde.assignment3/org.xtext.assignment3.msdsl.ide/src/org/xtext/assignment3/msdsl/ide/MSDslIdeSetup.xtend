/*
 * generated by Xtext 2.19.0
 */
package org.xtext.assignment3.msdsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.assignment3.msdsl.MSDslRuntimeModule
import org.xtext.assignment3.msdsl.MSDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MSDslIdeSetup extends MSDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MSDslRuntimeModule, new MSDslIdeModule))
	}
	
}

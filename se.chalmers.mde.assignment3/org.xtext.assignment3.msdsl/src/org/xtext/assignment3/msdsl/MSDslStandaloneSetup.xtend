/*
 * generated by Xtext 2.19.0
 */
package org.xtext.assignment3.msdsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class MSDslStandaloneSetup extends MSDslStandaloneSetupGenerated {

	def static void doSetup() {
		new MSDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

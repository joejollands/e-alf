
package ro.ubbcluj.cs.ealf;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EAlfStandaloneSetup extends EAlfStandaloneSetupGenerated{

	public static void doSetup() {
		new EAlfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


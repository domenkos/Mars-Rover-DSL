/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robotFinal;

import org.xtext.robotFinal.MarsRoverStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MarsRoverStandaloneSetup extends MarsRoverStandaloneSetupGenerated {
  public static void doSetup() {
    new MarsRoverStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

package ieugen.java2days.greeting.api.impl;

import ieugen.java2days.greeting.api.Greeter;
import org.osgi.service.component.annotations.Component;


/**
 * Register this implementation in the OSGi Service Registry via Declarative Services annotation.
 *
 * Another option is to use Blueprint, or programmatic way via BundleActivator.
 */
@Component(service = Greeter.class,
    immediate = true,
    property = {"timeOfDay=evening"})
public class EveningGreeter implements Greeter {

  @Override
  public String greet(String name) {
    // good evening in Bulgarian according to Google Translate
    return "добър вечер " + name;
  }
}

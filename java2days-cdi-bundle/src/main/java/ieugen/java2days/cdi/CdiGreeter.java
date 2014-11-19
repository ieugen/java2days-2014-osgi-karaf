package ieugen.java2days.cdi;

public class CdiGreeter implements ieugen.java2days.greeting.api.Greeter {

  @Override
  public String greet(String name) {
    return "This is from CDI " + name;
  }
}

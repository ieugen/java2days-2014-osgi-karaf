package ieugen.java2days.greeting.api.impl;

import ieugen.java2days.greeting.api.Greeter;

public class MorningGreeter implements Greeter {
  @Override
  public String greet(String name) {
    return "Good morning " + name;
  }
}

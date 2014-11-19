package ieugen.java2days;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Option;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Command(scope = "greeting", name = "greet", description = "Greet someone")
@Service
public class GreetingCommand implements Action {

  @Option(name = "-t", aliases = {"--timeOfDay"}, description = "Time of day for the greeting", required = true, multiValued = false)
  private String timeOfDay;

  @Argument(name = "name", description = "Name of the person to greet", required = true, multiValued = false)
  private String nameToGreet;

  @Override
  public Object execute() throws Exception {
    System.out.println("Executing command: greeting ");
    System.out.println("Time of day option: " + timeOfDay);
    System.out.println("Name to greet: " + nameToGreet);

    return null;
  }
}

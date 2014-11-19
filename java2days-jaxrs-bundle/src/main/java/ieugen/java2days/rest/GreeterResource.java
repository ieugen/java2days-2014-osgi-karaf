package ieugen.java2days.rest;

import ieugen.java2days.greeting.api.Greeter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Component(service = GreeterResource.class, immediate = true)
@Path("/greet")
public class GreeterResource {

  private Greeter greeter;

  private Greeter morningGreeter;

  @Reference(service = Greeter.class, target = "(timeOfDay=evening)")
  public void setGreeter(Greeter greeter) {
    this.greeter = greeter;
  }

  @GET
  public Response greetByName(@QueryParam("name") String name) {
    return Response.ok(greeter.greet(name)).build();
  }

}

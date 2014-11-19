package ieugen.java2days.cdi;

import ieugen.java2days.greeting.api.Greeter;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@OsgiServiceProvider
@Path("/cdi-greet")
public class CdiExportedResource {

  @Inject
  private Greeter greeter;

  @GET
  public Response greetFromCdi(@QueryParam("name") String name) {
    return Response.ok(greeter.greet(name)).build();
  }

}

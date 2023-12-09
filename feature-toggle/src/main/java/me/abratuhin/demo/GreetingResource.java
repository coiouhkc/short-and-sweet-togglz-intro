package me.abratuhin.demo;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

  @Inject FeatureService featureService;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello(@QueryParam("name") String name) {
    if (featureService.isActive(Features.FEATURE_SAYMYNAME)) {
      return "Hello " + name;
    } else {
      return "Hello from RESTEasy Reactive";
    }
  }
}

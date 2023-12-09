package me.abratuhin.demo;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.util.Map;

@Path("/features")
public class FeaturesResource {

  @Inject FeatureService featureService;

  @GET
  public Map<Features, Boolean> getFeatures() {
    return featureService.getFeatures();
  }

  @POST
  @Path("/{feature}")
  public void setState(
      @PathParam("feature") Features features, @QueryParam("state") boolean state) {
    if (state) {
      featureService.activate(features);
    } else {
      featureService.deactivate(features);
    }
  }
}

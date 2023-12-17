package me.abratuhi.demo;

import io.getunleash.Unleash;
import io.quarkiverse.unleash.FeatureToggle;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {
    private static final String SAY_MY_NAME = "say-my-name";

    @Inject
    Unleash unleash;

    @FeatureToggle(name = SAY_MY_NAME)
    Instance<Boolean> myToggle;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name) {
        if (unleash.isEnabled(SAY_MY_NAME)) {
        //if (myToggle.get()) {
            return "hello " + name;
        } else {
            return "Hello from RESTEasy Reactive";
        }
    }
}

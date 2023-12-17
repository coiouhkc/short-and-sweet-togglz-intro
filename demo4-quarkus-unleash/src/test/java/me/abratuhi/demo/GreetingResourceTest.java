package me.abratuhi.demo;

import io.getunleash.Unleash;
import io.quarkiverse.unleash.InjectUnleash;
import io.quarkiverse.unleash.InjectUnleashAdmin;
import io.quarkiverse.unleash.UnleashAdmin;
import io.quarkiverse.unleash.UnleashTestResource;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
@QuarkusTestResource(UnleashTestResource.class)
class GreetingResourceTest {
    @InjectUnleashAdmin
    UnleashAdmin admin;

    @InjectUnleash
    Unleash client;

    @Test
    public void test() {

        admin.toggleOff("toggle-1");
        admin.toggleOn("toggle-2");

        // wait for client change
        await().atLeast(12, SECONDS)
                .pollInterval(4, SECONDS)
                .until(() -> client.isEnabled("toggle-2"));

        boolean toggleOn = client.isEnabled("toggle-2");

        assertTrue(toggleOn);

    }

    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello from RESTEasy Reactive"));
    }

}
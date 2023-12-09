package me.abratuhin.demo;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {
  @Test
  void testHelloEndpoint() {
    given().when().get("/features").then().statusCode(200).body(is("{FEATURE_SAYMYNAME=true}"));
    given().when().get("/hello?name=Moto").then().statusCode(200).body(is("Hello Moto"));
    given().when().post("/features/FEATURE_SAYMYNAME?state=false").then().statusCode(204);
    given().when().get("/features").then().statusCode(200).body(is("{FEATURE_SAYMYNAME=false}"));
    given().when().get("/hello").then().statusCode(200).body(is("Hello from RESTEasy Reactive"));
  }
}

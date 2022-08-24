import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class InitialTest {

    @Test
    void testGet() {
        given()
                .baseUri("http://localhost:8080/public/v2")
                .header("Authorization", String.format("Bearer %s", "85c048a440d02dfb525a8665af6503792e0408f3a277e464ace91f182691648e"))
                .when().get("/users")
                .then().log().all()
                .statusCode(200);
    }

    @Test
    void testGetExact() {
        given()
                .baseUri("http://localhost:8080/public/v2")
                .header("Authorization", String.format("Bearer %s", "85c048a440d02dfb525a8665af6503792e0408f3a277e464ace91f182691648e"))
                .pathParam("id", 2436)
                .when().get("/users/{id}")
                .then().log().all()
                .statusCode(200);
    }

    @Test
    void testPost() {
        String json = "{" +
                "\"name\":\"Roman\"," +
                "\"email\":\"some@epam.com\"," +
                "\"status\":\"active\"," +
                "\"gender\":\"male\"" +
                "}";

        given()
                .baseUri("http://localhost:8080/public/v2")
                .header("Authorization", String.format("Bearer %s", "85c048a440d02dfb525a8665af6503792e0408f3a277e464ace91f182691648e"))
                .body(json)
                .when().post("/users")
                .then().log().all()
                .statusCode(201);
    }
}
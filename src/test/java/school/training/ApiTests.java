package school.training;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static java.util.Objects.requireNonNull;

public class ApiTests {

    public static final String TOKEN_HEADER_NAME = "Authorization";

    @Test
    void getUserInfo_authenticated_200() {
        String email = requireNonNull(System.getenv("API_EMAIL"), "set API_EMAIL environment variable");
        String password = requireNonNull(System.getenv("API_PASSWORD"), "set API_PASSWORD environment variable");
        String accessToken = getAccessToken(email, password);

        given(defaultApiSettings())
                .basePath("/users/me")
                .header(TOKEN_HEADER_NAME, String.format("Bearer %s", accessToken))

                .when()
                .get()

                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    void getUserInfo_unauthenticated_401() { // it is easy to create next cases
        given(defaultApiSettings())
                .basePath("/users/me")

                .when()
                .get()

                .then()
                .statusCode(401);
    }

    private RequestSpecification defaultApiSettings() {
        return given()
                .baseUri("https://api.practicesoftwaretesting.com")
                .contentType("application/json");
    }

    private String getAccessToken(String email, String password) {
        return given(defaultApiSettings())
                .basePath("users/login")
                .body(Map.of(
                        "email", email,
                        "password", password))

                .when()
                .post()

                .then()
                .statusCode(200)
                .extract().path("access_token");
    }
}

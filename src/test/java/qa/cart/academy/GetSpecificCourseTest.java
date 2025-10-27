package qa.cart.academy;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSpecificCourseTest {
    @Test
    public void GetCourseWithHeaderMethod() {
        given()
                .baseUri("https://todo.qacart.com")
                .header("language", "JAVA")
        .when()
                .get("/api/v1/info/courses")
        .then()
                .log().all()
                .assertThat().statusCode(200);
    }
}

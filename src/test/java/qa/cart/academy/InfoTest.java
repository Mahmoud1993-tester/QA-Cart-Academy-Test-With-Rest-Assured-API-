package qa.cart.academy;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class InfoTest {

    @Test
    public void ableToGetCoursesInfo() {
        given()
                .baseUri("https://todo.qacart.com")
        .when()
                .get("/api/v1/info/courses")
        .then()
                .log().all()
               .assertThat().statusCode(200);
    }
}

package qa.cart.academy;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetAllLecturesTest {

    @Test
    public void GetLecturesData() {
        given()
                .baseUri("https://todo.qacart.com")
                .queryParam("type", "PAID")
                .log().all()
        .when()
                .get("/api/v1/info/lectures")
        .then()
                .log().all()
                .assertThat().statusCode(200);
    }
}

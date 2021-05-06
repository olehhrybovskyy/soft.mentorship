package soft.mentorship.firstApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test(priority = 1, description = "user create test")
    public void userCreateTest() {
        String response = RestAssured.given()
                .baseUri(baseUrl)
                .basePath("/users")
                .accept(ContentType.JSON)
                .body("{\n" +
                        "\"name\": \"Maccalan\",\n" +
                        "\"username\": \"Macan\",\n" +
                        "\"email\": \"emailTest@gmail.com\",\n" +
                        "}")
                .when().post()
                .then().extract().response()
                .toString();

    }

//    "name": "", "username": "","email": "","address":
//    { "street": "", "suite": "", "city": "",
//            "zipcode": ""},
//            "phone": "","website": "","company":
//    { "name": "", "catchPhrase": "", "bs": "" }}2.
//        Verify user creation

}

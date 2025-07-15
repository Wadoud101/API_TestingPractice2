import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C02_GetRequestResponseData {


    @Test
    public void test02(){

        String url = "https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);

        System.out.println("Status code: " + response.statusCode() +
                            "\nContent Type: " + response.contentType() +
                            "\nServer Header: " + response.getHeader("Server"));

        response.prettyPeek();

    }
}

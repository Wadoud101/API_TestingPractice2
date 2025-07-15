import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class C01_GetResponse {

    @Test
    public void getResponse(){

        String url = "https://restful-booker.herokuapp.com/booking/10";

        Response response = given().when().get(url);
        response.prettyPrint();
        System.out.println("------------------------");
        response.prettyPeek();

    }
}

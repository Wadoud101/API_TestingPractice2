import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.awt.geom.RectangularShape;

import static io.restassured.RestAssured.given;

public class C07_GetResponseBodyTest {

    @Test
    public void test01(){

        String url = "https://jsonplaceholder.typicode.com/posts/44";

        Response response = given().when().get(url);

        //response.prettyPrint();
        response.then().assertThat().statusCode(200).contentType(ContentType.JSON);
        response.then().assertThat().body("userId",Matchers.equalTo(5));
    }
}

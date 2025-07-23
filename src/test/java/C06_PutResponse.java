import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C06_PutResponse {

    private static final Log log = LogFactory.getLog(C06_PutResponse.class);

    @Test
    public void test01(){

        JSONObject object = new JSONObject();

        object.put("title","Wadoud");
        object.put("body","Breakfast");
        object.put("userId","55000");
        object.put("id","101");

        String url = "https://jsonplaceholder.typicode.com/posts/70";

        Response response = given().contentType(ContentType.JSON)
                            .when().body(object.toString())
                            .put(url);

        response.prettyPrint();

        response.then().assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .statusLine("HTTP/1.1 200 OK");

    }

}

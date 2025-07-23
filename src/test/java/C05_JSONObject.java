import org.json.JSONObject;
import org.junit.Test;

public class C05_JSONObject {

    @Test
    public void test01(){

        /* {
            "firstname":"Jim",
            "additionalneeds":"Breakfast",
            "bookingdates":{
                "checkin":"2018-01-01",
                "checkout":"2019-01-01"
            },
            "totalprice":111,
            "depositpaid":true,
            "lastname":"Brown"
        */

        JSONObject innerObject = new JSONObject();

        innerObject.put("checkin","2018-01-01");
        innerObject.put("checkout","2019-01-01");

        JSONObject object = new JSONObject();

        object.put("firstname","Wadoud");
        object.put("additionalneeds","Breakfast");
        object.put("bookingdate",innerObject);
        object.put("totalprice","55000");
        object.put("lastname","mukhlis");

        System.out.println(object);

    }
}

import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.junit.Test;

public class C04_SendBody {

    @Test
    public void test01(){

        JSONObject object1 = new JSONObject();

        object1.put("title","Wadoud");
        object1.put("body","Mukhis");
        object1.put("userId",5);

        System.out.println(object1);


    }
}

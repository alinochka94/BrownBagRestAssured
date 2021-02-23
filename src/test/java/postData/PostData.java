package postData;

import baseclass.BaseClass;
import io.restassured.http.Method;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostData extends BaseClass {

    @Test
    void createUser (){

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("email", "alina.vrublevska@accenture.com");
        jsonObject.put("name", "Alina_Vrublevska");
        jsonObject.put("phone", "+371 22352028");
        jsonObject.put("userName", "alina.vrublevska");
        jsonObject.put("website", "https://my.accenture.lv/users/alina_vrublevska");

        httpRequest.header("content-Type", "application/json");
        httpRequest.body(jsonObject.toString());
        response = httpRequest.request(Method.POST,properties.getProperty("postData"));
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,201);
    }

}

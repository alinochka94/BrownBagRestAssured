package updateData;

import baseclass.BaseClass;
import io.restassured.http.Method;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateData extends BaseClass {

    @Test
    void updateUserData() {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("street", "Lokomotives");
        jsonObject.put("suite", "48");
        jsonObject.put("city", "Riga");
        jsonObject.put("zipCode", "LV-1057");

        httpRequest.header("content-Type", "application/json");
        httpRequest.body(jsonObject.toJSONString());
        response = httpRequest.request(Method.PUT ,properties.getProperty("updateRecord"));
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,204);
    }

}

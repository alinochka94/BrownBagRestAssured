package simpleGetTest;

import baseclass.BaseClass;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleGetTest extends BaseClass {

    @Test
    void requestToServer()
    {
        response = httpRequest.request(Method.GET, properties.getProperty("getAllUser"));
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);
    }

    @Test
    void responseValidation() {
        JsonPath jsonPath = response.jsonPath();
        String validateName = jsonPath.get("name").toString();
        Assert.assertEquals(validateName.contains("Alina"),true);
    }

}

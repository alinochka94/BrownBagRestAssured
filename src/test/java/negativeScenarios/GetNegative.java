package negativeScenarios;

import baseclass.BaseClass;
import io.restassured.http.Method;
import org.junit.Test;
import org.testng.Assert;

public class GetNegative extends BaseClass {

    @Test
    void requestToServer()
    {
        response = httpRequest.request(Method.GET, properties.getProperty("getNegative"));
        int statusCode = response.getStatusCode();
        Assert.assertNotEquals(statusCode,200);
    }

}

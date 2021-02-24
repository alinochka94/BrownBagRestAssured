package negativeScenarios;

import baseclass.BaseClass;
import io.restassured.http.Method;
import org.junit.Test;
import org.testng.Assert;

public class DeteleNegative extends BaseClass {

    @Test
    void deleteNegative()
    {
        response = httpRequest.request(Method.DELETE, properties.getProperty("deleteNegative"));
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,404);
    }

}

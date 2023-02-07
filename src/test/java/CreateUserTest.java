import api.clients.UserClient;
import models.UserRequest;
import models.UserResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateUserTest {

    @Test
    public void createUser() {
        UserClient client = new UserClient();
        UserRequest requestBody = new UserRequest(0,
                "MaryK",
                "Mary",
                "Kul",
                "m@gmail.example",
                "meryTester",
                "0000000000",
                0);
        UserResponse response = client.createUser(requestBody);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getCode(), 200);
        softAssert.assertEquals(response.getMessage(), "ok");
    }
}
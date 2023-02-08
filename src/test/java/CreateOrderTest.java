import api.clients.StoreClient;
import models.StoreRequest;
import models.StoreResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateOrderTest {

    @Test
    public void createOrder() {
        StoreClient client = new StoreClient();
        StoreRequest requestBody = new StoreRequest(
                0,
                5,
                1,
                "02122023",
                "prepare",
                true);
        StoreResponse response = client.placeAnOrderForAPet(requestBody);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getPetId(), 5);
        softAssert.assertEquals(response.getCode(), 200);
        System.out.println(response.getId());
    }
}

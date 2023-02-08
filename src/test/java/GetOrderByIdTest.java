import api.clients.StoreClient;
import models.StoreResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetOrderByIdTest {

    @Test
    public void getPetById() {
        StoreClient client = new StoreClient();
        StoreResponse response = client.findOrderById(9223372036854776E18);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getId(), 9223372036854776E18);
        softAssert.assertEquals(response.getCode(), 200);
        softAssert.assertEquals(response.getPetId(), 5);
    }
}

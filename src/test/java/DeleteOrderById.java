import api.clients.StoreClient;
import models.StoreResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteOrderById {

    @Test
    public void deleteOrderById() {
        StoreClient client = new StoreClient();
        StoreResponse response = client.deleteOrderById(9223372036854776E18);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getCode(), 200);
        StoreResponse checkIfDeleted = client.findOrderById(9223372036854776E18);
        softAssert.assertEquals(response.getCode(), 404);
    }
}

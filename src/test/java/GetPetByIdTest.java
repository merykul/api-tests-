import api.clients.PetClient;
import models.PetRequest;
import models.PetResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetPetByIdTest {
    @Test
    public void getPetById() {
        PetClient client = new PetClient();
        PetResponse response = client.getPetById(0);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getName(), "Patron");
        softAssert.assertEquals(response.getStatus(), "available");
    }
}

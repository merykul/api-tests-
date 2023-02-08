import api.clients.PetClient;
import models.PetRequest;
import models.PetResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UpdatePetTest {
    @Test
    public void updatePet() {
        PetClient client = new PetClient();
        PetRequest requestBody = new PetRequest(
                "Patron",
                "available");
        PetResponse response = client.updatePet(requestBody);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getName(), "Patron");
        softAssert.assertEquals(response.getStatus(), "available");
    }
}
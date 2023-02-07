import api.clients.PetClient;
import models.PetRequest;
import models.PetResponse;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreatePetTest {

    @Test
    public void createPet() {
        PetClient client = new PetClient();
        PetRequest requestBody = new PetRequest(
                "Bob",
                "available");
        PetResponse response = client.createPet(requestBody);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(response.getStatus(), 200);
        softAssert.assertEquals(response.getName(), "Bob");
        softAssert.assertEquals(response.getStatus(), "available");
    }
}

package api.clients;

import io.restassured.response.Response;
import models.PetRequest;
import models.PetResponse;

public class PetClient extends BaseClient{
    public PetClient() {
        super();
    }

    public PetResponse createPet(PetRequest requestBody) {
        Response response = prepareRequest()
                .body(requestBody)
                .when()
                .post(baseUrl + "/pet");
        PetResponse petResponse = response.as(PetResponse.class);
        return petResponse;
    }
}

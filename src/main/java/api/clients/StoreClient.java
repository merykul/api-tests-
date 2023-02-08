package api.clients;

import io.restassured.response.Response;
import models.StoreRequest;
import models.StoreResponse;

public class StoreClient extends BaseClient{
    public StoreClient() {
        super();
    }

    public StoreResponse placeAnOrderForAPet(StoreRequest requestBody) {
        Response response = prepareRequest()
                .body(requestBody)
                .when()
                .post(baseUrl + "/store/order");
        StoreResponse storeResponse = response.as(StoreResponse.class);
        return storeResponse;
    }

    public StoreResponse findOrderById(double orderId) {
        Response response = prepareRequest()
                .when()
                .get(baseUrl + "/store/order" + orderId);
        StoreResponse storeResponse = response.as(StoreResponse.class);
        return storeResponse;
    }

    public StoreResponse deleteOrderById(double orderId) {
        Response response = prepareRequest()
                .when()
                .delete(baseUrl + "/store/order" + orderId);
        StoreResponse storeResponse = response.as(StoreResponse.class);
        return storeResponse;
    }
}

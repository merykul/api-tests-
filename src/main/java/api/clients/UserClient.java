package api.clients;

import io.restassured.response.Response;
import models.UserRequest;
import models.UserResponse;

public class UserClient extends BaseClient {
    public UserClient() {
        super();
    }

    public UserResponse createUser(UserRequest data) {
        Response response =  prepareRequest()
                .body(data)
                .when()
                .post(baseUrl + "/user");
        UserResponse userResponse = response.as(UserResponse.class);
        return userResponse;
    }
}

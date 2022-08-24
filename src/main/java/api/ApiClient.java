package api;

import api.request.BaseRequest;
import config.FrameworkConfig;
import controllers.UsersController;
import io.restassured.response.ValidatableResponse;
import models.domain.User;

public class ApiClient {
    private User user;

    public UsersController users;

    public ApiClient(User user) {
        this.user = user;
        users = new UsersController(this);
    }

    public ValidatableResponse execute(BaseRequest request) {
        addDefaultHeaders(request);
        authorize(request);
        return request.execute();
    }

    private void addDefaultHeaders(BaseRequest request) {
        request.headers.put("Content-Type", "application/json");
    }

    private void authorize(BaseRequest request) {
        if (this.user.getToken() != null) {
            request.headers.put("Authorization", String.format("Bearer %s", FrameworkConfig.token));
        }
    }

    public User getUser() {
        return this.user;
    }
}
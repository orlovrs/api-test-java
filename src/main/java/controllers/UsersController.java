package controllers;

import api.ApiClient;
import api.request.users.GetUser;
import api.request.users.GetUsers;
import api.request.users.PostUsers;
import io.restassured.response.ValidatableResponse;
import models.dtos.PostUserDto;
import models.mappers.UsersMapper;

public class UsersController {

    ApiClient client;

    public UsersController(ApiClient client) {
        this.client = client;
    }

    public ValidatableResponse getList() {
        return client.execute(new GetUsers());
    }

    public ValidatableResponse getExact(int id) {
        return client.execute(new GetUser(id));
    }

    public ValidatableResponse create() {
        PostUserDto dto = UsersMapper.map(client.getUser(), PostUserDto.class);

        return new PostUsers(dto).execute();
    }
}

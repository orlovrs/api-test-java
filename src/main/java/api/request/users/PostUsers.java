package api.request.users;

import api.request.BaseRequest;
import models.dtos.PostUserDto;

public class PostUsers extends BaseRequest {
    public PostUsers(PostUserDto dto) {
        method = "POST";
        url = "/users";
        body = dto;
    }
}

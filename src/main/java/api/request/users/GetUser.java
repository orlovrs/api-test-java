package api.request.users;

import api.request.BaseRequest;

public class GetUser extends BaseRequest {

    public GetUser(int id) {
        super();
        method = "GET";
        url = "/users/{id}";
        pathParams.put("id", String.valueOf(id));
    }
}

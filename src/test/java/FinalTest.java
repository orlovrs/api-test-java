import api.ApiClient;
import models.domain.User;
import models.domain.UserManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FinalTest {

    User roman;
    ApiClient client;

    @BeforeEach
    void setup() {
        roman = UserManager.getRoman();
        client = new ApiClient(roman);
    }

    @Test
    void testGet() {
        client.users.getList()
                .statusCode(200);
    }

    @Test
    void testGetExact() {
        client.users.getExact(2436)
                .statusCode(200);
    }

    @Test
    void testPost() {
        client.users.create()
                .statusCode(201);
    }
}
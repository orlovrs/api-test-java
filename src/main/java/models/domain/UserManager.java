package models.domain;

import config.FrameworkConfig;

public class UserManager {

    public static User getRoman() {
        return new UserBuilder()
                .setId(2436)
                .setName("Roman")
                .setEmail("some@epam.com")
                .setStatus("active")
                .setGender("male")
                .setToken(FrameworkConfig.token)
                .build();
    }
}

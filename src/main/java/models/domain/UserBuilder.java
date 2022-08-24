package models.domain;

public class UserBuilder {
    private User user;
    
    public UserBuilder() {
        user = new User();
    }

    public UserBuilder setId(int id) {
        user.setId(id);
        return this;
    }

    public UserBuilder setName(String name) {
        user.setName(name);
        return this;
    }

    public UserBuilder setEmail(String email) {
        user.setEmail(email);
        return this;
    }


    public UserBuilder setStatus(String status) {
        user.setStatus(status);
        return this;
    }

    public UserBuilder setGender(String gender) {
        user.setGender(gender);
        return this;
    }

    public UserBuilder setToken(String token) {
        user.setToken(token);
        return this;
    }

    public User build() {
        return user;
    }
}

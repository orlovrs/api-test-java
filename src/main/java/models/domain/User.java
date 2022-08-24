package models.domain;

import lombok.Data;

@Data
public class User {
    int id;
    String name;
    String email;
    String status;
    String gender;
    String token;
}
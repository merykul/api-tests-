package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {
    private double code;
    private String type;
    private String message;
    public UserResponse() {

    }
}

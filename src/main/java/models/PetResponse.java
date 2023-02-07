package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetResponse {
    private double id;
    private String name;
    private String status;
    private String[] photoUrls;
    private String[] tags;
    private int code;
    private String type;
    private String message;

    public PetResponse() {

    }
}

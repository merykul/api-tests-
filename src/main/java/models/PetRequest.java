package models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetRequest {
    private String name;
    private String status;
}
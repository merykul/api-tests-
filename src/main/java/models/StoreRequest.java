package models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreRequest {
    private double id;
    private double petId;
    private double quantity;
    private String shipDate;
    private String status;
    private boolean complete;
}

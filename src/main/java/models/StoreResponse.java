package models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreResponse {
    private double id;
    private double petId;
    private double quantity;
    private String shipDate;
    private String status;
    private boolean complete;
    private int code;
    private String type;
    private String message;
    public StoreResponse() {

    }
}

package ie.atu.ooplab4.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calorie {
    private long id;
    @NotBlank(message = "Item name required")
    private String item;
    @Positive(message = "Calorie must be greater than 0")
    private int cal;
}

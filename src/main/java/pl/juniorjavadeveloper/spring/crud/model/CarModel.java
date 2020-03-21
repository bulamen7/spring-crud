package pl.juniorjavadeveloper.spring.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarModel {
    private String name;
    private String model;
    private BigDecimal price;
}

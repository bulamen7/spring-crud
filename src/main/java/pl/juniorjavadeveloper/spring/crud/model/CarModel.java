package pl.juniorjavadeveloper.spring.crud.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CarModel {
    private String name;
    private String model;
    private BigDecimal price;
}

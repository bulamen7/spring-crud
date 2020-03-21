package pl.juniorjavadeveloper.spring.crud.dao.entity;

import java.math.BigDecimal;


public class CarEntity {
    private String name;
    private String model;
    private BigDecimal price;
    
    public CarEntity() {
    }
    
    public CarEntity(String name, String model, BigDecimal price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "CarEntity{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

package pl.juniorjavadeveloper.spring.crud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.juniorjavadeveloper.spring.crud.model.CarModel;

@Service
public class CarService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CarService.class.getName());
    
    public CarModel create(CarModel carModel) {
        
        return null;
    }
    
    public CarModel read(Long id) {
        LOGGER.info("Reading");
        return null;
    }
    
    public CarModel update(Long id, CarModel carModel) {
        
        return null;
    }
    
    public CarModel delete(Long id) {
        
        return null;
    }
}

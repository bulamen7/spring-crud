package pl.juniorjavadeveloper.spring.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.juniorjavadeveloper.spring.crud.service.CarService;

@Controller
@RequestMapping("/cars/workshop")
//http://localhost:8080/cars/workshop
public class CarController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CarController.class.getName());
    private CarService carService;
    
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @GetMapping("/car")
    //http://localhost:8080/cars/workshop/car
    public String read(Long id) {
        LOGGER.info("Reading Car data...");
        carService.read(id);
        return "car-details";
        
    }
}

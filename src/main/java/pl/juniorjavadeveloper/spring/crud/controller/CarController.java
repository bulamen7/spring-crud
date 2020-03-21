package pl.juniorjavadeveloper.spring.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.juniorjavadeveloper.spring.crud.model.CarModel;
import pl.juniorjavadeveloper.spring.crud.service.CarService;

@Controller
@RequestMapping("/cars/workshop")
public class CarController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CarController.class.getName());
    private CarService carService;
 
    
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @PostMapping("/car")
    public String create(CarModel carModel) {
        LOGGER.info("creating Car data");
        carService.create(carModel);
        return "car-details";
    }
    
    @GetMapping("/car")
    public String read(Long id) {
        LOGGER.info("Reading Car data");
        carService.read(id);
        return "car-details";
    }
    
    @PutMapping("/car")
    public String update(Long id, CarModel carModel) {
        LOGGER.info("updating Car data");
        carService.update(id, carModel);
        return "car-details";
    }
    
    @DeleteMapping("/car")
    public String delete(Long id) {
        LOGGER.info("deleting car data");
        carService.delete(id);
        return "car-details";
    }
}
//TODO DOKONMCZYC IMPLEMENTACJE CONTROLLERA
package pl.juniorjavadeveloper.spring.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.juniorjavadeveloper.spring.crud.model.CarModel;
import pl.juniorjavadeveloper.spring.crud.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CarController.class.getName());
    private CarService carService;
    
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @PostMapping
    public String create(
            @RequestBody CarModel carModel) {  //SERIALIZACJA
        LOGGER.info("creating Car data: " + carModel);
        carService.create(carModel);
        return "car-details";
    }
    
    @GetMapping("/{id}")
    @ResponseBody//DESERIALIZACJA
    // public String read(@PathVariable("id") Long id){
    public CarModel read(@PathVariable("id") Long id) {
        LOGGER.info("Reading Car data: " + id);
        return carService.read(id);//DESERIALIZACJA
        
        //return "car-details";
    }
    
    @PutMapping
    public String update(Long id, CarModel carModel) {
        LOGGER.info("updating Car data");
        carService.update(id, carModel);
        return "car-details";
    }
    
    @DeleteMapping
    public String delete(Long id) {
        LOGGER.info("deleting car data");
        carService.delete(id);
        return "car-details";
    }
}
//TODO DOKONMCZYC IMPLEMENTACJE CONTROLLERA
//TODO http://localhost:9090/cars?id=1&name=Opel
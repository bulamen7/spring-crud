package pl.juniorjavadeveloper.spring.crud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.juniorjavadeveloper.spring.crud.model.CarModel;

@Controller
//@RestController
@RequestMapping("/car-service")
public class CarController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarController.class.getName());

    @GetMapping("/car")
    @ResponseBody
//    public String read(Long id) {
    public CarModel read(Long id) {
        LOGGER.info("Reading Car data...");
//        return "car-details";
        return new CarModel();
    }
}

package pl.juniorjavadeveloper.spring.crud.service.mapper;

import org.springframework.stereotype.Component;
import pl.juniorjavadeveloper.spring.crud.dao.entity.CarEntity;
import pl.juniorjavadeveloper.spring.crud.model.CarModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarMapper {
    
    public CarEntity fromModelToEntity(CarModel carModel) {
        CarEntity carEntity = new CarEntity();
        
        carEntity.setModel(carModel.getModel());
        carEntity.setName(carModel.getName());
        carEntity.setPrice(carModel.getPrice());
        
        return carEntity;
    }
    
    public CarModel fromEntityToModel(CarEntity carEntity) {
        CarModel carModel = new CarModel();
        
        carModel.setModel(carEntity.getModel());
        carModel.setName(carEntity.getName());
        carModel.setPrice(carEntity.getPrice());
        
        return carModel;
    }
    
    public List<CarModel> fromEntitiesToModels(List<CarEntity> carEntities) {
        List<CarModel> carModels = new ArrayList<>();
        for (CarEntity carEntity : carEntities) {
            CarModel carModel = fromEntityToModel(carEntity);
            carModels.add(carModel);
        }
        return carModels;
    }
    
    public List<CarEntity> fromModelsToEntities(List<CarModel> carModels) {
        List<CarEntity> carEntities = new ArrayList<>();
        for (CarModel carModel : carModels) {
            CarEntity carEntity = fromModelToEntity(carModel);
            carEntities.add(carEntity);
        }
        return carEntities;
    }

}

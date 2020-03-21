package pl.juniorjavadeveloper.spring.crud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.juniorjavadeveloper.spring.crud.dao.CarDao;
import pl.juniorjavadeveloper.spring.crud.dao.entity.CarEntity;
import pl.juniorjavadeveloper.spring.crud.model.CarModel;
import pl.juniorjavadeveloper.spring.crud.service.mapper.CarMapper;

@Service
public class CarService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CarService.class.getName());
    private CarMapper carMapper;
    private CarDao carDao;
    
    public CarService(CarMapper carMapper, CarDao carDao) {
        this.carMapper = carMapper;
        this.carDao = carDao;
    }
    
    public CarModel create(CarModel carModel) {
        LOGGER.info("Creating " + carModel);
        CarEntity carEntity = carMapper.fromModelToEntity(carModel);
        CarEntity createdCarEntity = null;
        createdCarEntity = carDao.create(carEntity);
        return carMapper.fromEntityToModel(createdCarEntity);
    }
    
    public CarModel read(Long id) {
        LOGGER.info("Reading");
        
        return null;
    }
    
    
    public CarModel update(Long id, CarModel carModel) {
        LOGGER.info("updating" + carModel);
        CarEntity readCarEntity = carDao.read(id);
        CarModel readCarModel = carMapper.fromEntityToModel(readCarEntity);
        
        readCarModel.setModel(carModel.getModel());
        readCarModel.setName(carModel.getName());
        readCarModel.setPrice(carModel.getPrice());
        
        CarEntity carEntity = carMapper.fromModelToEntity(readCarModel);
        
        CarEntity updatedCarEntity = carDao.update(id, carEntity);
        
        return carMapper.fromEntityToModel(updatedCarEntity);
        
    }
    
    
    public void delete(Long id) {
        LOGGER.info("deleting");
        carDao.delete(id);
    }
}



//TODO:: Dokonczyc implementacje service


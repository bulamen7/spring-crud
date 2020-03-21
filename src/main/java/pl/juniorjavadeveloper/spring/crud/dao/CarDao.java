package pl.juniorjavadeveloper.spring.crud.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import pl.juniorjavadeveloper.spring.crud.dao.entity.CarEntity;

@Repository
public class CarDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarDao.class.getName());
    
    public CarEntity list(){
        
        return null;
    }
    
    public CarEntity create(CarEntity carEntity)  {
        LOGGER.info("Creating " + carEntity);
        
        return carEntity;
    }
    
    public CarEntity read(Long id) {
        LOGGER.info("Logger CarEntity");
        
        return null;
    }
    
    public CarEntity update(Long id, CarEntity updateCarEntity) {
        
        return null;
    }
    
    
    public void delete(Long id) {

    }
}

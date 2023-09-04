/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.CarDao;
import car.rental.system.dto.CarDto;
import car.rental.system.entity.CarEntity;
import car.rental.system.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class CarServiceImpl implements CarService {

    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

 
    public ArrayList<CarDto> getAllCars() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntities = carDao.getAll();

        for (CarEntity entity : carEntities) {
            CarDto dto = new CarDto(entity.getBrand(), entity.getModel(),
                    entity.getVehicleNo(), entity.getCategoryId(),
                    entity.getPricePerDay(), entity.getYear());
            carDtos.add(dto);
        }

        return carDtos;
    }

  
    public String updateCar(CarDto carDto) throws Exception {
        CarEntity carEntity = new CarEntity(carDto.getBrand(), carDto.getModel(),
                carDto.getVehicleNo(), carDto.getCategoryId(),
                carDto.getPricePerDay(), carDto.getYear());

        if (carDao.update(carEntity)) {
            return "Successfully Updated";
        } else {
            return "Fail";
        }
    }

   
    public String addCar(CarDto carDto) throws Exception {
        CarEntity carEntity = new CarEntity(carDto.getBrand(), carDto.getModel(),
                carDto.getVehicleNo(), carDto.getCategoryId(),
                carDto.getPricePerDay(), carDto.getYear());

        if (carDao.add(carEntity)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

   
    public CarDto getCar(String vehicleNo) throws Exception {
        CarEntity carEntity = carDao.get(vehicleNo);

        if (carEntity != null) {
            return new CarDto(carEntity.getBrand(), carEntity.getModel(),
                    carEntity.getVehicleNo(), carEntity.getCategoryId(),
                    carEntity.getPricePerDay(), carEntity.getYear());
        } else {
            return null;
        }
    }

   
    public String deleteCar(String vehicleNo) throws Exception {
        if (carDao.delete(vehicleNo)) {
            return "Successfully Deleted";
        } else {
            return "Fail";
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.controller;

/**
 *
 * @author Damith
 */
import car.rental.system.dto.CarDto;
import car.rental.system.service.ServiceFactory;
import car.rental.system.service.custom.CarService;
import java.util.ArrayList;

public class CarController {

    CarService carService = (CarService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);

    public ArrayList<CarDto> getAllCars() throws Exception {
        return carService.getAllCars();
    }

    public String updateCar(CarDto carDto) throws Exception {
        return carService.updateCar(carDto);
    }

    public String addCar(CarDto carDto) throws Exception {
        return carService.addCar(carDto);
    }

    public CarDto getCar(String vehicleNo) throws Exception {
        return carService.getCar(vehicleNo);
    }

    public String deleteCar(String vehicleNo) throws Exception {
        return carService.deleteCar(vehicleNo);
    }
}

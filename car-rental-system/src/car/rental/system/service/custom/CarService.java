/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.service.custom;

/**
 *
 * @author Damith
 */
import car.rental.system.dto.CarDto;
import car.rental.system.service.SuperService;
import java.util.ArrayList;

public interface CarService extends SuperService {

    ArrayList<CarDto> getAllCars() throws Exception;

    String updateCar(CarDto carDto) throws Exception;

    String addCar(CarDto carDto) throws Exception;

    CarDto getCar(String vehicleNo) throws Exception;

    String deleteCar(String vehicleNo) throws Exception;
}
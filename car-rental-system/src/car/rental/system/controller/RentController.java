/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.controller;

import car.rental.system.dto.CarDto;
import car.rental.system.dto.CustomerDto;
import car.rental.system.dto.RentDto;
import car.rental.system.service.ServiceFactory;
import car.rental.system.service.custom.CarService;
import car.rental.system.service.custom.CustomerService;
import car.rental.system.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class RentController {

    RentService rentService = (RentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENT);

    public String rentCar(RentDto rentDto) throws Exception {
        return rentService.rentCar(rentDto);
    }

    public String returnCar(int rentId, double finalBalance) throws Exception {
        return rentService.returnCar(rentId, finalBalance);
    }

    public ArrayList<RentDto> getRentalHistory(int id) throws Exception {
        return rentService.getRentalHistory(id);
    }
    
      // Load customer list for dropdown
    public ArrayList<CustomerDto> getCustomerList() throws Exception {
        CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);
        return customerService.getAllCustomers(); // Implement this method in CustomerService
    }

    // Load car list for dropdown
    public ArrayList<CarDto> getCarList() throws Exception {
        CarService carService = (CarService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);
        return carService.getAllCars(); // Implement this method in CarService
    }
    
      public RentDto getRentDetail(int rentId) throws Exception  {
        return rentService.getRentDetail(rentId);
    }
}

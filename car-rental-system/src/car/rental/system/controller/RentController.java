/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.controller;

import car.rental.system.dto.RentDto;
import car.rental.system.service.ServiceFactory;
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

    public ArrayList<RentDto> getRentalHistory(int customerId) throws Exception {
        return rentService.getRentalHistory(customerId);
    }
}

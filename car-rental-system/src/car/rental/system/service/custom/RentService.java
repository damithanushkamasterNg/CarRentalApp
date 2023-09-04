/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.service.custom;

import car.rental.system.dto.RentDto;
import car.rental.system.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public interface RentService extends SuperService {

    String rentCar(RentDto rentDto) throws Exception;

    String returnCar(int rentId, double finalBalance) throws Exception;

    ArrayList<RentDto> getRentalHistory(int customerId) throws Exception;

}

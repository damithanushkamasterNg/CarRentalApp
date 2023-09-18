/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.RentDao;
import car.rental.system.dto.CarDto;
import car.rental.system.dto.RentDto;
import car.rental.system.entity.RentEntity;
import car.rental.system.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class RentServiceImpl implements RentService {

    private RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);

    @Override
    public String rentCar(RentDto rentDto) throws Exception {
        try {
            RentEntity rentEntity = new RentEntity(rentDto.getFromDate(), rentDto.getToDate(),
                    rentDto.getTotal(), rentDto.isIsReturn(), rentDto.getBalance(),
                    rentDto.getRefundableDeposit(), rentDto.getAdvancedPayment(), rentDto.getPerDayRent(), rentDto.getCarId(), rentDto.getCustomerId());

            // Map RentDto properties to RentEntity properties
            // Save the rental details using rentDao
            if (rentDao.add(rentEntity)) {
                return "Car rented successfully.";
            } else {
                return "Failed to rent the car.";
            }
        } catch (Exception e) {
            // Handle exceptions and return an error message
            return "Error renting the car: " + e.getMessage();
        }
    }

    @Override
    public String returnCar(int rentId, double finalBalance) throws Exception {
        try {
            // Fetch the rental entry using rentId from rentDao
            RentEntity rentEntity = rentDao.get(rentId);
            // Perform calculations and update rentEntity properties
            // Update the rental details using rentDao
            if (rentDao.update(rentEntity)) {
                return "Car returned successfully.";
            } else {
                return "Failed to return the car.";
            }
        } catch (Exception e) {
            // Handle exceptions and return an error message
            return "Error returning the car: " + e.getMessage();
        }
    }

    @Override
    public ArrayList<RentDto> getRentalHistory(int id) throws Exception {
        ArrayList<RentDto> rentalHistory = new ArrayList<>();
        try {
            // Fetch rental history for the specified customer from rentDao
            ArrayList<RentEntity> rentalEntities = rentDao.getRentalHistory(id);
            // Convert RentEntity objects to RentDto objects and populate rentalHistory
            for (RentEntity entity : rentalEntities) {
                RentDto rentDto = new RentDto();
                rentDto.setId(entity.getId());
                rentDto.setFromDate(entity.getFromDate());
                rentDto.setToDate(entity.getToDate());
                rentDto.setTotal(entity.getTotal());
                rentDto.setIsReturn(entity.isIsReturn());
                rentDto.setBalance(entity.getBalance());
                rentDto.setRefundableDeposit(entity.getRefundableDeposit());
                rentDto.setAdvancedPayment(entity.getAdvancedPayment());
                rentDto.setPerDayRent(entity.getPerDayRent());
                rentDto.setCarId(entity.getCarId());
                rentDto.setCustomerId(entity.getCustomerId());

                rentalHistory.add(rentDto);
            }
        } catch (Exception e) {
            // Handle exceptions and return an empty list or throw an exception
        }
        return rentalHistory;
    }

    @Override
public RentDto getRentDetail(int id) throws Exception {
    RentEntity entity = rentDao.get(id);

    // Create a new RentDto using the RentEntity properties
    RentDto rentDto = new RentDto(
        entity.getId(),
        entity.getFromDate(), // Assuming getFromDate() returns a Date
        entity.getToDate(), // Assuming getToDate() returns a Date
        entity.getTotal(),
        entity.isIsReturn(),
        entity.getBalance(),
        entity.getRefundableDeposit(),
        entity.getAdvancedPayment(),
        entity.getPerDayRent(),
        entity.getCarId(),
        entity.getCustomerId()
    );

    return rentDto;
}


}

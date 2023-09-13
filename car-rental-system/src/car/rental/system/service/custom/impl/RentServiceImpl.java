/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.RentDao;
import car.rental.system.dto.CarDto;
import car.rental.system.dto.CustomerDto;
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
    public ArrayList<RentDto> getRentalHistory(int customerId) throws Exception {
        ArrayList<RentDto> rentalHistory = new ArrayList<>();
        try {
            // Fetch rental history for the specified customer from rentDao
            ArrayList<RentEntity> rentalEntities = rentDao.getRentalHistory(customerId);
            // Convert RentEntity objects to RentDto objects and populate rentalHistory
            for (RentEntity entity : rentalEntities) {
                RentDto rentDto = new RentDto();
                // Map RentEntity properties to RentDto properties
                rentalHistory.add(rentDto);
            }
        } catch (Exception e) {
            // Handle exceptions and return an empty list or throw an exception
        }
        return rentalHistory;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        ArrayList<CustomerDto> customers = new ArrayList<>();
        try {
            // Fetch all customers from the database using rentDao or a dedicated CustomerDao
            // Convert CustomerEntity objects to CustomerDto objects and populate 'customers'
        } catch (Exception e) {
            // Handle exceptions and return an empty list or throw an exception
        }
        return customers;
    }

    @Override
    public ArrayList<CarDto> getAllCars() throws Exception {
        ArrayList<CarDto> cars = new ArrayList<>();
        try {
            // Fetch all cars from the database using rentDao or a dedicated CarDao
            // Convert CarEntity objects to CarDto objects and populate 'cars'
        } catch (Exception e) {
            // Handle exceptions and return an empty list or throw an exception
        }
        return cars;
    }
}

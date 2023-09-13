/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.dao.custom;

import car.rental.system.dao.CrudDao;
import car.rental.system.dto.CarDto;
import car.rental.system.dto.CustomerDto;
import car.rental.system.entity.RentEntity;

/**
 *
 * @author Damith
 */
import java.util.ArrayList;

public interface RentDao extends CrudDao<RentEntity, Integer> {

    ArrayList<RentEntity> getRentalHistory(int customerId) throws Exception;

    ArrayList<CustomerDto> getAllCustomers() throws Exception;

    ArrayList<CarDto> getAllCars() throws Exception;

    public RentEntity get(int rentId);
}

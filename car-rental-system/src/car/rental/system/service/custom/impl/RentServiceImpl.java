/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.RentDao;
import car.rental.system.dto.RentDto;
import car.rental.system.entity.RentEntity;
import car.rental.system.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class RentServiceImpl implements RentService {
    RentDao rentDao = (RentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RENT);

    @Override
    public String rentCar(RentDto rentDto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String returnCar(int rentId, double finalBalance) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<RentDto> getRentalHistory(int customerId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
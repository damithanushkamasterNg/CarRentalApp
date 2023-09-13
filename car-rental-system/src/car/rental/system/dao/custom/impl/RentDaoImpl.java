/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dao.custom.impl;

import car.rental.system.dao.CrudUtil;
import car.rental.system.dao.custom.RentDao;
import car.rental.system.dto.CarDto;
import car.rental.system.dto.CustomerDto;
import car.rental.system.entity.RentEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Damith
 */
public class RentDaoImpl implements RentDao {

    @Override
    public ArrayList<RentEntity> getRentalHistory(int customerId) throws Exception {
        // Implement the logic to retrieve rental history for a customer by customerId
        // Use the CrudUtil class to execute SQL queries

        // Sample code:
        ArrayList<RentEntity> rentalHistory = new ArrayList<>();
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM rent WHERE customer_id = ?", customerId);
        while (resultSet.next()) {
            RentEntity rentEntity = new RentEntity();
            rentEntity.setId(resultSet.getInt("id"));
            // Set other properties of rentEntity based on column names
            rentalHistory.add(rentEntity);
        }
        return rentalHistory;
    }

    @Override
    public boolean add(RentEntity rentEntity) throws Exception {
        System.out.println(rentEntity);
        String query = "INSERT INTO rent (from_date, to_date, total, is_return, balance, refundable_deposit, advanced_payment, per_day_rent, car_id, customer_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return CrudUtil.executeUpdate(query,
                rentEntity.getFromDate(), rentEntity.getToDate(), rentEntity.getTotal(),
                rentEntity.isIsReturn(), rentEntity.getBalance(), rentEntity.getRefundableDeposit(),
                rentEntity.getAdvancedPayment(), rentEntity.getPerDayRent(),
                rentEntity.getCarId(), rentEntity.getCustomerId());
    }

    @Override
    public boolean update(RentEntity rentEntity) throws Exception {
        String query = "UPDATE rent SET from_date=?, to_date=?, total=?, is_return=?, balance=?, refundable_deposit=?, "
                + "advanced_payment=?, per_day_rent=?, car_id=?, customer_id=? WHERE id=?";
        return CrudUtil.executeUpdate(query,
                rentEntity.getFromDate(), rentEntity.getToDate(), rentEntity.getTotal(),
                rentEntity.isIsReturn(), rentEntity.getBalance(), rentEntity.getRefundableDeposit(),
                rentEntity.getAdvancedPayment(), rentEntity.getPerDayRent(),
                rentEntity.getCarId(), rentEntity.getCustomerId(), rentEntity.getId());
    }

    @Override
    public boolean delete(String nic) throws Exception {
        String query = "DELETE FROM rent WHERE id=?";
        return CrudUtil.executeUpdate(query, nic);
    }

    @Override
    public RentEntity get(String nic) throws Exception {
        String query = "SELECT * FROM rent WHERE id=?";
        ResultSet resultSet = CrudUtil.executeQuery(query, nic);
        if (resultSet.next()) {
            RentEntity rentEntity = new RentEntity();
            rentEntity.setId(resultSet.getInt("id"));
            return rentEntity;
        }
        return null;
    }

    @Override
    public ArrayList<RentEntity> getAll() throws Exception {
        ArrayList<RentEntity> rentalRecords = new ArrayList<>();
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM rent");
        while (resultSet.next()) {
            RentEntity rentEntity = new RentEntity();
            rentEntity.setId(resultSet.getInt("id"));
            // Set other properties of rentEntity based on column names
            rentalRecords.add(rentEntity);
        }
        return rentalRecords;
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CarDto> getAllCars() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public RentEntity get(int rentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

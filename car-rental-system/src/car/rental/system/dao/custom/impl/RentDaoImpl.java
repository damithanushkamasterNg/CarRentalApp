/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dao.custom.impl;

import car.rental.system.dao.CrudUtil;
import car.rental.system.dao.custom.RentDao;
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
        System.out.println(customerId);
        ArrayList<RentEntity> rentalHistory = new ArrayList<>();
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM rent WHERE customer_id = ?", customerId);

        while (resultSet.next()) {
            RentEntity rentEntity = new RentEntity();
            rentEntity.setId(resultSet.getInt("id"));
            rentEntity.setFromDate(resultSet.getDate("from_date"));
            rentEntity.setToDate(resultSet.getDate("to_date"));
            rentEntity.setTotal(resultSet.getDouble("total"));
            rentEntity.setIsReturn(resultSet.getBoolean("is_return"));
            rentEntity.setBalance(resultSet.getDouble("balance"));
            rentEntity.setRefundableDeposit(resultSet.getDouble("refundable_deposit"));
            rentEntity.setAdvancedPayment(resultSet.getDouble("advanced_payment"));
            rentEntity.setPerDayRent(resultSet.getDouble("per_day_rent"));
            rentEntity.setCarId(resultSet.getInt("car_id"));
            rentEntity.setCustomerId(resultSet.getInt("customer_id"));

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
    public RentEntity get(int rentId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM rent WHERE id = ?", rentId);

        while (rst.next()) {
            RentEntity rentEntity = new RentEntity(
                    rst.getInt("id"),
                    rst.getString("from_date"),
                    rst.getDate("to_date"),
                    rst.getDouble("total"),
                    rst.getBoolean("is_return"),
                    rst.getDouble("balance"),
                    rst.getDouble("refundable_deposit"),
                    rst.getDouble("advanced_payment"),
                    rst.getDouble("per_day_rent"),
                    rst.getInt("car_id"),
                    rst.getInt("customer_id")
            );

            return rentEntity;
        }
        return null;
    }

}

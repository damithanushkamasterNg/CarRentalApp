/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dao.custom.impl;

import car.rental.system.dao.CrudUtil;
import car.rental.system.dao.custom.CustomerDao;
import car.rental.system.entity.CustomerEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Damith
 */
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO customer VALUES(?,?,?,?,?)",
                t.getId(), t.getName(), t.getNic(), t.getAddress(), t.getPhone());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("update customer set name =?, nic =?, address =?, phone =? WHERE nic=?",
                t.getName(), t.getNic(), t.getAddress(), t.getPhone(), t.getNic());
    }

    @Override
    public boolean delete(String nic) throws Exception {
          return CrudUtil.executeUpdate("DELETE FROM customer WHERE nic=?",
                nic);
    }

    @Override
    public CustomerEntity get(String nic) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM customer WHERE nic = ?", nic);

        while (rst.next()) {
            CustomerEntity customerEntity = new CustomerEntity(
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));

            return customerEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("Select * FROM customer");

        while (rst.next()) {
            CustomerEntity customerEntity = new CustomerEntity(
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5));

            customerEntitys.add(customerEntity);
        }

        return customerEntitys;
    }

}

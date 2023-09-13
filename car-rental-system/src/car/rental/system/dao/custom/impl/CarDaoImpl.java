/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dao.custom.impl;

import car.rental.system.dao.CrudUtil;
import car.rental.system.dao.custom.CarDao;
import car.rental.system.entity.CarEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Damith
 */
public class CarDaoImpl implements CarDao {

    @Override
    public boolean add(CarEntity carEntity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO car (brand, model, vehicle_no, category_id, price_per_day, year) VALUES (?,?,?,?,?,?)",
                carEntity.getBrand(), carEntity.getModel(), carEntity.getVehicleNo(),
                carEntity.getCategoryId(), carEntity.getPricePerDay(), carEntity.getYear());
    }

    @Override
    public boolean update(CarEntity carEntity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE car SET brand=?, model=?, vehicle_no=?, category_id=?, price_per_day=?, year=? WHERE vehicle_no=?",
                carEntity.getBrand(), carEntity.getModel(), carEntity.getVehicleNo(),
                carEntity.getCategoryId(), carEntity.getPricePerDay(), carEntity.getYear(),
                carEntity.getVehicleNo());
    }

    @Override
    public boolean delete(String vehicleNo) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM car WHERE vehicle_no=?", vehicleNo);
    }

    @Override
    public CarEntity get(String vehicleNo) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM car WHERE vehicle_no = ?", vehicleNo);

        while (rst.next()) {
            CarEntity carEntity = new CarEntity(
                    rst.getInt("id"),
                    rst.getString("brand"),
                    rst.getString("model"),
                    rst.getString("vehicle_no"),
                    rst.getString("category_id"),
                    rst.getDouble("price_per_day"),
                    rst.getInt("year"));

            return carEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CarEntity> getAll() throws Exception {
        ArrayList<CarEntity> carEntities = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM car");

        while (rst.next()) {
            CarEntity carEntity = new CarEntity(
                    rst.getString("brand"),
                    rst.getString("model"),
                    rst.getString("vehicle_no"),
                    rst.getString("category_id"),
                    rst.getDouble("price_per_day"),
                    rst.getInt("year"));

            carEntities.add(carEntity);
        }

        return carEntities;
    }
}

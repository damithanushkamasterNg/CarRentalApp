/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dao.custom.impl;

import car.rental.system.dao.CrudUtil;
import car.rental.system.dao.custom.UserDao;
import car.rental.system.entity.UserEntity;
import java.sql.ResultSet;

/**
 *
 * @author Damith
 */
public class UserDaoImpl implements UserDao {

    @Override
    public UserEntity getUserByUsername(String username) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user WHERE username = ?", username);

        while (rst.next()) {
            UserEntity userEntity = new UserEntity(
                    rst.getString("name"),
                    rst.getString("email"),
                    rst.getString("mobile"),
                    rst.getString("username"),
                    rst.getString("password"));

            return userEntity;
        }
        return null;
    }
}

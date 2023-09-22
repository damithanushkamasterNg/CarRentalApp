/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.dao.custom;

import car.rental.system.dao.SuperDao;
import car.rental.system.entity.UserEntity;

/**
 *
 * @author Damith
 */
public interface UserDao extends SuperDao{

    UserEntity getUserByUsername(String username) throws Exception; // New method to get a user by username
}

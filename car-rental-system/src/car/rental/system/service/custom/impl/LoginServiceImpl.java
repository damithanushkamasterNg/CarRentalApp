/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.UserDao;
import car.rental.system.entity.UserEntity;
import car.rental.system.service.custom.LoginService;

/**
 *
 * @author Damith
 */
public class LoginServiceImpl implements LoginService{

   
    private UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public boolean authenticateUser(String username, String password) throws Exception {
        try {
            UserEntity userEntity = (UserEntity) userDao.getUserByUsername(username);

            if (userEntity != null) {
                // Check if the entered password matches the stored password
                if (userEntity.getPassword().equals(password)) {
                    // Authentication successful
                    return true;
                }
            }
        } catch (Exception e) {
            // Handle exceptions (e.g., database errors) here
            e.printStackTrace();
        }

        // Authentication failed
        return false;
    }
}

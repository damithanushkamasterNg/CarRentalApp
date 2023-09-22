/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.UserDao;
import car.rental.system.dto.UserDto;
import car.rental.system.entity.UserEntity;
import car.rental.system.service.custom.UserService;

/**
 *
 * @author Damith
 */
public class UserServiceImpl implements UserService {

    public UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public UserDto getUserByUsername(String username) {
        try {
            UserEntity userEntity = (UserEntity) userDao.getUserByUsername(username);

            if (userEntity != null) {
                // Convert the UserEntity to UserDto
                UserDto userDto = new UserDto(
                        userEntity.getId(),
                        userEntity.getName(),
                        userEntity.getEmail(),
                        userEntity.getMobile(),
                        userEntity.getUsername(),
                        userEntity.getPassword()
                );
                return userDto;
            }
        } catch (Exception e) {
            // Handle exceptions (e.g., database errors) here
            e.printStackTrace();
        }

        // If the user is not found, return null
        return null;
    }
}

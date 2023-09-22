/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.controller;

import car.rental.system.dto.UserDto;
import car.rental.system.service.ServiceFactory;
import car.rental.system.service.custom.UserService;

/**
 *
 * @author Damith
 */
public class LoginController {
    private UserService userService;

    public LoginController() {
        userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);
    }

    public boolean authenticateUser(String username, String password) {
        try {
            UserDto userDto = userService.getUserByUsername(username);

            if (userDto != null) {
                // Check if the entered password matches the stored password
                if (userDto.getPassword().equals(password)) {
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
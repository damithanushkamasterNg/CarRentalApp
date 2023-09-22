/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.service.custom;

import car.rental.system.dto.UserDto;
import car.rental.system.service.SuperService;

/**
 *
 * @author Damith
 */
public interface UserService extends SuperService {

    public UserDto getUserByUsername(String username);
    
}

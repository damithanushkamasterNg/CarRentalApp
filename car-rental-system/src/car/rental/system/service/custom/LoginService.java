/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.service.custom;

/**
 *
 * @author Damith
 */
public interface LoginService {
     boolean authenticateUser(String username, String password) throws Exception;
}

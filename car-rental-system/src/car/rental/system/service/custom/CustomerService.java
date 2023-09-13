/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.service.custom;

import car.rental.system.dto.CustomerDto;
import car.rental.system.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public interface CustomerService extends SuperService {
    
    ArrayList<CustomerDto> getAllCustomers() throws Exception;

    public String updateCustomer(CustomerDto customerDto) throws Exception;

    public String addCustomer(CustomerDto customerDto) throws Exception;

    public CustomerDto getCustomer(String nic) throws Exception;

    public String deleteCustomer(String nic) throws Exception;

}

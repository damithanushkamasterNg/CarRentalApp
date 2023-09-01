/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.controller;

import car.rental.system.dto.CustomerDto;
import car.rental.system.service.ServiceFactory;
import car.rental.system.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);

    }

    public String addCustomer(CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    public CustomerDto getCustomer(String nic) throws Exception  {
        return customerService.getCustomer(nic);
    }

    public String deleteCustomer(String nic) throws Exception  {
        return customerService.deleteCustomer(nic);
    }

}

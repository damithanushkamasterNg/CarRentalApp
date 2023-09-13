package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.CustomerDao;
import car.rental.system.dto.CustomerDto;
import car.rental.system.entity.CustomerEntity;
import car.rental.system.service.custom.CustomerService;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Damith
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        ArrayList<CustomerEntity> customerEntitys = customerDao.getAll();

        for (CustomerEntity entity : customerEntitys) {
            CustomerDto dto = new CustomerDto(entity.getName(), entity.getNic(),
                    entity.getAddress(), entity.getPhone());
            customerDtos.add(dto);
        }

        return customerDtos;

    }

    @Override
    public String updateCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity ce = new CustomerEntity(customerDto.getName(), customerDto.getNic(),
                customerDto.getAddress(), customerDto.getPhone());
        if (customerDao.update(ce)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
    }

    @Override
    public String addCustomer(CustomerDto customerDto) throws Exception {
        CustomerEntity ce = new CustomerEntity(customerDto.getName(), customerDto.getNic(),
                customerDto.getAddress(), customerDto.getPhone());

        if (customerDao.add(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    @Override
    public CustomerDto getCustomer(String nic) throws Exception {
        CustomerEntity entity = customerDao.get(nic);
        return new CustomerDto(entity.getId(),entity.getName(), entity.getNic(),
                entity.getAddress(), entity.getPhone());
    }

    @Override
    public String deleteCustomer(String nic) throws Exception{
        if (customerDao.delete(nic)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }
}

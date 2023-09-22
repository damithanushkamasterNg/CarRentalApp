package car.rental.system.service;

import car.rental.system.service.custom.impl.CarServiceImpl;
import car.rental.system.service.custom.impl.CategoryServiceImpl;
import car.rental.system.service.custom.impl.CustomerServiceImpl;
import car.rental.system.service.custom.impl.LoginServiceImpl;
import car.rental.system.service.custom.impl.RentServiceImpl;
import car.rental.system.service.custom.impl.UserServiceImpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Damith
 */
public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }

        return serviceFactory;
    }

    public SuperService getService(ServiceType type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerServiceImpl();
            case CAR:
                return new CarServiceImpl();
            case RENT:
                return new RentServiceImpl();
            case CATEGORY:
                return new CategoryServiceImpl();
            case USER:
                return new UserServiceImpl();
            case LOGIN:
                return (SuperService) new LoginServiceImpl();
            default:
                return null;
        }
    }

    public enum ServiceType {
        CUSTOMER, CAR, RENT, CATEGORY, USER, LOGIN
    }
}

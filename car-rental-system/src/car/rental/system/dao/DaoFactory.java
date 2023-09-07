package car.rental.system.dao;
import car.rental.system.dao.custom.impl.CarDaoImpl;
import car.rental.system.dao.custom.impl.CategoryDaoImpl;
import car.rental.system.dao.custom.impl.CustomerDaoImpl;
import car.rental.system.dao.custom.impl.RentDaoImpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */


/**
 *
 * @author Damith
 */
public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }

        return daoFactory;
    }

    /**
     *
     * @param type
     * @return
     */
    public SuperDao getDao(DaoTypes type) {
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
            case CAR:
                return new CarDaoImpl();
            case RENT:
                return new RentDaoImpl();
            case CATEGORY:
                return new CategoryDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        CUSTOMER, CAR, RENT, CATEGORY
    }
}

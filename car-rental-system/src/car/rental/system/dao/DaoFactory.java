package car.rental.system.dao;
import car.rental.system.dao.custom.impl.CustomerDaoImpl;

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
            case ITEM:
//                return new ItemDaoImpl();
            case ORDER:
//                return new OrderDaoImpl();
            case ORDER_DETAIL:
//                return new OrderDetailDaoImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes {
        CUSTOMER, ITEM, ORDER, ORDER_DETAIL
    }
}

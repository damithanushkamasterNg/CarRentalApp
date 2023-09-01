package car.rental.system.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public interface CrudDao<T, ID> extends SuperDao {

    boolean add(T t) throws Exception;

    boolean update(T t) throws Exception;

    boolean delete(String nic) throws Exception;

    T get(String nic) throws Exception;

    ArrayList<T> getAll() throws Exception;

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dao.custom.impl;

/**
 *
 * @author Damith
 */
import car.rental.system.dao.CrudUtil;
import car.rental.system.dao.custom.CategoryDao;
import car.rental.system.entity.CategoryEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryDaoImpl implements CategoryDao {

    @Override
    public boolean add(CategoryEntity categoryEntity) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO category (name, category_id) VALUES (?, ?)",
                categoryEntity.getName(), categoryEntity.getCategoryId());
    }

    @Override
    public boolean update(CategoryEntity categoryEntity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE category SET name = ? WHERE category_id = ?",
                categoryEntity.getName(), categoryEntity.getCategoryId());
    }

    @Override
    public boolean delete(String categoryId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM category WHERE category_id = ?",
                categoryId);
    }

    @Override
    public CategoryEntity get(String categoryId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category WHERE category_id = ?", categoryId);

        while (rst.next()) {
            CategoryEntity categoryEntity = new CategoryEntity(
                    rst.getInt("id"),
                    rst.getString("name"),
                    rst.getString("category_id"),
                    rst.getInt("created_by"),
                   rst.getTimestamp("created_date") != null ? rst.getTimestamp("created_date").toLocalDateTime() : null);

            return categoryEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CategoryEntity> getAll() throws Exception {
        ArrayList<CategoryEntity> categoryEntities = new ArrayList<>();

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM category");

        while (rst.next()) {
            CategoryEntity categoryEntity = new CategoryEntity(
                    rst.getInt("id"),
                    rst.getString("name"),
                    rst.getString("category_id"),
                    rst.getInt("created_by"),
                    rst.getTimestamp("created_date") != null ? rst.getTimestamp("created_date").toLocalDateTime() : null);
            categoryEntities.add(categoryEntity);
        }

        return categoryEntities;
    }
}

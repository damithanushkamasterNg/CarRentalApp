/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.service.custom.impl;

import car.rental.system.dao.DaoFactory;
import car.rental.system.dao.custom.CategoryDao;
import car.rental.system.dto.CategoryDto;
import car.rental.system.entity.CategoryEntity;
import car.rental.system.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class CategoryServiceImpl implements CategoryService {

    CategoryDao categoryDao = (CategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CATEGORY);

    @Override
    public ArrayList<CategoryDto> getAllCategories() throws Exception {
        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
        ArrayList<CategoryEntity> categoryEntities = categoryDao.getAll();

        for (CategoryEntity entity : categoryEntities) {
            CategoryDto dto = new CategoryDto(entity.getCategoryId(), entity.getName());
            categoryDtos.add(dto);
        }

        return categoryDtos;
    }

    @Override
    public String updateCategory(CategoryDto categoryDto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDto.getCategoryId(), categoryDto.getName());
        if (categoryDao.update(categoryEntity)) {
            return "Successfully Update";
        } else {
            return "Fail";
        }
    }

    @Override
    public String addCategory(CategoryDto categoryDto) throws Exception {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDto.getCategoryId(), categoryDto.getName());

        if (categoryDao.add(categoryEntity)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }
    }

    public CategoryDto getCategory(String categoryId) throws Exception {
        CategoryEntity entity = categoryDao.get(categoryId);
        return new CategoryDto(entity.getCategoryId(), entity.getName());
    }

    public String deleteCategory(String categoryId) throws Exception {
        if (categoryDao.delete(categoryId)) {
            return "Successfully Delete";
        } else {
            return "Fail";
        }
    }
}

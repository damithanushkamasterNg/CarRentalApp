/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.controller;

import car.rental.system.dto.CategoryDto;
import car.rental.system.service.ServiceFactory;
import car.rental.system.service.custom.CategoryService;
import java.util.ArrayList;

/**
 *
 * @author Damith
 */
public class CategoryController {

    CategoryService categoryService = (CategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CATEGORY);

    public ArrayList<CategoryDto> getAllCategories() throws Exception {
        return categoryService.getAllCategories();
    }

    public String updateCategory(CategoryDto categoryDto) throws Exception {
        return categoryService.updateCategory(categoryDto);
    }

    public String addCategory(CategoryDto categoryDto) throws Exception {
        return categoryService.addCategory(categoryDto);
    }

    public CategoryDto getCategory(String categoryId) throws Exception {
        return categoryService.getCategory(categoryId);
    }

    public String deleteCategory(String categoryId) throws Exception {
        return categoryService.deleteCategory(categoryId);
    }
}

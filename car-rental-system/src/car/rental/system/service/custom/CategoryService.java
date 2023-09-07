/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.rental.system.service.custom;

/**
 *
 * @author Damith
 */
import car.rental.system.dto.CategoryDto;
import car.rental.system.service.SuperService;
import java.util.ArrayList;

public interface CategoryService extends SuperService{
    
    ArrayList<CategoryDto> getAllCategories() throws Exception;

    String updateCategory(CategoryDto categoryDto) throws Exception;

    String addCategory(CategoryDto categoryDto) throws Exception;

    CategoryDto getCategory(int categoryId) throws Exception;

    String deleteCategory(int categoryId) throws Exception;
}

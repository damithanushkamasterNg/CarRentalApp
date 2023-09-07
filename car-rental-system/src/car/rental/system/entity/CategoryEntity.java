/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.entity;

import java.time.LocalDateTime;

/**
 *
 * @author Damith
 */
public class CategoryEntity {

    private int id;
    private String name;
    private String categoryId;
    private int createdBy;
    private LocalDateTime createdDate;

    public CategoryEntity(int id, String name, String categoryId, int createdBy, LocalDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public CategoryEntity(String name, String categoryId) {
        this.name = name;
        this.categoryId = categoryId;
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * @return the createdBy
     */
    public int getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "id=" + id + ", name=" + name + ", categoryId=" + categoryId + ", createdBy=" + createdBy + ", createdDate=" + createdDate + '}';
    }

    

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dto;

import java.time.LocalDateTime;

/**
 *
 * @author Damith
 */
public class  CategoryDto{

    private int id;
    private String name;
    private String categeryId;
    private int createdBy;
    private LocalDateTime createdDate;

    public CategoryDto() {
    }

    public CategoryDto(int id, String name, String categeryId, int createdBy, LocalDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.categeryId = categeryId;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public CategoryDto(String name) {
        this.name = name;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategeryId() {
        return categeryId;
    }

    public void setCategeryId(String categeryId) {
        this.categeryId = categeryId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "id=" + id + ", name=" + name + ", categeryId=" + categeryId + ", createdBy=" + createdBy + ", createdDate=" + createdDate + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dto;

/**
 *
 * @author Damith
 */
public class CarDto {

    private int id;
    private String brand;
    private String model;
    private String vehicleNo;
    private String categoryId;
    private double pricePerDay;
    private int year;

    public CarDto() {
        // Default constructor
    }

    public CarDto(int id, String brand, String model, String vehicleNo, String categoryId, double pricePerDay, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.vehicleNo = vehicleNo;
        this.categoryId = categoryId;
        this.pricePerDay = pricePerDay;
        this.year = year;
    }

    public CarDto(String brand, String model, String vehicleNo, String categoryId, double pricePerDay, int year) {
        this.brand = brand;
        this.model = model;
        this.vehicleNo = vehicleNo;
        this.categoryId = categoryId;
        this.pricePerDay = pricePerDay;
        this.year = year;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter methods for all fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarDto{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", vehicleNo=" + vehicleNo + ", categoryId=" + categoryId + ", pricePerDay=" + pricePerDay + ", year=" + year + '}';
    }

}

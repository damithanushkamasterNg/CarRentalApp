/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dto;

/**
 *
 * @author Damith
 */
public class CustomerDto {

    private int id;
    private String name;
    private String nic;
    private String address;
    private String phone;

    public CustomerDto() {
    }
    


    public CustomerDto(int id, String name, String nic, String address, String phone) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.phone = phone;
    }

    public CustomerDto(String name, String nic, String address, String phone) {
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.phone = phone;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    // Getter and setter methods for each field
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "id=" + id + ", name=" + name + ", nic=" + nic + ", address=" + address + ", phone=" + phone + '}';
    }

   
}

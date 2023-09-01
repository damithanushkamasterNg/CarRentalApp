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

    private String name;
    private String nic;
    private String address;
    private String phone;

    public CustomerDto(String name, String nic, String address, String phone) {
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.phone = phone;
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

    // Other methods as needed
    @Override
    public String toString() {
        return "CustomerDto{"
                + "name='" + name + '\''
                + ", nic='" + nic + '\''
                + ", address='" + address + '\''
                + ", phone='" + phone + '\''
                + '}';
    }
}

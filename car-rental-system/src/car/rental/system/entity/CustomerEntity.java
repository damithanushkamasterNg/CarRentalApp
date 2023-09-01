/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.entity;

/**
 *
 * @author Damith
 */
public class CustomerEntity {

    private int id;
    private String name;
    private String nic;
    private String address;
    private String phone;

    public CustomerEntity() {
    }

    public CustomerEntity(String name, String nic, String address, String phone) {
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.phone = phone;
    }

    public CustomerEntity(int id, String name, String nic, String address, String phone) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.phone = phone;
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

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" + "id=" + id + ", name=" + name + ", nic=" + nic + ", address=" + address + ", phone=" + phone + '}';
    }

}

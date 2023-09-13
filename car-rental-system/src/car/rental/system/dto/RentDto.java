/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dto;

import java.util.Date;

/**
 *
 * @author Damith
 */
public class RentDto {

    private int id;
    private Date fromDate;
    private Date toDate;
    private double total;
    private boolean isReturn;
    private double balance;
    private double refundableDeposit;
    private double advancedPayment;
    private double perDayRent;
    private int carId; // Reference to the rented car
    private int customerId; // Reference to the customer

    public RentDto() {
    }

    public RentDto(int id, Date fromDate, Date toDate, double total, boolean isReturn, double balance, double refundableDeposit, double advancedPayment, double perDayRent, int carId, int customerId) {
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.total = total;
        this.isReturn = isReturn;
        this.balance = balance;
        this.refundableDeposit = refundableDeposit;
        this.advancedPayment = advancedPayment;
        this.perDayRent = perDayRent;
        this.carId = carId;
        this.customerId = customerId;
    }

 
    /**
     * @return the fromDate
     */
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * @return the toDate
     */
    public Date getToDate() {
        return toDate;
    }

    /**
     * @param toDate the toDate to set
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the isReturn
     */
    public boolean isIsReturn() {
        return isReturn;
    }

    /**
     * @param isReturn the isReturn to set
     */
    public void setIsReturn(boolean isReturn) {
        this.isReturn = isReturn;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the refundableDeposit
     */
    public double getRefundableDeposit() {
        return refundableDeposit;
    }

    /**
     * @param refundableDeposit the refundableDeposit to set
     */
    public void setRefundableDeposit(double refundableDeposit) {
        this.refundableDeposit = refundableDeposit;
    }

    /**
     * @return the advancedPayment
     */
    public double getAdvancedPayment() {
        return advancedPayment;
    }

    /**
     * @param advancedPayment the advancedPayment to set
     */
    public void setAdvancedPayment(double advancedPayment) {
        this.advancedPayment = advancedPayment;
    }

    /**
     * @return the perDayRent
     */
    public double getPerDayRent() {
        return perDayRent;
    }

    /**
     * @param perDayRent the perDayRent to set
     */
    public void setPerDayRent(double perDayRent) {
        this.perDayRent = perDayRent;
    }

    /**
     * @return the carId
     */
    public int getCarId() {
        return carId;
    }

    /**
     * @param carId the carId to set
     */
    public void setCarId(int carId) {
        this.carId = carId;
    }

    /**
     * @return the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RentDto{" + "id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", total=" + total + ", isReturn=" + isReturn + ", balance=" + balance + ", refundableDeposit=" + refundableDeposit + ", advancedPayment=" + advancedPayment + ", perDayRent=" + perDayRent + ", carId=" + carId + ", customerId=" + customerId + '}';
    }

 
}

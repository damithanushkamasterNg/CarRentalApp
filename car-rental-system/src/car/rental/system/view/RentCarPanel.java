package car.rental.system.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import car.rental.system.controller.CarController;
import car.rental.system.controller.CustomerController;
import car.rental.system.controller.RentController;
import car.rental.system.dto.CarDto;
import car.rental.system.dto.CustomerDto;
import car.rental.system.dto.CustomerDtoRenderer;
import car.rental.system.dto.RentDto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Damith
 */
public class RentCarPanel extends javax.swing.JPanel {

    private CustomerDto selectedCustomer;
    private RentController rentController;
    private CarController carController;
    private CustomerController customerController;
    ArrayList<CustomerDto> customerDtos;
    ArrayList<CarDto> carDtos;

    /**
     * Creates new form CustomerPanel
     */
    public RentCarPanel() {
        selectedCustomer = new CustomerDto();
        rentController = new RentController();
        carController = new CarController();
        customerController = new CustomerController();
        initComponents();
        CustomerDtoRenderer customerRenderer = new CustomerDtoRenderer();
        customerSelection.setRenderer(customerRenderer);
        loadAllRentedCars();
        try {
            customerDtos = rentController.getCustomerList();
            carDtos = rentController.getCarList();
        } catch (Exception ex) {
            Logger.getLogger(RentCarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

// Assuming you have defined your JComboBox components as carSelection and customerSelection
// Create DefaultComboBoxModel instances for customers and cars
        DefaultComboBoxModel<String> customerModel = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> carModel = new DefaultComboBoxModel<>();

// Populate the models with string representations of your custom objects
        for (CustomerDto customer : customerDtos) {
            customerModel.addElement(customer.getNic()); // Add customer name as a string
        }

        for (CarDto car : carDtos) {
            carModel.addElement(car.getVehicleNo()); // Add car brand as a string
        }

// Set the models for the combo boxes
        customerSelection.setModel(customerModel);
        carSelection.setModel(carModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        fromPanel = new javax.swing.JPanel();
        rentTotalLabel = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        rentFromDate = new javax.swing.JLabel();
        fromDate = new javax.swing.JTextField();
        rentToDate = new javax.swing.JLabel();
        toDate = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        rentStatus = new javax.swing.JLabel();
        rentBalance = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        rentRefundableDepositLabel = new javax.swing.JLabel();
        refundableDeposit = new javax.swing.JTextField();
        advancedPayment = new javax.swing.JTextField();
        rentAdvancedPaymentLabel = new javax.swing.JLabel();
        perDayRent = new javax.swing.JTextField();
        rentPerDayRentLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentDetailTable = new javax.swing.JTable();
        rentCarButton = new javax.swing.JButton();
        searchRent = new javax.swing.JButton();
        returnCarButton1 = new javax.swing.JButton();
        carSelection = new javax.swing.JComboBox<>();
        customerLabel = new javax.swing.JLabel();
        customerSelection = new javax.swing.JComboBox<>();
        carLabel = new javax.swing.JLabel();

        headerlabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        headerlabel.setText("                                            Manage Rent");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        rentTotalLabel.setText("Total");

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        rentFromDate.setText("From Date");

        rentToDate.setText("To Date");

        rentStatus.setText("Status");

        rentBalance.setText("Balance");

        rentRefundableDepositLabel.setText("Refundable Deposit");

        rentAdvancedPaymentLabel.setText("Advanced Payment");

        rentPerDayRentLabel.setText("Per Day Rent");

        javax.swing.GroupLayout fromPanelLayout = new javax.swing.GroupLayout(fromPanel);
        fromPanel.setLayout(fromPanelLayout);
        fromPanelLayout.setHorizontalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rentTotalLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rentToDate, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rentAdvancedPaymentLabel))
                .addGap(24, 24, 24)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rentFromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fromPanelLayout.createSequentialGroup()
                                .addComponent(advancedPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rentPerDayRentLabel)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fromPanelLayout.createSequentialGroup()
                                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(fromPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(rentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fromPanelLayout.createSequentialGroup()
                                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addComponent(rentRefundableDepositLabel)))
                                .addGap(29, 29, 29)))
                        .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(perDayRent, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(refundableDeposit))))
                .addContainerGap())
        );
        fromPanelLayout.setVerticalGroup(
            fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fromPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentTotalLabel)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentFromDate))
                .addGap(31, 31, 31)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentToDate)
                    .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentStatus))
                .addGap(18, 18, 18)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentBalance)
                    .addComponent(refundableDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentRefundableDepositLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(fromPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(advancedPayment)
                    .addComponent(rentAdvancedPaymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perDayRent)
                    .addComponent(rentPerDayRentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        rentDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rentDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentDetailTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rentDetailTableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(rentDetailTable);

        rentCarButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        rentCarButton.setLabel("Rent Car");
        rentCarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarButtonActionPerformed(evt);
            }
        });

        searchRent.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        searchRent.setText("Search");
        searchRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRentActionPerformed(evt);
            }
        });

        returnCarButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        returnCarButton1.setLabel("Return Car");
        returnCarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnCarButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tablePanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(searchRent, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnCarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rentCarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rentCarButton)
                        .addComponent(returnCarButton1))
                    .addComponent(searchRent, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        searchRent.getAccessibleContext().setAccessibleName("Search Rent");

        carSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        carSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carSelectionActionPerformed(evt);
            }
        });

        customerLabel.setText("Customer");

        customerSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customerSelection.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customerSelectionItemStateChanged(evt);
            }
        });
        customerSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSelectionActionPerformed(evt);
            }
        });

        carLabel.setText("Car");

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(customerSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(carLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(carSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rentCarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarButtonActionPerformed
        try {
            rentCar();
        } catch (Exception ex) {
            Logger.getLogger(RentCarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rentCarButtonActionPerformed

    private void searchRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRentActionPerformed
        loadAllRentedCars();
    }//GEN-LAST:event_searchRentActionPerformed

    private void rentDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentDetailTableMouseClicked
//        searchCar();
    }//GEN-LAST:event_rentDetailTableMouseClicked

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void customerSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerSelectionActionPerformed

    private void carSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carSelectionActionPerformed

    private void returnCarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnCarButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnCarButton1ActionPerformed

    private void customerSelectionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customerSelectionItemStateChanged
        String customerNic = customerSelection.getSelectedItem().toString();
        try {
            selectedCustomer = customerController.getCustomer(customerNic);
        } catch (Exception ex) {
            Logger.getLogger(RentCarPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_customerSelectionItemStateChanged

    private void rentDetailTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentDetailTableMouseEntered
        searchRent();
    }//GEN-LAST:event_rentDetailTableMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField advancedPayment;
    private javax.swing.JTextField balance;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel carLabel;
    private javax.swing.JComboBox<String> carSelection;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JComboBox<String> customerSelection;
    private javax.swing.JTextField fromDate;
    private javax.swing.JPanel fromPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField perDayRent;
    private javax.swing.JTextField refundableDeposit;
    private javax.swing.JLabel rentAdvancedPaymentLabel;
    private javax.swing.JLabel rentBalance;
    private javax.swing.JButton rentCarButton;
    private javax.swing.JTable rentDetailTable;
    private javax.swing.JLabel rentFromDate;
    private javax.swing.JLabel rentPerDayRentLabel;
    private javax.swing.JLabel rentRefundableDepositLabel;
    private javax.swing.JLabel rentStatus;
    private javax.swing.JLabel rentToDate;
    private javax.swing.JLabel rentTotalLabel;
    private javax.swing.JButton returnCarButton1;
    private javax.swing.JButton searchRent;
    private javax.swing.JTextField status;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField toDate;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    private void rentCar() throws Exception {

        // Assuming fromDateField is your JTextField containing the date as a string
        String fromDateText = fromDate.getText();
        String toDateText = toDate.getText();

// Create a SimpleDateFormat to parse the date string
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the format as needed

        String customerNic = customerSelection.getSelectedItem().toString();
        selectedCustomer = customerController.getCustomer(customerNic);
        CarDto selectedCar = carController.getCar(carSelection.getSelectedItem().toString());
        try {
            // Retrieve the selected customer and car from the JComboBox components

            if (selectedCustomer != null && selectedCar != null) {
                RentDto rentDto = new RentDto();
                Date fromDate = dateFormat.parse(fromDateText); // Parse the date string to Date
                Date toDate = dateFormat.parse(toDateText); // Parse the date string to Date
                rentDto.setFromDate(fromDate);
                rentDto.setToDate(toDate);
                rentDto.setAdvancedPayment(Double.parseDouble(advancedPayment.getText()));
                rentDto.setRefundableDeposit(Double.parseDouble(refundableDeposit.getText()));
                rentDto.setPerDayRent(Double.parseDouble(perDayRent.getText()));
                rentDto.setCustomerId(selectedCustomer.getId());
                rentDto.setCarId(selectedCar.getId());
                // Set other properties of the rentDto as needed based on your UI components

                // You can use the rentController to rent the car
                String result = rentController.rentCar(rentDto);
                JOptionPane.showMessageDialog(this, result);
                clearRentFields();
                loadAllRentedCars();
            } else {
                JOptionPane.showMessageDialog(this, "Please select a customer and a car.");
            }
        } catch (Exception ex) {
            Logger.getLogger(RentCarPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void returnCar() {
        try {
            int selectedRowIndex = rentDetailTable.getSelectedRow();
            if (selectedRowIndex != -1) {
                RentDto selectedRent = getRentFromTable(selectedRowIndex); // Implement this method
                String result = rentController.returnCar(selectedRent.getId(), Double.parseDouble(balance.getText()));
                JOptionPane.showMessageDialog(this, result);
                clearRentFields();
                loadAllRentedCars();
            } else {
                JOptionPane.showMessageDialog(this, "Please select a rental entry.");
            }
        } catch (Exception ex) {
            Logger.getLogger(RentCarPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void loadAllRentedCars() {
        try {

            // Fetch all rented cars from your database using rentController or a dedicated service method
            ArrayList<RentDto> rentedCars = rentController.getRentalHistory(selectedCustomer.getId()); // Provide the customer nic
            System.out.println(rentedCars);
            // Create the table model for your carDetailTable
            String[] columnNames = {"Rent ID", "From Date", "To Date", "Advanced Payment", "Per Day Rent"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
            for (RentDto rentedCar : rentedCars) {

                // Assuming you have appropriate getters in RentDto to retrieve required data
                int rentalId = rentedCar.getId();
                String fromDate = formatter.format(rentedCar.getFromDate());
                String toDate = formatter.format(rentedCar.getToDate());
                String advancedPayment = Double.toString(rentedCar.getAdvancedPayment());
                String perDayRent = Double.toString(rentedCar.getPerDayRent());

                // Create an array of Object to represent a row of data
                Object[] rowData = {rentalId, fromDate, toDate, advancedPayment, perDayRent};

                // Add the row data to the table model
                model.addRow(rowData);
            }

            // Set the table model for carDetailTable
            rentDetailTable.setModel(model);
        } catch (Exception ex) {
            Logger.getLogger(RentCarPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

// Helper method to clear rent-related input fields
    private void clearRentFields() {
        fromDate.setText("");
        toDate.setText("");
        advancedPayment.setText("");
        refundableDeposit.setText("");
        perDayRent.setText("");
        balance.setText("");
        // Clear other rent-related fields as needed
    }

// Implement a method to get the selected RentDto from the carDetailTable
    private RentDto getRentFromTable(int rowIndex) {
        // Retrieve the RentDto associated with the selected row in the table
        // and return it
        // You need to implement this method to match your table structure
        // and how you store RentDto objects in your table
        return null;
    }

    private void searchRent() {
        try {
            String rentId = rentDetailTable.getValueAt(rentDetailTable.getSelectedRow(), 1).toString();
            RentDto rentDto = rentController.getRentDetail(Integer.parseInt(rentId));
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
            if (rentDto != null) {
                String fromDate1 = formatter.format(rentDto.getFromDate());
                String toDate1 = formatter.format(rentDto.getToDate());
                fromDate.setText(fromDate1);
                toDate.setText(toDate1);
                advancedPayment.setText(Double.toString(rentDto.getAdvancedPayment()));
                refundableDeposit.setText(Double.toString(rentDto.getRefundableDeposit()));
                perDayRent.setText(Double.toString(rentDto.getPerDayRent()));
                balance.setText(Double.toString(rentDto.getBalance()));
            } else {
                JOptionPane.showMessageDialog(this, "Rent Not Found");
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}

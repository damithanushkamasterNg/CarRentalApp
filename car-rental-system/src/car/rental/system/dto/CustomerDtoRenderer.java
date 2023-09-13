/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.dto;

/**
 *
 * @author Damith
 */
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class CustomerDtoRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if (value instanceof CustomerDto) {
            CustomerDto customer = (CustomerDto) value;
            setText(customer.getName()); // Display the customer name
        }
        return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
    }
}

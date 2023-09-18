/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system.view;

/**
 *
 * @author Damith
 */
public class LayoutView extends javax.swing.JFrame {

    /**
     * Creates new form LayoutView
     */
    public LayoutView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        sideNavPanel = new javax.swing.JPanel();
        manageCustomnerButton = new javax.swing.JButton();
        manageCarsButton = new javax.swing.JButton();
        manageRentsButton = new javax.swing.JButton();
        manageCategoryButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(102, 102, 255));

        headerLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("CarRent Pro");
        headerLabel.setToolTipText("");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        sideNavPanel.setBackground(new java.awt.Color(204, 204, 255));

        manageCustomnerButton.setBackground(new java.awt.Color(102, 102, 255));
        manageCustomnerButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        manageCustomnerButton.setText("Manage Customer");
        manageCustomnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomnerButtonActionPerformed(evt);
            }
        });

        manageCarsButton.setBackground(new java.awt.Color(102, 102, 255));
        manageCarsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        manageCarsButton.setText("Manage Cars");
        manageCarsButton.setActionCommand("Manage Cars ");
        manageCarsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCarsButtonActionPerformed(evt);
            }
        });

        manageRentsButton.setBackground(new java.awt.Color(102, 102, 255));
        manageRentsButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        manageRentsButton.setText("Rents");
        manageRentsButton.setActionCommand("Manage Rents ");
        manageRentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRentsButtonActionPerformed(evt);
            }
        });

        manageCategoryButton.setBackground(new java.awt.Color(102, 102, 255));
        manageCategoryButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        manageCategoryButton.setText("Manage Car Category");
        manageCategoryButton.setToolTipText("");
        manageCategoryButton.setActionCommand("Manage Item\n");
        manageCategoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCategoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sideNavPanelLayout = new javax.swing.GroupLayout(sideNavPanel);
        sideNavPanel.setLayout(sideNavPanelLayout);
        sideNavPanelLayout.setHorizontalGroup(
            sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageCustomnerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(manageCarsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageRentsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideNavPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(manageCategoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        sideNavPanelLayout.setVerticalGroup(
            sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideNavPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageCustomnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageCarsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(manageRentsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
            .addGroup(sideNavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sideNavPanelLayout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(manageCategoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(290, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 881, Short.MAX_VALUE)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sideNavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sideNavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageCustomnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomnerButtonActionPerformed
        loadCustomerPanel();
    }//GEN-LAST:event_manageCustomnerButtonActionPerformed

    private void manageCarsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCarsButtonActionPerformed
        loadCarPanel();
    }//GEN-LAST:event_manageCarsButtonActionPerformed

    private void manageRentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRentsButtonActionPerformed
        loadManageRentPanel();
    }//GEN-LAST:event_manageRentsButtonActionPerformed

    private void manageCategoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCategoryButtonActionPerformed
        loadCategoryPanel();
    }//GEN-LAST:event_manageCategoryButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton manageCarsButton;
    private javax.swing.JButton manageCategoryButton;
    private javax.swing.JButton manageCustomnerButton;
    private javax.swing.JButton manageRentsButton;
    private javax.swing.JPanel sideNavPanel;
    // End of variables declaration//GEN-END:variables

    private void loadCustomerPanel() {
        bodyPanel.removeAll();
        CustomerPanel customerPanel = new CustomerPanel();
        customerPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(customerPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadCarPanel() {
        bodyPanel.removeAll();
        CarPanel carPanel = new CarPanel();
        carPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(carPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadManageRentPanel() {
        bodyPanel.removeAll();
        RentCarPanel rentCarPanel = new RentCarPanel();
        rentCarPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(rentCarPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

    private void loadCategoryPanel() {
        bodyPanel.removeAll();
        CategoryPanel categoryPanel = new CategoryPanel();
        categoryPanel.setSize(bodyPanel.getWidth(), bodyPanel.getHeight());
        bodyPanel.add(categoryPanel);
        bodyPanel.repaint();
        bodyPanel.revalidate();
    }

}

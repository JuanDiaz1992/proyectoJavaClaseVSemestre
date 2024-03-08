/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.graphicInterface.view;
import com.javaProject.controlers.OrderNumbers;

/**
 *
 * @author juann
 */
public class OrderNumbersView extends javax.swing.JPanel {
    
    /**
     * Creates new form LeapYearView
     */
    public OrderNumbersView() {
        initComponents();
    }
    public void validate(){
        String text = firstNumber.getText();
        int orderNumbersInt = Integer.parseInt(text);
        String text2 = secondNumber.getText();
        int secondNumberInt = Integer.parseInt(text2);
        String text3 = TirtNumber.getText();
        int TirtNumberInt = Integer.parseInt(text3);
        OrderNumbers orderNumbers = new OrderNumbers(orderNumbersInt, secondNumberInt, TirtNumberInt);
        String resultOperation = orderNumbers.organizer();
        result.setText(resultOperation);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        firstNumber = new javax.swing.JTextField();
        result = new javax.swing.JLabel();
        consult = new javax.swing.JButton();
        secondNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TirtNumber = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(355, 0));
        setPreferredSize(new java.awt.Dimension(355, 421));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingresa el primer número");

        firstNumber.setBackground(new java.awt.Color(102, 102, 102));
        firstNumber.setForeground(new java.awt.Color(255, 255, 255));

        result.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        consult.setForeground(new java.awt.Color(51, 51, 51));
        consult.setText("Ordenar ");
        consult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultMouseClicked(evt);
            }
        });
        consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultActionPerformed(evt);
            }
        });

        secondNumber.setBackground(new java.awt.Color(102, 102, 102));
        secondNumber.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Ingresa el segundo número");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingresa tercer número");

        TirtNumber.setBackground(new java.awt.Color(102, 102, 102));
        TirtNumber.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TirtNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secondNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TirtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void consultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultMouseClicked
        validate();
    }//GEN-LAST:event_consultMouseClicked

    private void consultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TirtNumber;
    private javax.swing.JButton consult;
    private javax.swing.JTextField firstNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel result;
    private javax.swing.JTextField secondNumber;
    // End of variables declaration//GEN-END:variables
}

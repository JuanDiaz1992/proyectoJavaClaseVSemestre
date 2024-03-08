/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.graphicInterface.view;
import com.javaProject.controlers.CurrencyConverter;

/**
 *
 * @author juann
 */
public class CurrencyConverterView extends javax.swing.JPanel {
    private int optionConversor;
    /**
     * Creates new form LeapYearView
     */
    public CurrencyConverterView() {
        initComponents();
    }
    public void validate(){
        String text = input.getText();
        int cop = Integer.parseInt(text);
        CurrencyConverter currencyConverter = new CurrencyConverter(cop, this.optionConversor);
        String resultOperation = currencyConverter.conversor();
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
        input = new javax.swing.JTextField();
        usd = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        eur = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(400, 421));
        setPreferredSize(new java.awt.Dimension(400, 421));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese un valor en COP");

        input.setBackground(new java.awt.Color(102, 102, 102));
        input.setForeground(new java.awt.Color(255, 255, 255));

        usd.setForeground(new java.awt.Color(51, 51, 51));
        usd.setText("USD  $");
        usd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usdMouseClicked(evt);
            }
        });

        result.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        result.setToolTipText("");
        result.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        eur.setForeground(new java.awt.Color(51, 51, 51));
        eur.setText("EUR €");
        eur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eurMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eur, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usdMouseClicked
        this.optionConversor = 1;
        validate();

    }//GEN-LAST:event_usdMouseClicked

    private void eurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eurMouseClicked
        this.optionConversor = 2;
        validate();
    }//GEN-LAST:event_eurMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eur;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel result;
    private javax.swing.JButton usd;
    // End of variables declaration//GEN-END:variables
}
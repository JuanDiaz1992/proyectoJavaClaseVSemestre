/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.graphicInterface.view;
import com.javaProject.controlers.DeleteDataFromHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author juann
 */
public class DeleteDataFromHashMapView extends javax.swing.JPanel {
    private Map<String, Integer> hashMap;
    /**
     * Creates new form LeapYearView
     */
    public DeleteDataFromHashMapView() {
        initComponents();       
        this.hashMap = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                hashMap.put("Valor"+i,i);
            }
        formatTable(hashMap);

        reset.setVisible(false);
        
    }
    
    public void formatTable(Map<String, Integer> hashMap){
        String[] newHeaders = {"Clave", "Valor"};

        // Crear un TreeMap a partir del HashMap para ordenarlo
        TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de agregar los datos

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            model.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }

        model.setColumnIdentifiers(newHeaders);
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
        consult = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(400, 421));
        setPreferredSize(new java.awt.Dimension(400, 421));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese un número entre 1 a 9");

        input.setBackground(new java.awt.Color(102, 102, 102));
        input.setForeground(new java.awt.Color(255, 255, 255));

        consult.setForeground(new java.awt.Color(51, 51, 51));
        consult.setText("Remover ✖️");
        consult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultMouseClicked(evt);
            }
        });

        result.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Elimina del hashmap los menores al número recibido");

        reset.setForeground(new java.awt.Color(51, 51, 51));
        reset.setText("Reiniciar");
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void consultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultMouseClicked
        try{
            String text = input.getText();
            int number = Integer.parseInt(text);
            DeleteDataFromHashMap deleteDataFromHashMap = new DeleteDataFromHashMap(this.hashMap,number);
            Map resultOperation = deleteDataFromHashMap.runProgram();
            if(resultOperation == null){
                result.setText("Ingrese un valor valido entre 1 a 9");
            }else{
                formatTable(resultOperation);
                result.setText("Los valores de la tabla se han reducido");
                consult.setVisible(false);
                reset.setVisible(true);
            }     
        }catch(NumberFormatException e){
            result.setText("Ingrese un valor valido entre 1 a 9");
        }

        
    }//GEN-LAST:event_consultMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        this.hashMap = new HashMap<>();
            for (int i = 0; i < 10; i++) {
                hashMap.put("Valor"+i,i);
            }
        formatTable(hashMap);
        reset.setVisible(false);
        consult.setVisible(true);
        result.setText("");
        input.setText("");
    }//GEN-LAST:event_resetMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consult;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JLabel result;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

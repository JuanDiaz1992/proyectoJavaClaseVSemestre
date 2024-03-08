/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.graphicInterface.view;
import com.javaProject.controlers.CalculateStudentAverage;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author juann
 */
public class CalculateStudentAverageView extends javax.swing.JPanel {
    private Map<String, double[]> studentGrades;
    /**
     * Creates new form LeapYearView
     */
    public CalculateStudentAverageView() {
        initComponents();       
        this.setData();
        this.formatTable(this.studentGrades,false,new double[0]);

        
    }
    public void setData(){
        this.studentGrades = new HashMap<>();
        this.studentGrades.put("Michael", new double[]{5, 4, 5});
        this.studentGrades.put("Maria", new double[]{3, 5, 2});
        this.studentGrades.put("Pedro", new double[]{4, 3, 0});
    }
    
    public void formatTable(Map<String, double[]> hashMap, boolean areThereNotes, double[] notes){
        TreeMap<String, double[]> sortedMap = new TreeMap<>(hashMap);
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        if(!areThereNotes){
            String[] newHeaders = {"Estudiante", "Notas"};
            model.setRowCount(0);
            for (Map.Entry<String, double[]> entry : sortedMap.entrySet()) {
                double[] value = entry.getValue();
                String values = Arrays.toString(value);
                model.addRow(new Object[]{entry.getKey(), values});
            }
            model.setColumnIdentifiers(newHeaders);
            
        }else{
            String[] newHeaders = {"Estudiante", "Notas", "Promedio"};
            model.setColumnIdentifiers(newHeaders);
            model.setRowCount(0);
            int iterador=0;
            for (Map.Entry<String, double[]> entry : sortedMap.entrySet()) {
                double[] value = entry.getValue();
                String values = Arrays.toString(value);
                String average = String.format("%.2f", notes[iterador]);
                System.out.println(average);
                model.addRow(new Object[]{entry.getKey(), values, average});
                iterador++;
            }
            model.fireTableDataChanged();
            
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consult = new javax.swing.JButton();
        result = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(400, 421));
        setPreferredSize(new java.awt.Dimension(400, 421));

        consult.setForeground(new java.awt.Color(51, 51, 51));
        consult.setText("Promediar");
        consult.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultMouseClicked(evt);
            }
        });

        result.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Calcula el promedio de notas de una lista de estudiantes.");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void consultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultMouseClicked
            CalculateStudentAverage calculateStudentAverage = new CalculateStudentAverage(this.studentGrades);
            double[] resultOperation = calculateStudentAverage.calculateAverage();
            formatTable(this.studentGrades,true,resultOperation);
            consult.setVisible(false);
            result.setText("Promedio realizado con éxito");
            
    }//GEN-LAST:event_consultMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consult;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel result;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
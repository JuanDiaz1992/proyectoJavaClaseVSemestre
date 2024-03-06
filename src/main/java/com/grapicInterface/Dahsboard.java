package com.grapicInterface;


import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Font;
import com.javaProject.clases.*;
import com.grapicInterface.view.*;
import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author juann
 */
public class Dahsboard extends javax.swing.JFrame {
    
    /**
     * Creates new form Dahsboard
     */
    public Dahsboard() {
        initComponents();
        initStyles();
    }
    private void panel(JPanel p){
        p.setSize(355, 344);
        p.setLocation(0,0);

        container.removeAll();
        container.add(p, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }       
    
    public void initStyles(){
        this.setLocationRelativeTo(null);
        /*
        mensaje.putClientProperty( "FlatLaf.style", "font: 14 $light.font" );
        welcome.putClientProperty( "FlatLaf.styleClass", "h1" );
        Font font = button1Panel.getFont(); 
        Font boldFont = new Font(font.getFontName(), Font.BOLD, 16);
        button1Panel.setFont(boldFont);
        button1Panel1.setFont(boldFont);
        button1Panel2.setFont(boldFont);
        button1Panel3.setFont(boldFont);
        */
        
        //Botones panel
        

        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        opc1 = new javax.swing.JButton();
        opc2 = new javax.swing.JButton();
        opc3 = new javax.swing.JButton();
        opc4 = new javax.swing.JButton();
        opc5 = new javax.swing.JButton();
        opc6 = new javax.swing.JButton();
        opc7 = new javax.swing.JButton();
        opc8 = new javax.swing.JButton();
        opc9 = new javax.swing.JButton();
        opc10 = new javax.swing.JButton();
        opc11 = new javax.swing.JButton();
        opc12 = new javax.swing.JButton();
        opc13 = new javax.swing.JButton();
        opc14 = new javax.swing.JButton();
        opc15 = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 184, 112));

        opc1.setBackground(new java.awt.Color(51, 51, 51));
        opc1.setText("Año Bisiesto");
        opc1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc1.setBorderPainted(false);
        opc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc1.setIconTextGap(12);
        opc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc1MouseClicked(evt);
            }
        });
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });
        opc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                opc1KeyPressed(evt);
            }
        });

        opc2.setBackground(new java.awt.Color(51, 51, 51));
        opc2.setText("Piedra, papel ...");
        opc2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc2.setBorderPainted(false);
        opc2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc2.setIconTextGap(12);
        opc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc2MouseClicked(evt);
            }
        });
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });
        opc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                opc2KeyPressed(evt);
            }
        });

        opc3.setBackground(new java.awt.Color(51, 51, 51));
        opc3.setText("C. Moneda");
        opc3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc3.setBorderPainted(false);
        opc3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc3.setIconTextGap(12);
        opc3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc3MouseClicked(evt);
            }
        });
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });
        opc3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                opc3KeyPressed(evt);
            }
        });

        opc4.setBackground(new java.awt.Color(51, 51, 51));
        opc4.setText("Año Bisiesto");
        opc4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc4.setBorderPainted(false);
        opc4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc4.setIconTextGap(12);
        opc4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc4MouseClicked(evt);
            }
        });
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });
        opc4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                opc4KeyPressed(evt);
            }
        });

        opc5.setBackground(new java.awt.Color(51, 51, 51));
        opc5.setText("Año Bisiesto");
        opc5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc5.setBorderPainted(false);
        opc5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc5.setIconTextGap(12);
        opc5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc5MouseClicked(evt);
            }
        });
        opc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc5ActionPerformed(evt);
            }
        });
        opc5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                opc5KeyPressed(evt);
            }
        });

        opc6.setBackground(new java.awt.Color(51, 51, 51));
        opc6.setText("Año Bisiesto");
        opc6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc6.setBorderPainted(false);
        opc6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc6.setIconTextGap(12);
        opc6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc6MouseClicked(evt);
            }
        });
        opc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc6ActionPerformed(evt);
            }
        });
        opc6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                opc6KeyPressed(evt);
            }
        });

        opc7.setBackground(new java.awt.Color(51, 51, 51));
        opc7.setText("Año Bisiesto");
        opc7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc7.setBorderPainted(false);
        opc7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc7.setIconTextGap(12);

        opc8.setBackground(new java.awt.Color(51, 51, 51));
        opc8.setText("Año Bisiesto");
        opc8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc8.setBorderPainted(false);
        opc8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc8.setIconTextGap(12);

        opc9.setBackground(new java.awt.Color(51, 51, 51));
        opc9.setText("Año Bisiesto");
        opc9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc9.setBorderPainted(false);
        opc9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc9.setIconTextGap(12);

        opc10.setBackground(new java.awt.Color(51, 51, 51));
        opc10.setText("Año Bisiesto");
        opc10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc10.setBorderPainted(false);
        opc10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc10.setIconTextGap(12);

        opc11.setBackground(new java.awt.Color(51, 51, 51));
        opc11.setText("Año Bisiesto");
        opc11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc11.setBorderPainted(false);
        opc11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc11.setIconTextGap(12);

        opc12.setBackground(new java.awt.Color(51, 51, 51));
        opc12.setText("Año Bisiesto");
        opc12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc12.setBorderPainted(false);
        opc12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc12.setIconTextGap(12);

        opc13.setBackground(new java.awt.Color(51, 51, 51));
        opc13.setText("Año Bisiesto");
        opc13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc13.setBorderPainted(false);
        opc13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc13.setIconTextGap(12);

        opc14.setBackground(new java.awt.Color(51, 51, 51));
        opc14.setText("Año Bisiesto");
        opc14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc14.setBorderPainted(false);
        opc14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc14.setIconTextGap(12);

        opc15.setBackground(new java.awt.Color(51, 51, 51));
        opc15.setText("Año Bisiesto");
        opc15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc15.setBorderPainted(false);
        opc15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc15.setIconTextGap(12);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(opc9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(opc6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(opc15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opc2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opc4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opc6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opc8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opc11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opc12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opc13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opc14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opc15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        container.setMinimumSize(new java.awt.Dimension(355, 0));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opc6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opc6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc6KeyPressed

    private void opc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc6ActionPerformed

    private void opc6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_opc6MouseClicked

    private void opc5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opc5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc5KeyPressed

    private void opc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc5ActionPerformed

    private void opc5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_opc5MouseClicked

    private void opc4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opc4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc4KeyPressed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc4ActionPerformed

    private void opc4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_opc4MouseClicked

    private void opc3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opc3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc3KeyPressed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc3MouseClicked
        CurrencyConverterView currencyConverterView= new CurrencyConverterView();
        panel(currencyConverterView);
    }//GEN-LAST:event_opc3MouseClicked

    private void opc2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opc2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc2KeyPressed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc2MouseClicked
        RockPaperScissorsView rockPaperScissorsView = new RockPaperScissorsView();
        panel(rockPaperScissorsView);
    }//GEN-LAST:event_opc2MouseClicked

    private void opc1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opc1KeyPressed

    }//GEN-LAST:event_opc1KeyPressed

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc1MouseClicked
        LeapYearView year = new LeapYearView();
        panel(year);
    }//GEN-LAST:event_opc1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dahsboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dahsboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dahsboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dahsboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dahsboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton opc1;
    private javax.swing.JButton opc10;
    private javax.swing.JButton opc11;
    private javax.swing.JButton opc12;
    private javax.swing.JButton opc13;
    private javax.swing.JButton opc14;
    private javax.swing.JButton opc15;
    private javax.swing.JButton opc2;
    private javax.swing.JButton opc3;
    private javax.swing.JButton opc4;
    private javax.swing.JButton opc5;
    private javax.swing.JButton opc6;
    private javax.swing.JButton opc7;
    private javax.swing.JButton opc8;
    private javax.swing.JButton opc9;
    // End of variables declaration//GEN-END:variables
}
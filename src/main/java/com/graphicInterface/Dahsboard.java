package com.graphicInterface;


import com.graphicInterface.view.*;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Font;
import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JPanel;

public class Dahsboard extends javax.swing.JFrame {

    public Dahsboard() {
        initComponents();
        initStyles();
    }

    //Este método toma el Jpanel que se le pase por parámetro
    //Y lo añade al Jpanel principal
    private void panel(JPanel p){
        p.setSize(400, 421);
        p.setLocation(0,0);
        container.removeAll();
        container.add(p, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }       
    
    public void initStyles(){
        //Estilos de la libreria FlatLaf
        this.setLocationRelativeTo(null);
        title.putClientProperty( "FlatLaf.styleClass", "h1" );    
    }
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
        titleMenu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
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
        opc4.setText("Interés Compuesto");
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
        opc5.setText("Sumar digitos");
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
        opc6.setText("Crear figura");
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
        opc7.setText("Ordenar 3 núm...");
        opc7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc7.setBorderPainted(false);
        opc7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc7.setIconTextGap(12);
        opc7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc7MouseClicked(evt);
            }
        });
        opc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc7ActionPerformed(evt);
            }
        });

        opc8.setBackground(new java.awt.Color(51, 51, 51));
        opc8.setText("Sumar números");
        opc8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc8.setBorderPainted(false);
        opc8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc8.setIconTextGap(12);
        opc8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc8MouseClicked(evt);
            }
        });

        opc9.setBackground(new java.awt.Color(51, 51, 51));
        opc9.setText("MCD");
        opc9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc9.setBorderPainted(false);
        opc9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc9.setIconTextGap(12);
        opc9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc9MouseClicked(evt);
            }
        });

        opc10.setBackground(new java.awt.Color(51, 51, 51));
        opc10.setText("Max");
        opc10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc10.setBorderPainted(false);
        opc10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc10.setIconTextGap(12);
        opc10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc10MouseClicked(evt);
            }
        });
        opc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc10ActionPerformed(evt);
            }
        });

        opc11.setBackground(new java.awt.Color(51, 51, 51));
        opc11.setText("Producto List");
        opc11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc11.setBorderPainted(false);
        opc11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc11.setIconTextGap(12);
        opc11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc11MouseClicked(evt);
            }
        });

        opc12.setBackground(new java.awt.Color(51, 51, 51));
        opc12.setText("Eliminar Dupli...");
        opc12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc12.setBorderPainted(false);
        opc12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc12.setIconTextGap(12);
        opc12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc12MouseClicked(evt);
            }
        });

        opc13.setBackground(new java.awt.Color(51, 51, 51));
        opc13.setText("Eliminar impares");
        opc13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc13.setBorderPainted(false);
        opc13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc13.setIconTextGap(12);
        opc13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc13MouseClicked(evt);
            }
        });

        opc14.setBackground(new java.awt.Color(51, 51, 51));
        opc14.setText("Valores Hashm..");
        opc14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc14.setBorderPainted(false);
        opc14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc14.setIconTextGap(12);
        opc14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc14MouseClicked(evt);
            }
        });

        opc15.setBackground(new java.awt.Color(51, 51, 51));
        opc15.setText("Promedio estudi");
        opc15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        opc15.setBorderPainted(false);
        opc15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opc15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        opc15.setIconTextGap(12);
        opc15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opc15MouseClicked(evt);
            }
        });

        titleMenu.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        titleMenu.setForeground(new java.awt.Color(0, 0, 0));
        titleMenu.setText("Menú Principal");

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
                            .addComponent(opc13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opc10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(opc4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(opc6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(opc12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(opc15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(titleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Bienvenido");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(title)
                .addContainerGap())
        );

        container.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        container.setMinimumSize(new java.awt.Dimension(355, 0));
        container.setPreferredSize(new java.awt.Dimension(400, 0));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Elige alguna de las opciones del menú 😊");
        jLabel2.setIconTextGap(0);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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


    //Estos son los eventos click de todos los botones
    //Cada botón llama a un view diferente.
    private void opc6MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Crear figura");
        AsterisksPatternView asterisksPatternView = new AsterisksPatternView();
        panel(asterisksPatternView);

    }
    private void opc5MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Sumar una cadena de digitos");
        AddDigitsView addDigitsView = new AddDigitsView();
        panel(addDigitsView);
    }
    private void opc4MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Validar interes compuesto");
        CompoundInterestView compoundInterestView = new CompoundInterestView();
        panel(compoundInterestView);
    }
    private void opc3MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Convertidor de moneda");
        CurrencyConverterView currencyConverterView= new CurrencyConverterView();
        panel(currencyConverterView);
    }
    private void opc2MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Piedra, papel o tijera");
        RockPaperScissorsView rockPaperScissorsView = new RockPaperScissorsView();
        panel(rockPaperScissorsView);
    }
    private void opc7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc7MouseClicked
        title.setText("Ordenar 3 números");
        OrderNumbersView orderNumbersView = new OrderNumbersView();
        panel(orderNumbersView);
        
    }
    private void opc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc1MouseClicked
        title.setText("Validar si un año es bisiesto");
        LeapYearView year = new LeapYearView();
        panel(year);
    }

    private void opc8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opc8MouseClicked
        title.setText("Sumar números aleatorios");
        AddRandomNumbersView addRandomNumbersView = new AddRandomNumbersView();
        panel(addRandomNumbersView);
        
    }

    private void opc9MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Mínimo común denominador");
        McdView mcdView= new McdView();
        panel(mcdView);
    }

    private void opc11MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Producto de una lista");    
        ProductOfEvenNumbersView productOfEvenNumbersView = new ProductOfEvenNumbersView();
        panel(productOfEvenNumbersView);
    }

    private void opc10MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Número más grande de una lista");
        MaxNumView maxNumView = new MaxNumView();
        panel(maxNumView);
    }

    private void opc12MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Eliminar duplicados de una lista");
        RemoveDuplicatesView removeDuplicatesView = new RemoveDuplicatesView();
        panel(removeDuplicatesView);
    }

    private void opc13MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Eliminar impares de una lista");
        RemoveOddView removeOddView = new RemoveOddView();
        panel(removeOddView);
    }

    private void opc14MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Eliminar valores a un hashmap");
        DeleteDataFromHashMapView deleteDataFromHashMapView = new DeleteDataFromHashMapView();
        panel(deleteDataFromHashMapView);
    }

    private void opc15MouseClicked(java.awt.event.MouseEvent evt) {
        title.setText("Promedio estudiantes");
        CalculateStudentAverageView calculateStudentAverageView = new CalculateStudentAverageView();
        panel(calculateStudentAverageView);
    }


    private void opc6KeyPressed(java.awt.event.KeyEvent evt) {}
    private void opc6ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void opc5KeyPressed(java.awt.event.KeyEvent evt) {}
    private void opc5ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void opc4KeyPressed(java.awt.event.KeyEvent evt) {}
    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void opc3KeyPressed(java.awt.event.KeyEvent evt) {}
    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void opc2KeyPressed(java.awt.event.KeyEvent evt) {}
    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void opc1KeyPressed(java.awt.event.KeyEvent evt) {}
    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void opc7ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void opc10ActionPerformed(java.awt.event.ActionEvent evt) {}


    public static void main(String args[]) {

        FlatMaterialLighterIJTheme.setup(); //Aquí se carga la libreria de estilos FlatLaf

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dahsboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleMenu;
    // End of variables declaration//GEN-END:variables
}

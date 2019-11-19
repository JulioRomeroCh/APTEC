package com.mycompany.aptec;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Graphical_User_Interface extends javax.swing.JFrame {

    Pintar pintar = new Pintar();
    Arboles arboles = new Arboles();
    TaskQueue tq = new TaskQueue();

    int count = 0;

    public static void R_repaint(int tope, Arboles arboles) {
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    Pintar.pintarLinea(jPanel2.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            Pintar.pintarCirculo(jPanel2.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), String.valueOf(arboles.getNombre(j)));
        }
    }

    public static int ingresarNodoOrigen(String nodoOrige, String noExiste, int tope) {
        int nodoOrigen = 0;
        try {
            nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog("" + nodoOrige));
            if (nodoOrigen >= tope) {
                JOptionPane.showMessageDialog(null, "" + noExiste + "\nDebe de ingresar  un Nodo existente");
                nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
            }
        } catch (Exception ex) {
            nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
        }
        return nodoOrigen;
    }

    public int ingresarTamano(String tama) {
        int tamano = 0;
        try {
            tamano = Integer.parseInt(JOptionPane.showInputDialog("" + tama));
            if (tamano < 1) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar un Tamaño Aceptado..");
                tamano = ingresarTamano(tama);
            }
        } catch (Exception ex) {
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }

    public boolean cicDerechoSobreNodo(int xxx, int yyy) {
        
        for (int j = 0; j < tope; j++) {
            if ((xxx + 2) > arboles.getCordeX(j) && xxx < (arboles.getCordeX(j) + 13) && (yyy + 2) > arboles.getCordeY(j) && yyy < (arboles.getCordeY(j) + 13)) {

                if (n == 0) {
                    id = j;
                    R_repaint(tope, arboles);
                    Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.orange);
                    n++;
                } else {
                    id2 = j;
                    n++;
                    Pintar.clickSobreNodo(jPanel2.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), null, Color.orange);
                    if (id == id2) {
                        n = 0;
                        Pintar.pintarCirculo(jPanel2.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), String.valueOf(arboles.getNombre(id)));
                        id = -1;
                        id2 = -1;
                    }
                }
                nn = 0;
                return true;
            }
        }
        return false;

    }

    public void clicIzqSobreNodo(int xxx, int yyy) {
        System.out.println("Tocado");
        System.out.println("T: " + arboles.getNombre(n));

        
        
        String combo_3_text = (String) jComboBox3.getSelectedItem();
        String combo_3_text_recortado = combo_3_text.substring(0, 1);
        System.out.println("Recortado: " + combo_3_text_recortado);

        ///////////////////////////String arr_cuatr = tq.GetID();
        //System.out.println("ID's: " + arr_cuatr);
        ///////////////////////////String[] partes_cuatr = arr_cuatr.split(",");
        /*
        if(tq.GetID().equals(""))
        JOptionPane.showMessageDialog(null, "ID: " + t.getID() + "\n" +
                          "Description: " + t.getDescription() + "\n" +
                            "Complexity: " + t.getComplexity() + "\n" +
                            "Supervisor: " + t.getSupervisor() + "\n" +
                                  "Type: " + t.getTaskType());
*/
    }

    public Graphical_User_Interface() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jmapa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("NEW TASK");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Description:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Complexity:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Supervisor:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Type:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operative Task", "Approval Task", "Contract Sign", "Management", "Changes" }));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jmapa, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jmapa, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(jTextField3)
                                            .addComponent(jTextField2)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, 0, 142, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jTextField4))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton1)))
                        .addGap(77, 77, 77)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(154, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28))))
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tope <= 1) {
            JOptionPane.showMessageDialog(null, "No hay nodo aún");
        } else {
            //this.setEnabled(false);
            new Arista(arboles, pintar, tope, this).setVisible(true);
            R_repaint(tope, arboles);
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        //if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("")) {
        //JOptionPane.showMessageDialog(null, "Error, complete all the fields");
        //} else {
        
        int xxx, yyy;
        xxx = evt.getX();
        yyy = evt.getY();
        if (evt.isMetaDown()) {
            clicIzqSobreNodo(xxx, yyy);
            if (nn == 2) {
                nn = 0;
                Algoritmo_Dijkstra Dijkstra = new Algoritmo_Dijkstra(arboles, tope, permanente, nodoFin);
                Dijkstra.dijkstra();

            }
        } else {
            if (!cicDerechoSobreNodo(xxx, yyy)) {
                if (tope < 50) {
                    arboles.setCordeX(tope, xxx);
                    arboles.setCordeY(tope, yyy);
                    arboles.setNombre(tope, tope);
                    Pintar.pintarCirculo(jPanel2.getGraphics(), arboles.getCordeX(tope), arboles.getCordeY(tope), String.valueOf(arboles.getNombre(tope)));
                    tope++;
                } else {
                    JOptionPane.showMessageDialog(null, "Se ha llegado al Maximo de nodos..");
                }
            }
            /*
            if (n == 2) {
                n = 0;
                int ta = ingresarTamano("Ingrese Tamaño");
                if (aristaMayor < ta) {
                    aristaMayor = ta;
                }
                arboles.setmAdyacencia(id2, id, 1);
                arboles.setmAdyacencia(id, id2, 1);
                arboles.setmCoeficiente(id2, id, ta);
                arboles.setmCoeficiente(id, id2, ta);
                Pintar.pintarLinea(jPanel2.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), arboles.getCordeX(id2), arboles.getCordeY(id2), ta);
                Pintar.pintarCirculo(jPanel2.getGraphics(), arboles.getCordeX(id), arboles.getCordeY(id), String.valueOf(arboles.getNombre(id)));
                Pintar.pintarCirculo(jPanel2.getGraphics(), arboles.getCordeX(id2), arboles.getCordeY(id2), String.valueOf(arboles.getNombre(id2)));
                id = -1;
                id2 = -1;

            }
            */
            System.out.println(Integer.toString(n) + "(" + jTextField1.getText() + ")");
            String origen = (Integer.toString(n) + "(" + jTextField1.getText() + ")");
            String destino = (Integer.toString(n) + "(" + jTextField1.getText() + ")");
            jComboBox2.addItem(origen);
            jComboBox3.addItem(destino);

            n++;
            
            Task tk = new Task();           
            tk.setID(Integer.parseInt(jTextField1.getText()));
            tk.setDescription(jTextField2.getText());
            tk.setComplexity(jTextField3.getText());
            tk.setSupervisor(jTextField4.getText());
            tk.setTaskType(jComboBox1.getSelectedItem().toString());
            tq.enqueue(tk);
            System.out.println("Cola: " + tq);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }

        //}

    }//GEN-LAST:event_jPanel2MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int x;
        int y;
        int ta;

        String combo_1_text = (String) jComboBox2.getSelectedItem();
        String combo_1_text_recortado = combo_1_text.substring(0, 1);
        System.out.println(combo_1_text_recortado);
        
        
        String combo_2_text = (String) jComboBox3.getSelectedItem();
        String combo_2_text_recortado = combo_2_text.substring(0, 1);
        System.out.println(combo_2_text_recortado);
        
        
        x = Integer.parseInt(combo_1_text_recortado);
        System.out.println(x);
        
        
        y = Integer.parseInt(combo_2_text_recortado);
        System.out.println(y);
        
        
        ta = Integer.parseInt(jTextField5.getText());
        System.out.println(ta);

        if (x == y) {
            JOptionPane.showMessageDialog(null, "Error.. Debe digitar un nodo diferente a : " + y);
        } else if (x < 0  || y < 0) {
            JOptionPane.showMessageDialog(null, "Error.. Nodos No validos ");
        } else {
            arboles.setmAdyacencia(x, y, 1);
            arboles.setmAdyacencia(y, x, 1);
            jTextField5.setText("");
            Pintar.pintarLinea(Graphical_User_Interface.jPanel2.getGraphics(), arboles.getCordeX(x), arboles.getCordeY(x), arboles.getCordeX(y), arboles.getCordeY(y), ta);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Graphical_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graphical_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graphical_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graphical_User_Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graphical_User_Interface().setVisible(true);
            }
        });
    }

    private int tope = 0;// lleva el # de nodos creado 
    private int nodoFin;
    private int permanente;
    int n = 0, nn = 0, id, id2;// permite controlar que se halla dado click sobre un nodo
    private int aristaMayor;
    private int i = 1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel jmapa;
    // End of variables declaration//GEN-END:variables
}

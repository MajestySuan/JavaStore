/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tecnologia;
import java.awt.Color;
/**
 *
 * @author Liu
 */
public class User_Info extends javax.swing.JFrame {
    int xMouse, yMouse;
    /**
     * Creates new form User_Info
     */
    public User_Info() {
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

        jPanel1 = new javax.swing.JPanel();
        Barra_exit = new javax.swing.JPanel();
        Exit = new javax.swing.JPanel();
        ExitTxt = new javax.swing.JLabel();
        Opcion_Recibo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Tarjeta_Comprador = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Direccion_Comprador = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        ID_Comprador = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Nombre_Comprador = new javax.swing.JTextField();
        Comprar = new javax.swing.JPanel();
        Comprar_txt = new javax.swing.JLabel();

        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(440, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Barra_exit.setBackground(new java.awt.Color(255, 255, 255));
        Barra_exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Barra_exitMouseDragged(evt);
            }
        });
        Barra_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Barra_exitMousePressed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setForeground(new java.awt.Color(255, 255, 255));

        ExitTxt.setBackground(new java.awt.Color(255, 255, 255));
        ExitTxt.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        ExitTxt.setForeground(new java.awt.Color(0, 0, 0));
        ExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitTxt.setText("X");
        ExitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitTxtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit);
        Exit.setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Barra_exitLayout = new javax.swing.GroupLayout(Barra_exit);
        Barra_exit.setLayout(Barra_exitLayout);
        Barra_exitLayout.setHorizontalGroup(
            Barra_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_exitLayout.createSequentialGroup()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 380, Short.MAX_VALUE))
        );
        Barra_exitLayout.setVerticalGroup(
            Barra_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Barra_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        Opcion_Recibo.setBackground(new java.awt.Color(0, 0, 255));
        Opcion_Recibo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Opcion_Recibo.setForeground(new java.awt.Color(255, 255, 255));
        Opcion_Recibo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        Opcion_Recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion_ReciboActionPerformed(evt);
            }
        });
        jPanel1.add(Opcion_Recibo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACION PERSONAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 250, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE COMPLETO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DIRECCION:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NUMERO DE TARJETA DE CREDITO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("GENERAR RECIBO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 150, 10));

        Tarjeta_Comprador.setBorder(null);
        Tarjeta_Comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tarjeta_CompradorActionPerformed(evt);
            }
        });
        jPanel1.add(Tarjeta_Comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 150, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 280, 10));

        Direccion_Comprador.setBorder(null);
        Direccion_Comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Direccion_CompradorActionPerformed(evt);
            }
        });
        jPanel1.add(Direccion_Comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 280, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 320, 10));

        ID_Comprador.setBorder(null);
        ID_Comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_CompradorActionPerformed(evt);
            }
        });
        jPanel1.add(ID_Comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 320, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 230, 10));

        Nombre_Comprador.setBorder(null);
        Nombre_Comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_CompradorActionPerformed(evt);
            }
        });
        jPanel1.add(Nombre_Comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 230, -1));

        Comprar.setBackground(new java.awt.Color(0, 0, 255));
        Comprar.setForeground(new java.awt.Color(255, 255, 255));

        Comprar_txt.setBackground(new java.awt.Color(51, 51, 255));
        Comprar_txt.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        Comprar_txt.setForeground(new java.awt.Color(255, 255, 255));
        Comprar_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Comprar_txt.setText("Comprar");
        Comprar_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Comprar_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Comprar_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Comprar_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Comprar_txtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Comprar_txtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ComprarLayout = new javax.swing.GroupLayout(Comprar);
        Comprar.setLayout(ComprarLayout);
        ComprarLayout.setHorizontalGroup(
            ComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Comprar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ComprarLayout.setVerticalGroup(
            ComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ComprarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Comprar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_ExitTxtMouseClicked

    private void ExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseEntered
        Exit.setBackground(Color.red);
    }//GEN-LAST:event_ExitTxtMouseEntered

    private void ExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMouseExited
        Exit.setBackground(Color.white);
    }//GEN-LAST:event_ExitTxtMouseExited

    private void ExitTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitTxtMousePressed

    }//GEN-LAST:event_ExitTxtMousePressed

    private void Barra_exitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_exitMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse , y - yMouse);
    }//GEN-LAST:event_Barra_exitMouseDragged

    private void Opcion_ReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion_ReciboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opcion_ReciboActionPerformed

    private void Tarjeta_CompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tarjeta_CompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tarjeta_CompradorActionPerformed

    private void Direccion_CompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Direccion_CompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Direccion_CompradorActionPerformed

    private void ID_CompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_CompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_CompradorActionPerformed

    private void Nombre_CompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_CompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_CompradorActionPerformed

    private void Comprar_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar_txtMouseClicked
        Alerta_1 c= new Alerta_1();
        c.setVisible(true);
    }//GEN-LAST:event_Comprar_txtMouseClicked

    private void Comprar_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar_txtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Comprar_txtMouseEntered

    private void Comprar_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar_txtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Comprar_txtMouseExited

    private void Comprar_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Comprar_txtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Comprar_txtMousePressed

    private void Barra_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Barra_exitMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_Barra_exitMousePressed

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
            java.util.logging.Logger.getLogger(User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_exit;
    private javax.swing.JPanel Comprar;
    private javax.swing.JLabel Comprar_txt;
    private javax.swing.JTextField Direccion_Comprador;
    private javax.swing.JPanel Exit;
    private javax.swing.JLabel ExitTxt;
    private javax.swing.JTextField ID_Comprador;
    private javax.swing.JTextField Nombre_Comprador;
    private javax.swing.JComboBox<String> Opcion_Recibo;
    private javax.swing.JTextField Tarjeta_Comprador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}

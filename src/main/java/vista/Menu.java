/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Srami
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonIngresar = new javax.swing.JButton();
        botonMostrarMozo = new javax.swing.JButton();
        botonMostrarrecepcionista = new javax.swing.JButton();
        EliminarDatos = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        BotonNuevosEmpleados = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIngresar.setText("ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, -1));

        botonMostrarMozo.setText("Datos del Mozo");
        botonMostrarMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarMozoActionPerformed(evt);
            }
        });
        jPanel1.add(botonMostrarMozo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 150, -1));

        botonMostrarrecepcionista.setText("Datos del Recepcionista");
        botonMostrarrecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarrecepcionistaActionPerformed(evt);
            }
        });
        jPanel1.add(botonMostrarrecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        EliminarDatos.setText("EliminarDatos");
        EliminarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 150, -1));

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(botonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 150, -1));

        BotonNuevosEmpleados.setText("Nuevos");
        BotonNuevosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevosEmpleadosActionPerformed(evt);
            }
        });
        jPanel1.add(BotonNuevosEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avianca-787-dreamliner.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        VentanaIngresarDatos v1= new VentanaIngresarDatos();
v1.setVisible(true);
dispose();
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
      dispose();
VentanaPrincipal v1= new VentanaPrincipal();
v1.setVisible(true);
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonMostrarMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarMozoActionPerformed
        MostrarDatosMozo mz= new MostrarDatosMozo();
mz.setVisible(true);
dispose();
    }//GEN-LAST:event_botonMostrarMozoActionPerformed

    private void botonMostrarrecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarrecepcionistaActionPerformed
        MostrarDatosrecepcionista mr= new MostrarDatosrecepcionista();
mr.setVisible(true);
dispose();
    }//GEN-LAST:event_botonMostrarrecepcionistaActionPerformed

    private void EliminarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDatosActionPerformed
        VentanaEliminarDatos Eli= new VentanaEliminarDatos();
Eli.setVisible(true);
dispose();
    }//GEN-LAST:event_EliminarDatosActionPerformed

    private void BotonNuevosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevosEmpleadosActionPerformed
       dispose();

        permisosjefe m = new permisosjefe();
        m.setVisible(true);
    }//GEN-LAST:event_BotonNuevosEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonNuevosEmpleados;
    private javax.swing.JButton EliminarDatos;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonMostrarMozo;
    private javax.swing.JButton botonMostrarrecepcionista;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

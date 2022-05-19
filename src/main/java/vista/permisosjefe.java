/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Srami
 */
public class permisosjefe extends javax.swing.JFrame {

    Conexion cc = new Conexion();

    /**
     * Creates new form permisosjefe
     */
    public permisosjefe() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void Validar() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String usuario = CajaJefe.getText();
        String contraseña = ContraseñaJefe.getText();

        if (usuario.equals("") || contraseña.equals("")) {
            JOptionPane.showMessageDialog(null, "hay un campo vacio, por favor llenarlos");
        } else {
            try {
                con = cc.realizarConexion();
                pst = con.prepareStatement("select usuario,contraseña from jefe where nombre='" + usuario
                        + "' and contraseña ='" + contraseña + "'");
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.dispose();
                    registrar_usuarios m = new registrar_usuarios();
                    m.setVisible(true);
                } else {

                    JOptionPane.showMessageDialog(null, "credenciales incorrectas,vuelve a intentarlo");
                    CajaJefe.setText("");
                    ContraseñaJefe.setText("");

                }

            } catch (Exception e) {
                System.err.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Ocurrio un error,comunicate con los desarrolladores ");

            }
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CajaJefe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ContraseñaJefe = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 90, 20));

        CajaJefe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CajaJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaJefeActionPerformed(evt);
            }
        });
        jPanel1.add(CajaJefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 180, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        ContraseñaJefe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(ContraseñaJefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 180, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        BotonVolver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaJefeActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        dispose();
        Menu m = new Menu();
        m.setVisible(true);

    }//GEN-LAST:event_BotonVolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Validar();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JTextField CajaJefe;
    private javax.swing.JPasswordField ContraseñaJefe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

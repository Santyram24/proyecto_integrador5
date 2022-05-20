/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.SQLusuarios;
import controlador.UsuarioNuevos;
import javax.swing.JOptionPane;

/**
 *
 * @author Srami
 */
public class registrar_usuarios extends javax.swing.JFrame {

    /**
     * Creates new form registrar_usuarios
     */
    public registrar_usuarios() {
        initComponents();
        BtnRegistrar.setEnabled(false);
        setLocationRelativeTo(null);
        this.setResizable(false);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        TextCorreo = new javax.swing.JTextField();
        TipoEmpBox = new javax.swing.JComboBox<>();
        TextContraseña = new javax.swing.JPasswordField();
        Textconfcontraseña = new javax.swing.JPasswordField();
        BtnRegistrar = new javax.swing.JButton();
        BtnVolver = new javax.swing.JButton();
        resultadoComboBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 70, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Confirmar contraseña:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Correo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo de empleado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        TextUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 200, -1));

        TextCorreo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(TextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 200, -1));

        TipoEmpBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TipoEmpBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        TipoEmpBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoEmpBoxItemStateChanged(evt);
            }
        });
        TipoEmpBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoEmpBoxActionPerformed(evt);
            }
        });
        jPanel1.add(TipoEmpBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 50, -1));

        TextContraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(TextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 200, 30));

        Textconfcontraseña.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(Textconfcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 200, -1));

        BtnRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        BtnVolver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        resultadoComboBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        resultadoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(resultadoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 130, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCorreoActionPerformed

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void TipoEmpBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoEmpBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoEmpBoxActionPerformed

    private void resultadoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoComboBoxActionPerformed

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
        SQLusuarios modsql = new SQLusuarios();
        UsuarioNuevos mod = new UsuarioNuevos();
        String pass = new String(TextContraseña.getPassword());
        String passcon = new String(Textconfcontraseña.getPassword());
        String tipoEmpleado = (String) TipoEmpBox.getSelectedItem();
        int conversion = Integer.parseInt(tipoEmpleado);

        if (pass.equals(passcon)) {

            mod.setUsuario(TextUsuario.getText());
            mod.setContraseña(pass);
            mod.setCorreo(TextCorreo.getText());
            mod.setTipoEmpleado(conversion);

            if (modsql.registrar(mod)) {
                JOptionPane.showMessageDialog(this, "Registro Guardado");
                TextUsuario.setText("");
                TextContraseña.setText("");
                Textconfcontraseña.setText("");
                TextCorreo.setText("");

            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar");

            }
        } else {
            JOptionPane.showMessageDialog(this, "las contraseñas no coinciden");

        }

    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void TipoEmpBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoEmpBoxItemStateChanged
        String labor = (String) TipoEmpBox.getSelectedItem();
        if (labor.equals("0")) {
            resultadoComboBox.setText("");
            BtnRegistrar.setEnabled(false);
        }
        if (labor.equals("1")) {
            resultadoComboBox.setText("Recepcionista");
            BtnRegistrar.setEnabled(true);
        }
        if (labor.equals("2")) {
            resultadoComboBox.setText("Mozo");
            BtnRegistrar.setEnabled(true);
        }


    }//GEN-LAST:event_TipoEmpBoxItemStateChanged

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
         dispose();
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_BtnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JPasswordField TextContraseña;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JPasswordField Textconfcontraseña;
    private javax.swing.JComboBox<String> TipoEmpBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField resultadoComboBox;
    // End of variables declaration//GEN-END:variables
}

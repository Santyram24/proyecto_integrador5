/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Srami
 */
public class VentanaIngresarDatos extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIngresarDatos
     */
    public VentanaIngresarDatos() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cajaidpasajero = new javax.swing.JTextField();
        cajanombre = new javax.swing.JTextField();
        cajavuelo = new javax.swing.JTextField();
        cajaidequipaje = new javax.swing.JTextField();
        cajaPeso = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        Ingresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botonIngresa = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaidpasajero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cajaidpasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaidpasajeroActionPerformed(evt);
            }
        });
        jPanel2.add(cajaidpasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 190, -1));

        cajanombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(cajanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 190, -1));

        cajavuelo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(cajavuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 190, -1));

        cajaidequipaje.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(cajaidequipaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 190, -1));

        cajaPeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(cajaPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 190, -1));

        Volver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel2.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        Ingresar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Ingresar.setText("Ingresar");
        jPanel2.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 70, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Peso de equipaje:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 150, 40));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Id equipaje:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 120, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("No. Vuelo:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 90, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Id pasajero:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, 40));

        botonIngresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaper.jpg"))); // NOI18N
        jPanel2.add(botonIngresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaidpasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaidpasajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaidpasajeroActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        dispose();
Menu v= new Menu();
v.setVisible(true);

    }//GEN-LAST:event_VolverActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel botonIngresa;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JTextField cajaidequipaje;
    private javax.swing.JTextField cajaidpasajero;
    private javax.swing.JTextField cajanombre;
    private javax.swing.JTextField cajavuelo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*;

/**
 *
 * @author Srami
 */
public class SQLusuarios extends Conexion {

    public boolean registrar(UsuarioNuevos usr) {
        PreparedStatement ps = null;
        Connection con = realizarConexion();
        String sql = "insert into empleados(usuario,contraseña,correo,tipo_empleado) values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getContraseña());
            ps.setString(3, usr.getCorreo());
            ps.setInt(4, usr.getTipoEmpleado());
            ps.execute();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}

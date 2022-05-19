/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ximen
 */
public class SQLequipaje extends Conexion {
    
    public boolean registrar(DatosEquipaje eq) {
        PreparedStatement ps = null;
        Connection con = realizarConexion();
        String sql = "insert into equipaje(idpasajero,nombre,vuelo,idequipaje,peso) values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, eq.getIDpasajero());
            ps.setString(2, eq.getNombre());
            ps.setString(3, eq.getVuelo());
            ps.setString(4, eq.getIDequipaje());
            ps.setString(5, eq.getPeso());
            ps.execute();
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Srami
 */
public class Conexion {

    public Connection  con = null;

   

    public Conexion() {
    }

    public  Connection realizarConexion() {
        try {
            String userName = "root";
            String password = "";
            String url = "jdbc:mysql://localhost:3306/usuarios";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("conexion realizada");
        } catch (Exception e) {
            System.err.println("no se pudo conectar al servidor" + e.getMessage());
            e.printStackTrace();
        }
return con;

    }

}

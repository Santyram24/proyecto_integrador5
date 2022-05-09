/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Srami
 */
public class conexion {
    public static void main(String[] args) {
        connect();
    }
public static void connect(){
Connection conn= null;
try{
   conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaconexion?"
 + "useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode="
 + " false&serverTimezone=UTC","root","12Xlinuxvswindows");
if(conn!=null){
    System.out.println("conectado");
}
}catch(Exception e){
System.err.println("error");
}
}
}

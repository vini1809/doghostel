package conexao;

import java.sql.*;

 
public class Conexao {
 
public static Connection conector(){
    java.sql.Connection conect = null;
    
    String DRIVER = "com.mysql.cj.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/dbdoghostel?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String USER = "root";
    String PASS = "";
    
    try {
        Class.forName(DRIVER);
        conect = DriverManager.getConnection(URL, USER, PASS);
        System.out.println("conectado");
        return conect;
    } catch (Exception e) {
        System.out.println(e + "Servidor pode estar desligado");
        return null;
    }
    }
 
}
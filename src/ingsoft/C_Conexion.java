/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ingsoft;


import java.sql.*;

/**
 *
 * @author JuanDiego
 */
public class C_Conexion {
      Connection cn=null;
    public Connection abrir_conexion()
            {
               
        try {
                    
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/poli","root","");
            
        }
        catch (SQLException | ClassNotFoundException e2) {
            System.out.println("Error: "+e2.getMessage());
            
        }
        
        
        return cn;
            }
    
}

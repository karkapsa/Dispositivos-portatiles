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
public class C_fun {
  
    
    public boolean log(Usuario Usu)
    {
    C_Conexion con=new C_Conexion();
        Connection obcon=null;
        
        try{
            obcon=con.abrir_conexion();
            CallableStatement procedure=obcon.prepareCall("{call Log (?,?)}");
            procedure.setInt(1,Usu.getId_Usuario());
            procedure.setString(2,Usu.getContraseña());
            procedure.execute();
            
}
        catch (SQLException e2)
        {
            System.out.println("Error: "+e2.getMessage());
        }
        
    
        return true;
    }
    
    
}

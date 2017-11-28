/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-102
 */
public class ProbarConexion {
    public static void main(String[] args) {
        Connection con=null;
        try{
        con=Conexion.conectarse("root", "");
            System.out.println("te conectaste");
        }catch(ClassNotFoundException e){
             System.out.println("no se cargo biel el driver");   
        }catch(SQLException e){
            System.out.println("un error desql"+ e.getMessage());
        }finally{
            try { 
                if (con!=null) con.close();
                System.out.println("ya se cerro todo");
            } catch (SQLException ex) {
                //Logger.getLogger(ProbarConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

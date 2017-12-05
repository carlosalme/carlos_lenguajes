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
            //con la que se llama con vamos a generar una sentencia , la cual es una clase
            Statement at=con.createStatement();
            //generamos la tablita
            at.execute("create table tablita(id integer primary key, nombre varchar(40))");
            
            //caso 1: insert 
            //PreparedStatement st=con.prepareStatement("insert into tablita values(?,?)");
            //PreparedStatement st=con.prepareStatement("update tablita set nombre=? where id=?");
            //st.setInt(1,1);
            //st.setString(2, "Carlos E");
            //st.execute();
            //tambien se cierran las sentencias al igual que las conexiones 
            at.close();
            //st.close();
            System.out.println("tabla generado con exito");
            //System.out.println("rgistro insertado");
            
            
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

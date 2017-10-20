/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import java.util.ArrayList;
import java.util.List;
import javax.swing.SpringLayout;

/**
 *
 * @author T-102
 */
public class GeneradorUsuario {
    public static void main(String[] args) {
        
        //se van a generar 5 usuario
        Usuario u1=new Usuario();
        u1.setEdad(24);
        u1.setNombre("Carlos");
        u1.setMail("carlos@gmail.com");
        
        Usuario u2=new Usuario();
        u2.setEdad(23);
        u2.setNombre("Alejandro");
        u2.setMail("alejandro@gmail.com");
        
        Usuario u3=new Usuario();
        u3.setEdad(26);
        u3.setNombre("Ana");
        u3.setMail("ana@gmail.com");
        
        Usuario u4=new Usuario();
        u4.setEdad(20);
        u4.setNombre("Jimena");
        u4.setMail("jimena@gmail.com");
        
        Usuario u5=new Usuario();
        u5.setEdad(20);
        u5.setNombre("alexander");
        u5.setMail("alexander@gmail.com");
        
        
        //se va a generar un arreglo mutable 
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        //este arreglo solamente va a aceptar objetos de la clase usuario
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //se va a iterar para ver los nombres 
        for(Usuario u:usuarios){
            System.out.println("Nombre: "+u.getNombre());
            System.out.println("Edad: "+u.getEdad());
            System.out.println("e-mail: "+u.getMail());
        }
    }
}

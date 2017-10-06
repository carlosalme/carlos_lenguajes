/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;

import abstraccion.Usuario;

/**
 *
 * @author T-102
 */
public class Prueba2 {
    public static void main(String[] args) {
        /*Todos los referenciados pertenecen a una clase
        Se necesita uno de mas primitivos para definirlos */
        
        String nombre="Carlos Eduardo";
        String otro=new String("john coffey");
        Usuario u=new Usuario();
        u.setAltura(1.75f);
        u.setPeso(80);
    }
}

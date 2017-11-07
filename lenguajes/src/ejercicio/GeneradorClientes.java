/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author T-102
 */
public class GeneradorClientes {
    
    public ArrayList<Cliente> generarCliente(){
        
        ArrayList<Cliente> cliente =new ArrayList<Cliente>();
        
        Direccion dir1=new Direccion("Bosques de Guinea #72","Bosques de Aragon","nezahulacoyotl",57170);
        Direccion dir2=new Direccion("Plazuela 13 #3","Plazas de Aragon", "Nezahualcoyotl",57139);
        Direccion dir3=new Direccion("Mineros Matalurgicos 266","Monte Alto","azcapotzalco",02640);
        
        Cliente cl1=new Cliente("Carlos Almeida","ce.almeida@gmail.com",24,dir2);
        Cliente cl2=new Cliente("Arturo Zamudio","artur@gmail.com",23,dir1);
        Cliente cl3=new Cliente("Celia Almeida","mago@gmail.com",40,dir3);
        
        return cliente;
    }
}

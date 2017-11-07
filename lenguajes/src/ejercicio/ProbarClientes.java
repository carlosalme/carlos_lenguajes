/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author T-102
 */
public class ProbarClientes {
    public static void main(String[] args) {
        GeneradorClientes g=new GeneradorClientes();
         for(Cliente c:g.generarCliente()){
             System.out.println("Nombre: "+c.getNombre()+c.getEdad()+c.getEmail()+"Calle: "+c.getDireccion().getCalle()+"Colonia: "+c.getDireccion().getColonia()+"Municipio: "+c.getDireccion().getMunicipio()+"C.P.:"+c.getDireccion().getCp());
         }
         
    }
}

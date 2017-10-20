/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author T-102
 */
public interface Direccion {
    
    public int x=2;//los atributos SIMPRE se tienen que inicializar 
    //porque no tiene constructores que los inicialice
    
    //un metodo
    public void generarDireccion();//metodo abstracto, no tiene cuerpo 
    /*reglas de las interfaces 
    1)todos sus metodos son implicitamente abastractos 
    2)las interfaces NO tienen constructores 
    */
    
}

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
public class Cliente {
    String nombre;
    int edad;
    String email;
    Direccion direccion;
    
    //constructor por defecto
    public Cliente () {
    
    }
    
    //constructor de unicializacion de valores
    public Cliente(String nombre,String email,int edad, Direccion direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.email=email;
        this.direccion=direccion;
    }
    
    //encapsulacion de variables 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

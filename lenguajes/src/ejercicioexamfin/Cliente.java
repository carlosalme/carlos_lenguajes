/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamfin;

/**
 *
 * @author T-102
 */
public class Cliente {
    private String nombre;
    private int edad;
    private int id;
    private Direccion direccion;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre,int edad, int id,Direccion direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
        this.direccion=direccion;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

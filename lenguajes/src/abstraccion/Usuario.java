/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-102
 */
public class Usuario {
    private float peso;
    private float altura;
    
    public Usuario(float peso, float altura){
        this.peso=peso;
        this.altura=altura;
    }
    
    public Usuario(){
        System.out.println("el constructor"+peso +altura);
        peso=80;
        altura=175;
        
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}

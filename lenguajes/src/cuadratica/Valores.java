/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadratica;

/**
 *
 * @author T-107
 */
public class Valores {
    private float a;
    private float b;
    private float c;
    /* las funciones de pow y sqrt que calculan la potencia y la raiz cuadrada se 
    encuntran en la clase Math y sus valores por defecto son de tipo double
    */
    //obtener el determinante 
    float determinante(){
        float det=(float)(Math.pow(b, 2)-4*a*c);//se convierte el valore double por default a un float
        return det;
    }
    
    public String raiz1(){
        float det=determinante();
        String sol="raiz 1";
        if (det<0){
            sol="Raiz imaginaria";
        }
        else{
            //calculo del primer valor con conversion a flotante
            float r1=(float)((-b+Math.sqrt(det))/(2*a));
            sol="raiz 1: "+r1;
        }
        return sol;
    }
    
    public String raiz2(){
        float det=determinante();
        String sol="raiz 2";
        if (det<0){
            sol="Raiz imaginaria";
        }
        else{
            //calculo del segundo valor con conversion a flotante
            float r1=(float)((-b-Math.sqrt(det))/(2*a));
            sol="raiz 2: "+r1;
        }
        return sol;
    }
    
    public float getA(){
        return a;
    }
    
    public void setA(float a){
        this.a=a;
    }
    
    public float getB(){
        return b;
    }
    
    public void setB(float b){
        this.b=b;
    }
    
    public float getC(){
        return c;
    }
    
    public void setC(float c){
        this.c=c;
    }
    
    
    
    
}

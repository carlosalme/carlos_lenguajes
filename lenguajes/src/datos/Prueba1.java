/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author T-102
 */
public class Prueba1 {
    public static void main(String[] args) {
        
        //prueba de los datos integrales
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        //algunas de las lineas van a amrcar error 
        b=(byte)s; //casting forzado
        s=b; //casting implicito
        i=s;
        l=s;
        s=(short)l;
        b=(byte)l;
        //si se pone un valor, el valor por defecto es int
        
        //datos flotantes
        float f=2.0f;
        double d=2.0;
        
        //datos boleanos
        boolean b1=true;
        boolean b2=false;
        
        //datos de tipo caracter
        char algo='h';
        char otro=' ';
    }
}

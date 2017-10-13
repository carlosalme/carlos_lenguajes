/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;
import javax.swing.JFrame;

/**
 *
 * @author T-102
 */
public class ProbarConstructores {
    
    public static void main(String[] args) {
        
        //creamos un objeto de clase animal 
        Animal objanimal =new Animal();
        int x=15;
        //objanimal.setEdad(5);
        //impresion en patalla de los valores de la clase
        System.out.println(x);
        System.out.println(objanimal.isMuerde());
        System.out.println(objanimal.getEdad());
        System.out.println(objanimal.getNombre());
        
        Animal otro=new Animal(8);
        otro.setEdad(10);
        System.out.println(otro.getEdad());
        
        /* vamos a usar un constructor de una clase que no 
        hemos diseñado nosotros
        */
        JFrame ventana=new JFrame();
        ventana.setSize(300,300);
        ventana.setVisible(true);
    }
}

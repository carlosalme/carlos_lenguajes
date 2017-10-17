/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutable;

/**
 *
 * @author T-102
 */
public class Arreglos1 {
    public static void main(String[] args) {
        //se va a generar un arreglo no mutable/simple
        int x[]={12,-4,7}; //todos loas arreglos se empieza a contar desde 0
        
        System.out.println("el tamaño es "+x.length);
        /*length indica el tamaño del arreglo.
        Para acceder a un alemntop hacemos lo siguiente 
        */
        System.out.println("en el indice 0 esta: "+x[0]);
        //una exception es un error en tiempo de ejecucion 
        int []y={2,4,6}; //esta es otra forma de declarar los arreglos 
        int []z=new int[3];//crea un arrglo indicando solo su tamaño sin indicar sus valores
        z[0]=1;
        z[1]=3;//esta es la forma en la que se asignan los valores al arreglo 
        z[2]=6;//que solo se declaro con el tamaño 
        
        //para iterar(recorrer) un arreglo se utiliza el ciclo for
        //ciclo for tradicional 
        for(int a=0;a<z.length;a++)
        {
            System.out.println(z[a]);//imprime el valor de z que se encuentre en el ciclo
        }
        
        //ciclo for mejorado 
        for(int i:z)//se asigna al valor de i lo que tenga z en cada vuelta 
        {
            System.out.println("Mejorado"+i);
        }
        
        String mensaje="Hola como estas";
        byte []w=mensaje.getBytes();//convierte valores a una cadena de bytes
        System.out.println("Tamaño "+w.length);
        String codificado="";
        for(int o:w)
        {
            System.out.println("el byte es: "+o);
            codificado=codificado+o;
        }
        System.out.println("El mensaje codificado es:");
        System.out.println(codificado);
    }
}

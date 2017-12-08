/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Calendar;

/**
 *
 * @author T-102
 */

public class RelojitoChafa implements Runnable{
    public static void main(String[] args) {
     
        //creamos el thread con este interface 
        Runnable r=new RelojitoChafa();
        Thread t1=new Thread(r);
        t1.start();
        
    }
    
    //metodo runnable
    public void run(){
        while(true){
            try{
        Calendar c=Calendar.getInstance();
        //sacamos la hora del sistema
        Thread.sleep(1000);//mantiene al thread dormido durante un segundo
        int hora=c.get(Calendar.HOUR);
        int minuto=c.get(Calendar.MINUTE);
        int segundo=c.get(Calendar.SECOND);
        System.out.println("La hora es "+hora+":"+minuto+":"+segundo);
            }catch(InterruptedException e){
            }
        }
    }
}

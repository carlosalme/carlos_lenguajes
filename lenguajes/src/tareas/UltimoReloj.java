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
public class UltimoReloj {

    public static void main(String[] args) {
        //cuando existe un new dentro un constructor se le llama clase interna anonima 
        //tambien son conocidos como bachground thread
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Calendar c = Calendar.getInstance();
                        //sacamos la hora del sistema
                        Thread.sleep(1000);//mantiene al thread dormido durante un segundo
                        int hora = c.get(Calendar.HOUR);
                        int minuto = c.get(Calendar.MINUTE);
                        int segundo = c.get(Calendar.SECOND);
                        System.out.println("La hora es " + hora + ":" + minuto + ":" + segundo);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        t1.start();
    }
}

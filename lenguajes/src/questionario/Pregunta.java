/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionario;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author T-102
 */
public class Pregunta {
    private String titulo;
     private ArrayList<Opcion> opciones;

    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public Pregunta(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getRespuestas() {
        return opciones;
    }

    public void setRespuestas(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }
    
}

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
public class Direccion {

    private String calle;
    private String colonia;
    private String municipio;
    private long cp;
    
    //constructor por defecto
    public Direccion(){
        
    }
    
    //contructor para inicializar variables
    public Direccion(String calle, String colonia, String municipio, long cp){
        this.calle=calle;
        this.colonia=colonia;
        this.municipio=municipio;
        this.cp=cp;
    }
    
    //encapsulacion de variables
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }
}

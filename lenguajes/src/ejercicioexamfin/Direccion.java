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
public class Direccion {
    private long cp;
    private String calle;
    private String municipio;
    
    public Direccion(){
        
    }
    
    public Direccion(long cp,String calle,String municipio){
        this.cp=cp;
        this.calle=calle;
        this.municipio=municipio;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}

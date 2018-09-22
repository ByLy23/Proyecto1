/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author byron
 */
public class Pais {
    public Pais(float tipoCambio, float gananciaCambio){
        idPais=1;
        nombrePais= "Guatemala";
        Moneda= "Quetzal";
        this.tipoCambio=tipoCambio;
        this.gananciaCambio=gananciaCambio;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    public float getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(float tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public float getGananciaCambio() {
        return gananciaCambio;
    }

    public void setGananciaCambio(float gananciaCambio) {
        this.gananciaCambio = gananciaCambio;
    }
    
    private int idPais;
    private String nombrePais;
    private String Moneda;
    private float tipoCambio;
    private float gananciaCambio;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import javax.swing.*;

/**
 *
 * @author byron
 */
public class Compra{
    private String fechaPago;
    private String horaPago;
    private String correoUsuario;
    private double tipoCambio=7.5;
    private double montoDestino;

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(String horaPago) {
        this.horaPago = horaPago;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double getMontoDestino() {
        
        return montoDestino;
    }

    public void setMontoDestino(double montoDestino) {
        this.montoDestino = montoDestino;
    }

    public Compra(String fechaPago, String horaPago, String correoUsuario, double montoDestino,double tipoCambio) {
        this.fechaPago = fechaPago;
        this.horaPago = horaPago;
        this.correoUsuario = correoUsuario;
        this.montoDestino = montoDestino;
        this.tipoCambio=tipoCambio;
    }
    
}

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
public class Venta {
    private int idRemitente;
    private int idBeneficiario;
    private String pais;
    private String fechaVenta;
    private String horaVenta;
    private int montoOrigen;
    private int numeroRemesa;
    private boolean estadoremesa=false;
    private boolean remesaactiva=false;
    private int hora;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    

    public boolean isEstadoremesa() {
        return estadoremesa;
    }

    public void setEstadoremesa(boolean estadoremesa) {
        this.estadoremesa = estadoremesa;
    }

    public boolean isRemesaactiva() {
        return remesaactiva;
    }

    public void setRemesaactiva(boolean remesaactiva) {
        this.remesaactiva = remesaactiva;
    }

    public int getNumeroRemesa() {
        return numeroRemesa;
    }

    public void setNumeroRemesa(int numeroRemesa) {
        this.numeroRemesa = numeroRemesa;
    }
    public int getMontoOrigen() {
        return montoOrigen;
    }

    public void setMontoOrigen(int montoOrigen) {
        this.montoOrigen = montoOrigen;
    }
    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public int getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(int idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(String horaVenta) {
        this.horaVenta = horaVenta;
    }
public Venta(){
    this.idRemitente = 0;
        this.idBeneficiario = 0;
        this.pais = "Guatemala";
        this.fechaVenta = "1/1/1900";
        this.horaVenta = "12:00";
        this.montoOrigen= 0;
        this.numeroRemesa= 0;
        estadoremesa= false;
        remesaactiva=false;
}
    public Venta(int idRemitente, int idBeneficiario, String pais, String fechaVenta, String horaVenta, int montoOrigen,int numeroRemesa,boolean estadoremesa,boolean remesaactiva,int hora) {
        this.idRemitente = idRemitente;
        this.idBeneficiario = idBeneficiario;
        this.pais = pais;
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        this.montoOrigen= montoOrigen;
        this.numeroRemesa= numeroRemesa;
        estadoremesa= false;
        remesaactiva=false;
        this.hora=hora;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + idRemitente + ", idBeneficiario=" + idBeneficiario + ", pais=" + pais + ", fechaVenta=" + fechaVenta + ", horaVenta=" + horaVenta + ", montoOrigen=" + montoOrigen + ", numeroRemesa=" + numeroRemesa + ", estadoremesa=" + estadoremesa + ", remesaactiva=" + remesaactiva + '}';
    }
    
}

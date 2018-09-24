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
public class CancelacionPago {
    private int numeroRemesa;
    private String fechaCancelacion;
    private String horacancelacion;
    private String usuario;
    private String motivo;

    public CancelacionPago(int numeroRemesa, String fechaCancelacion, String horacancelacion, String usuario, String motivo) {
        this.numeroRemesa = numeroRemesa;
        this.fechaCancelacion = fechaCancelacion;
        this.horacancelacion = horacancelacion;
        this.usuario = usuario;
        this.motivo = motivo;
    }

    public int getNumeroRemesa() {
        return numeroRemesa;
    }

    public void setNumeroRemesa(int numeroRemesa) {
        this.numeroRemesa = numeroRemesa;
    }

    public String getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public String getHoracancelacion() {
        return horacancelacion;
    }

    public void setHoracancelacion(String horacancelacion) {
        this.horacancelacion = horacancelacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}

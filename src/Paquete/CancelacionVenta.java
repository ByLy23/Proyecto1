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
public class CancelacionVenta {
    private int numeroRemesa;
    private String fechaCancelacion;
    private String horaCancelacion;
    private String correoUsuario;
    private String motivoCancelacion;

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

    public String getHoraCancelacion() {
        return horaCancelacion;
    }

    public void setHoraCancelacion(String horaCancelacion) {
        this.horaCancelacion = horaCancelacion;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public CancelacionVenta(int numeroRemesa, String fechaCancelacion, String horaCancelacion, String correoUsuario, String motivoCancelacion) {
        this.numeroRemesa = numeroRemesa;
        this.fechaCancelacion = fechaCancelacion;
        this.horaCancelacion = horaCancelacion;
        this.correoUsuario = correoUsuario;
        this.motivoCancelacion = motivoCancelacion;
    }
     public CancelacionVenta() {
        numeroRemesa=0;
        fechaCancelacion="";
        horaCancelacion="";
      correoUsuario="";
         motivoCancelacion="";
    }

    @Override
    public String toString() {
        return "CancelacionVenta{" + "numeroRemesa=" + numeroRemesa + ", fechaCancelacion=" + fechaCancelacion + ", horaCancelacion=" + horaCancelacion + ", correoUsuario=" + correoUsuario + ", motivoCancelacion=" + motivoCancelacion + '}';
    }
    
}

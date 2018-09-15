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
public class Usuario {
    protected int idRemitente, Telefono;
    protected String Nombre,Apellido,Nacionalidad,Direccion,Correo;
    protected String fechaNac;
    
    public Usuario() {
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public Usuario(Usuario user){
    }
    
    public Usuario(int idRemitente, String Nombre, String Apellido, String fechaNac, String Nacionalidad, String Direccion, int Telefono, String Correo,String Especial) {
        this.idRemitente = idRemitente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fechaNac = fechaNac;
        this.Nacionalidad = Nacionalidad;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
    }
    
}
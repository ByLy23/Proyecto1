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
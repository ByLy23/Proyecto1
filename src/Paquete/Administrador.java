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
public class Administrador extends Usuario{
   
    
    public Administrador(int idRemitente, String Nombre, String Apellido, String fechaNac, String Nacionalidad, String Direccion, String Telefono, String correo,String PasswordAdmin,String Password){
      super(idRemitente, Nombre, Apellido, fechaNac, Nacionalidad, Direccion, Telefono, correo, PasswordAdmin, Password);
    }    
}

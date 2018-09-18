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
public class Vendedor extends Usuario{
    public Vendedor(int idRemitente, String Nombre, String Apellido, String fechaNac, String Nacionalidad, String Direccion,String Telefono, String correo,String PasswordVendedor,String Password){
        super(idRemitente, Nombre, Apellido, fechaNac, Nacionalidad, Direccion, Telefono, correo,"Vendedor",Password);
        
    }


}

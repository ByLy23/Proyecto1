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
public class Beneficiario extends Usuario{
   public Beneficiario(int idBeneficiario, String Nombre, String Apellido, String fechaNac, String Nacionalidad, String Direccion, String Telefono, String correo,String Password){
       super(idBeneficiario, Nombre, Apellido, fechaNac, Nacionalidad, Direccion, Telefono, correo,"",Password);
   }

  
   
}

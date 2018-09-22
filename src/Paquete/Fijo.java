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
class Fijo extends Usuario{

    public Fijo(int idRemitente, String Nombre, String Apellido, String fechaNac, String Nacionalidad, String Direccion, String Telefono, String correo,String PasswordComprador,String Password){
      super(idRemitente, Nombre, Apellido, fechaNac, Nacionalidad, Direccion, Telefono, correo, PasswordComprador, Password);
  }

    public Fijo() {
    }


}

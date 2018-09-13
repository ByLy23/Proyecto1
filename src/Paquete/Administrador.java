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
    public Administrador(){
        super(1, "Byron", "Orellana", "12/12/1998", "Guatemala", "Direccion", 51313792,"orellanab80@gmail.com","Admin");

    }
    
    public Administrador(int idRemitente, String Nombre, String Apellido, String fechaNac, String Nacionalidad, String Direccion, int Telefono, String correo,String PasswordAdmin){
        super(1, "Byron", "Orellana", "12/12/1998", "Guatemala", "Direccion", 51313792,"orellanab80@gmail.com","Admin");   
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import javax.swing.JLabel;

/**
 *
 * @author byron
 */
public class Label extends JLabel{
    public Label(int x,int y, int ancho, int alto){
        setBounds(x,y,ancho,alto);
    }
    public void setNombre(String nombre){
        setText(nombre);
    }
   
}

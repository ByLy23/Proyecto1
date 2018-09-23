/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author byron
 */
public class ModuloVenta extends JFrame{
public ModuloVenta(){
    inicializarComponentes();
}
private void inicializarComponentes(){
    this.setSize(400,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle(Sesion.temp[0].getNombre()+" - Sistema de Remesas");
}
}

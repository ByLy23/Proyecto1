/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author byron
 */
public class MainAdmin extends JFrame{
    public MainAdmin(){
        inicializarComponentes();
    }
    public void inicializarComponentes(){
        //botones
        /*-------------------------------------*/
        BRegistro= new JButton("Registro");
        BRegistro.setBounds(50,50,100,40);
        BRegistro.addActionListener(this::registroActionPerformed);
        /*-------------------------------------*/
        //frame
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Admin - Sistema de Remesas");
        this.add(BRegistro);
    }
    private void registroActionPerformed(ActionEvent evt){
        new RegistroAdmin().setVisible(true);
        this.setVisible(false);
    }
    private JButton BRegistro;
}

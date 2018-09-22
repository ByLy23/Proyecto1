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
        colocarUser();
    }
    public void inicializarComponentes(){
        prueba= new JLabel("soy un label");
        prueba.setBounds(200,200, 300, 50);
        //botones
        /*-------------------------------------*/
        BRegistro= new JButton("Registro");
        BRegistro.setBounds(50,50,100,40);
        BRegistro.addActionListener(this::registroActionPerformed);
        /*-------------------------------------*/
        regreso= new JButton("Registro");
        regreso.setBounds(200,50,100,40);
        regreso.addActionListener(this::regresoActionPerformed);
        //frame
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Admin - Sistema de Remesas");
        this.add(BRegistro);
        this.add(prueba);
        this.add(regreso);
    }
    private void registroActionPerformed(ActionEvent evt){
        new RegistroAdmin().setVisible(true);
        this.setVisible(false);
    }
    private void regresoActionPerformed(ActionEvent evt){
        dispose();
        new Sesion().setVisible(true);
    }
    public void colocarUser(){
        prueba.setText(Sesion.temp[0].getNombre()+" "+" "+Sesion.temp[0].getDireccion());
    }
    private JButton BRegistro;
    private JLabel prueba;
    private JButton regreso;
}

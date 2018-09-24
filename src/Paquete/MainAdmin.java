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
        BRegistro.setBounds(50,50,120,40);
        BRegistro.addActionListener(this::registroActionPerformed);
        /*-------------------------------------*/
        regreso= new JButton("Cerrar Sesion");
        regreso.setBounds(200,50,120,40);
        regreso.addActionListener(this::regresoActionPerformed);
        /*------------------------------------*/
        Mventa= new JButton("Modulo venta");
        Mventa.setBounds(50,100,120,40);
        Mventa.addActionListener(this::moduloVenta);
        /*-------------------------------------*/
        MPago= new JButton("Modulo Pago");
        MPago.setBounds(200,100,120,40);
        MPago.addActionListener(this::moduloPago);
        //frame
        this.setSize(400,250);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Admin - Sistema de Remesas");
        this.add(BRegistro);
        this.add(regreso);
        this.add(Mventa);
        this.add(MPago);
    }
    private void registroActionPerformed(ActionEvent evt){
        new RegistroAdmin().setVisible(true);
        this.setVisible(false);
    }
    private void regresoActionPerformed(ActionEvent evt){
        dispose();
        new Sesion().setVisible(true);
    }
    private void moduloVenta(ActionEvent evt){
        new ModuloVenta().setVisible(true);
        this.setVisible(false);
    }
     private void moduloPago(ActionEvent evt){
        new ModuloPago().setVisible(true);
        this.setVisible(false);
    }
    
    private JButton BRegistro;
    private JButton regreso;
    private JButton Mventa;
    private JButton MPago;
}

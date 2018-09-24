/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.event.ActionEvent;
import javax.swing.*;
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
    //botoes
    /*-------------------*/
    venta= new JButton("Venta");
    venta.setBounds(50,20,120,40);
    venta.addActionListener(this::venta);
    /*-----------------------*/
    remitente=new JButton("Remitentes");
    remitente.setBounds(50,110,120,40);
    remitente.addActionListener(this::remitenteAction);
    /*-----------------------------*/
    beneficiario= new JButton("Beneficiarios");
    beneficiario.setBounds(180,110,120,40);
    beneficiario.addActionListener(this::beneficiarioEvent);
    /*---------------------------*/
    cerrarSesion= new JButton("Cerrar sesion");
    cerrarSesion.setBounds(180,20,120,40);
    cerrarSesion.addActionListener(this::cerrarSesion);  
    /*--------------------------*/
    regresar= new JButton("Regresar");
    regresar.setBounds(180,110,120,40);
    regresar.addActionListener(this::regresar);
    //frame
    this.setSize(400,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle(Sesion.temp[0].getNombre()+" - Sistema de Remesas");
        this.add(venta);
        this.add(cerrarSesion);
        if(!(Sesion.temp[0].getEspecial().equals("Admin"))){
            this.add(remitente);
            this.add(beneficiario);
        }
        else{
          this.add(regresar);
        }
    }
private void remitenteAction(ActionEvent evt){
    
}
private void beneficiarioEvent(ActionEvent evt){
    
}
private void regresar(ActionEvent evt){
    dispose();
    new MainAdmin().setVisible(true);
}
private void venta(ActionEvent evt){
    autorizarVenta();
}
private void cerrarSesion(ActionEvent evt){
    dispose();
    new Sesion().setVisible(true);
}
private void autorizarVenta(){
    int numeroVenta=0;
    try{
    numeroVenta= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero venta a autorizar"));
    }catch(NumberFormatException e){
        System.out.println("e");
    }
    for (int i = 0; i < MainRemitente.Contadorventa; i++) {
        if (numeroVenta==MainRemitente.venta[i].getNumeroRemesa() && !(MainRemitente.venta[i].isRemesaactiva())) {
            MainRemitente.venta[i].setRemesaactiva(true);
            JOptionPane.showMessageDialog(null, "Venta autorizada");
        }
        else{
            JOptionPane.showMessageDialog(null, "No se puede realizar");
        }
    }
}
private JTextArea area;
private JButton venta;
private JButton remitente;
private JButton beneficiario;
private JButton cerrarSesion;
private JButton regresar;
}

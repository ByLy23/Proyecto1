/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author byron
 */
public class MainObservador extends JFrame{
public static int montototal=0;
public MainObservador(){
    inicializarComponentes();
}
private void inicializarComponentes(){
    //botones
    /*-------------------------*/
    mostrarVentas= new JButton("Ventas");
    mostrarVentas.setBounds(20,20,100,40);
    mostrarVentas.addActionListener(this::ventas);
    /*---------------------------*/
    mostrarPagos= new JButton("pagos");
    mostrarPagos.setBounds(130,20,100,40);
    mostrarPagos.addActionListener(this::pagos);
    /*----------------------------------*/
    mostrarCanVen= new JButton("ventas canceladas");
    mostrarCanVen.setBounds(20,70,150,40);
    mostrarCanVen.addActionListener(this::mostrarCancelacionesvendidas);
    /*---------------------------*/
    mostrarCanCo= new JButton("pagos cancelados");
    mostrarCanCo.setBounds(180,70,150,40);
    mostrarCanCo.addActionListener(this::mostrarCancelacionespagadas);
    /*---------------------------*/
    cerrarSesion= new JButton("Cerrar sesion");
    cerrarSesion.setBounds(250,20,125,40);
    cerrarSesion.addActionListener(this::cerrarSesion);
   //panel
   panel= new JPanel();
   panel.setBounds(10,140,400,600);
   panel.setBackground(Color.white);
   //scroll 
   scroll= new JScrollPane(panel);
   scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    //frame
    this.setSize(400,700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle(Sesion.temp[0].getNombre()+" - Sistema de Remesas");
        this.add(panel);
        this.add(scroll);
        this.add(cerrarSesion);
        this.add(mostrarCanCo);
        this.add(mostrarCanVen);
        this.add(mostrarPagos);
        this.add(mostrarVentas);
        
}
private void cerrarSesion(ActionEvent evt){
    dispose();
    new Sesion().setVisible(true);
}
private void ventas(ActionEvent evt){
    panel.removeAll();
    Label[] label=new Label[200];
    for (int i = 0; i < MainRemitente.Contadorventa; i++) { 
        label[i]= new Label(50,50*i,300,40);
        label[i].setNombre(MainRemitente.venta[i].toString());
        panel.add(label[i]);
    }
    
}
private void mostrarCancelacionespagadas(ActionEvent evt){
  panel.removeAll();
    Label[] label=new Label[200];
    for (int i = 0; i < MainBeneficiario.ContadorCancelacion; i++) { 
        label[i]= new Label(50,50*i,300,40);
        label[i].setNombre(MainBeneficiario.CancelacionP[i].toString());
        panel.add(label[i]);
    }   
}
private void mostrarCancelacionesvendidas(ActionEvent evt){
  panel.removeAll();
    Label[] label=new Label[200];
    for (int i = 0; i < MainRemitente.ContadorCancelacionv; i++) { 
        label[i]= new Label(50,50*i,300,40);
        label[i].setNombre(MainRemitente.cancelacionV[i].toString());
        panel.add(label[i]);
    }   
}
private void pagos(ActionEvent evt){
  panel.removeAll();
    Label[] label=new Label[200];
    for (int i = 0; i < MainBeneficiario.ContadorCompra; i++) { 
        label[i]= new Label(50,50*i,300,40);
        label[i].setNombre(MainBeneficiario.compra[i].toString());
        panel.add(label[i]);
    }   
}
private JPanel panel;
private JButton mostrarVentas;
private JButton mostrarPagos;
private JButton mostrarCanVen;
private JButton mostrarCanCo;
private JButton cerrarSesion;
private JScrollPane scroll;
}

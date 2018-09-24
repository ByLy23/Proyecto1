/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

/**
 *
 * @author byron
 */
public class ModuloPago extends JFrame{
 public ModuloPago(){
 inicializarComponentes();    
 }
 private void inicializarComponentes(){
     //botones
     pago=new JButton("Pagar");
     pago.setBounds(50,50,120,40);
     pago.addActionListener(this::PagarRemesa);
     /*-------------------------------*/
     cerrarSesion= new JButton("Cerrar sesion");
     cerrarSesion.setBounds(180,50,120,40);
     cerrarSesion.addActionListener(this::cerrarSesion);
     //frame
    this.setSize(400,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle(Sesion.temp[0].getNombre()+" - Sistema de Remesas");
        this.add(pago);
        this.add(cerrarSesion);
 }
 private void PagarRemesa(ActionEvent evt){
     int numeroRemesa=0;
  try{
      numeroRemesa= Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de remesa"));
  }   
  catch(NumberFormatException et){
      System.out.println("nel");
  }
     for (int i = 0; i < MainBeneficiario.ContadorCompra; i++) {
         if (numeroRemesa==MainRemitente.venta[i].getNumeroRemesa() && MainRemitente.venta[i].isRemesacobro()) {
             MainRemitente.venta[i].setEstadoremesa(true);
             MainBeneficiario.compra[i].setCorreoUsuario(Sesion.temp[0].getCorreo());
             JOptionPane.showMessageDialog(null, "Transaccion Finalizada");
         }
     }
 }
 private void cerrarSesion(ActionEvent evt){
     dispose();
     new Sesion().setVisible(true);
 }
 
   
private JButton pago;
private JButton cerrarSesion;   
}

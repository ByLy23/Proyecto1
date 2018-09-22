/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import javax.swing.*;

/**
 *
 * @author byron
 */
public class MainRemitente extends JFrame{
    public static Venta[] venta= new Venta[200];
    public static int Contadorventa=0;
    public MainRemitente(){
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        //botones
        realizarRemesa= new JButton("Realizar Remesa");
        realizarRemesa.setBounds(50,20,150,40);
        realizarRemesa.addActionListener(this::realizarRemesaActionPerformed);
        /*----------------------*/
        consultar= new JButton("Consultar");
        consultar.setBounds(215,20,100,40);
        consultar.addActionListener(this::consultarRemesa);
        /*----------------------*/
        cancelarRemesa= new JButton("Cancelar Remesa");
        cancelarRemesa.setBounds(50,80,150,40);
        cancelarRemesa.addActionListener(this::cancelarRemesa);
         /*----------------------*/
         cerrarSesion= new JButton("Cerrar Sesion");
         cerrarSesion.setBounds(215,80,150,40);
         cerrarSesion.addActionListener(this::cerrarSesion);
         //textfiedl
         /*----------------------*/
         usuario= new JTextField();
         usuario.setBounds(100,170,150,40);
         /*-------------------------*/
         dinero= new JTextField();
         dinero.setBounds(100,210,150,40);
         //labels
         Lusuario= new JLabel("Correo");
         Lusuario.setBounds(20,170,100,40);
         /*----------------------*/
         Ldinero= new JLabel("Dinero en $");
         Ldinero.setBounds(20,210,100,40);
        //frame
        this.setSize(400,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle(Sesion.temp[0].getNombre()+" - Sistema de Remesas");
        this.add(realizarRemesa);
        this.add(consultar);
        this.add(usuario);
        this.add(cancelarRemesa);
        this.add(cerrarSesion);
        this.add(Lusuario);
        this.add(dinero);
        this.add(Ldinero);
    }
    private void realizarRemesaActionPerformed(ActionEvent evt){
        comprobarUser();
    }
    private void cancelarRemesa(ActionEvent evt){
        cancelar();
    }
    private void consultarRemesa(ActionEvent evt){
        
    }
    private void cerrarSesion(ActionEvent evt){
        dispose();
        new Sesion().setVisible(true);
    }
    private void generarnumero(){
         rnd=(int)((Math.random()+1)*20);
        comprobarnumero(venta, rnd, Contadorventa);
    }
    private void comprobarnumero(Venta[] venta,int numeroaleatorio,int limite){
        for (int i = 0; i < limite; i++) {
            if (numeroaleatorio== venta[i].getNumeroRemesa()) {       
                generarnumero();
            }
        }
        continuar=true;
    }
    private void comprobarUser(){
        for (i = 0; i < Registro.ContadorBeneficiario; i++) {
             if (usuario.getText().equals(Registro.beneficiario[i].getCorreo())) {
            generarRemesa();
        }
             else{
                 JOptionPane.showMessageDialog(null, "Usuario inexistente");
             }
        }
       
    }
    private void generarRemesa(){
        try{
        Monto= Integer.parseInt(dinero.getText());
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        
        if (Monto>6000) {
            JOptionPane.showMessageDialog(null, "No se puede hacer una transaccion tan voluminosa");
        }
        else if(Monto<0){
            System.out.println("");
        }
        else if(dinero.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese cantidad");
        }
        else{
            generarnumero();
            if (continuar) {
                venta[Contadorventa]= new Venta(Sesion.temp[0].getIdRemitente(), Registro.beneficiario[i].getIdRemitente(), "Guatemala", generarFecha(), generarHora(), Monto, rnd, false, false);
                Contadorventa++;
                System.out.println(venta[Contadorventa-1].getHoraVenta()+" "+venta[Contadorventa-1].getNumeroRemesa());  
                JOptionPane.showMessageDialog(null, "Venta enviada, el beneficiario: "+Registro.beneficiario[i].getNombre()+" \nPuede recibir la remesa con\nel codigo: "+venta[Contadorventa-1].getNumeroRemesa());
            }
        }
    }
    private String generarFecha(){
        Calendar fecha= new GregorianCalendar();
        int dia= fecha.get(Calendar.DAY_OF_MONTH);
        int mes= fecha.get(Calendar.MONTH);
        int anyo= fecha.get(Calendar.YEAR);
       String actual=dia+"/"+(mes+1)+"/"+anyo;
       return actual;
    }
    private String generarHora(){
        Calendar fecha= new GregorianCalendar();
        int hora=fecha.get(Calendar.HOUR_OF_DAY);
        int minuto= fecha.get(Calendar.MINUTE);
        int segundo= fecha.get(Calendar.SECOND);
        String horaactual= hora+":"+minuto+":"+segundo;
        return horaactual;
    }
 
    
    private void cancelar(){
       int numeroCancelacion= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la remesa que desea cancelar"));
       
        for (int j = 0; j < Contadorventa; j++) {
            if (numeroCancelacion==venta[j].getNumeroRemesa()) {
                if (Sesion.temp[0].getIdRemitente()==venta[j].getIdRemitente()) {
                    if (venta[j].isEstadoremesa()) {
                        System.out.println("No se puede cancelar debido a que ya se cobro");
                    }
                    else{
                        System.out.println("venta cancelada");
                        
                        venta[j].setNumeroRemesa(-1);
                    }
                }
                else{
                   JOptionPane.showMessageDialog(null, "No puede cancelar esta remesa");
                }
            }
        }
    }
    
    
    private JButton realizarRemesa;
    private JButton consultar;
    private JButton cancelarRemesa;
    private JButton cerrarSesion;
    private JTextField usuario;
    private JLabel Lusuario;
    private JTextField dinero;
    private JLabel Ldinero;
    private boolean continuar=false;
    private int Monto=-1;
    private int rnd=0;
    private int i=0;
}

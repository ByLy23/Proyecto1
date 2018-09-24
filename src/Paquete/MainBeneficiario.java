/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author byron
 */
public class MainBeneficiario extends JFrame{
    public static Compra[] compra= new Compra[200];
    public static int ContadorCompra=0;
    public static CancelacionPago[] CancelacionP= new CancelacionPago[200];
    public static int ContadorCancelacion=0;
    public MainBeneficiario(){
        inicializarComponentes();
    }
    private void inicializarComponentes(){
        //botontes
        /*---------------------*/
        cerrarSesion= new JButton("Cerrar Sesion");
        cerrarSesion.setBounds(50, 50, 120, 40);
        cerrarSesion.addActionListener(this::CerrarSesion);
        /*-----------------------*/
        cobrarRemesa= new JButton("Cobro de remesa");
        cobrarRemesa.setBounds(50,100,150,40);
        cobrarRemesa.addActionListener(this::CobrarRemesa);
        /*-----------------------*/
        CancelarRemesa= new JButton("Cancelar Remesa");
        CancelarRemesa.setBounds(180,50,150,40);
        CancelarRemesa.addActionListener(this::CancelarRemesa);
        //frame
        this.setSize(400,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle(Sesion.temp[0].getNombre()+" - Sistema de Remesas");
        this.add(cerrarSesion);
        this.add(cobrarRemesa);
        this.add(CancelarRemesa);
    }
    private void CerrarSesion(ActionEvent evt){
     dispose();
     new Sesion().setVisible(true);
    }
    private void CobrarRemesa(ActionEvent evt){
        int numeroRemesa=0;
        try{
            numeroRemesa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de remesa"));
        }
        catch(NumberFormatException e){
            System.out.println("nada");
        }
        for (int i = 0; i < MainRemitente.Contadorventa; i++) {
            if (numeroRemesa==MainRemitente.venta[i].getNumeroRemesa()) {
                if (Sesion.temp[0].getIdRemitente()==MainRemitente.venta[i].getIdBeneficiario() && MainRemitente.venta[i].isRemesaactiva()) {
                  compra[ContadorCompra]= new Compra(generarFecha(), generarHora(), "", setMontoDestino(MainRemitente.venta[i].getMontoOrigen()),7.5);
                    System.out.println(compra[ContadorCompra].getMontoDestino());
                    MainRemitente.venta[i].setRemesacobro(true);
                    JOptionPane.showMessageDialog(null, "La compra esta realizada, su saldo es de: "+compra[ContadorCompra].getMontoDestino()+" \na la espera de que un operador complete la transaccion");
                    ContadorCompra++;
                }
                else{
                    JOptionPane.showMessageDialog(null, "No compatible");
                }
            }
            else{
            System.out.println("sigue sin poderse :'v");
            }
        }
    }
    private void CancelarRemesa(ActionEvent evt){
        cancelar();
    }
     private void cancelar(){
       int numeroCancelacion= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la remesa que desea cancelar"));
       String motivoCancelacion= JOptionPane.showInputDialog("Detalle el porque de la cancelacion:");
        for (int j = 0; j < MainRemitente.Contadorventa; j++) {
            if (numeroCancelacion==MainRemitente.venta[j].getNumeroRemesa()) {
                if (Sesion.temp[0].getIdRemitente()==MainRemitente.venta[j].getIdBeneficiario()) {
                    if (MainRemitente.venta[j].isEstadoremesa()) {
                        System.out.println("No se puede cancelar debido a que ya se cobro");
                    }
                    else{
                        CancelacionP[ContadorCancelacion]= new CancelacionPago(MainRemitente.venta[j].getNumeroRemesa(), generarFecha(), generarHora(), Sesion.temp[0].getCorreo(), motivoCancelacion);
                        ContadorCancelacion++;
                        JOptionPane.showMessageDialog(null, "Venta cancelada");
                        MainRemitente.venta[j].setRemesacobro(false);
                    }
                }
                else{
                   JOptionPane.showMessageDialog(null, "No puede cancelar esta remesa");
                }
            }
        }
    }
    private double setMontoDestino(int montoOrigen){
        double montodestino= montoOrigen*(tipoCambio-gananciaUS);
        return montodestino;
    }
    private String generarFecha(){
        Calendar fecha= new GregorianCalendar();
        int dia= fecha.get(Calendar.DAY_OF_MONTH);
        int mes= fecha.get(Calendar.MONTH);
        int anyo= fecha.get(Calendar.YEAR);
       String actual=dia+"/"+(mes+1)+"/"+anyo;
       return actual;
    }
    private int obtenerHora(){
        Calendar fecha= new GregorianCalendar();
        int a= fecha.get(Calendar.HOUR_OF_DAY);
        return a;
    }
    private String generarHora(){
        Calendar fecha= new GregorianCalendar();
        int hora=fecha.get(Calendar.HOUR_OF_DAY);
        int minuto= fecha.get(Calendar.MINUTE);
        int segundo= fecha.get(Calendar.SECOND);
        String horaactual= hora+":"+minuto+":"+segundo;
        return horaactual;
    } 
    private JButton cobrarRemesa;
    private JButton CancelarRemesa;
    private JButton cerrarSesion;
    private double tipoCambio=7.70422;
    private double gananciaUS=0.49624;
}

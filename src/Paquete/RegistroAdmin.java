/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import static Paquete.Registro.ContadorRemitente;
import static Paquete.Registro.remitente;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author byron
 */
public class RegistroAdmin extends JFrame{
    public RegistroAdmin(){
        inicializarComponentes();
    }
     public void inicializarComponentes(){
        //Labels
        /*-----------------------------------------*/
        CreacionUser= new JLabel("Registro usuario");
        CreacionUser.setBounds(115, 20, 200, 40);
        CreacionUser.setFont(new Font("SansSerif",Font.PLAIN,16));
        /*-----------------------------------------*/
        LNombre= new JLabel("Nombre");
        LNombre.setBounds(50,70,150,40);
        /*-----------------------------------------*/
        LApellido= new JLabel("Apellido");
        LApellido.setBounds(50,110,150,40);
        /*-----------------------------------------*/
        LCorreo= new JLabel("Correo");
        LCorreo.setBounds(50,150,150,40);
        /*-----------------------------------------*/
        LDireccion= new JLabel("Direccion");
        LDireccion.setBounds(50,190,150,40);
        /*-----------------------------------------*/
        LTelefono= new JLabel("Telefono");
        LTelefono.setBounds(50,230,150,40);
        /*-----------------------------------------*/
        LPassword= new JLabel("Password");
        LPassword.setBounds(50,310,150,40);
        /*-----------------------------------------*/
        LFecha= new JLabel("FechaNac");
        LFecha.setBounds(50,270,150,40);
        /*-----------------------------------------*/
        LRol= new JLabel("Rol");
        LRol.setBounds(50,350,150,40);
        /*-----------------------------------------*/
        //Textos
        /*-----------------------------------------*/
        TNombre= new JTextField();
        TNombre.setBounds(125,75,190,30);
        /*-----------------------------------------*/
        TApellido= new JTextField();
        TApellido.setBounds(125,115,190,30);
        /*-----------------------------------------*/
        TCorreo= new JTextField();
        TCorreo.setBounds(125,155,190,30);
        /*-----------------------------------------*/
        TDireccion= new JTextField();
        TDireccion.setBounds(125,195,190,30);
        /*-----------------------------------------*/
        TTelefono= new JTextField();
        TTelefono.setBounds(125,235,190,30);
        /*-----------------------------------------*/
        TFecha= new JTextField();
        TFecha.setBounds(125,275,190,30);
        /*-----------------------------------------*/
        TPassword= new JPasswordField();
        TPassword.setBounds(125,315,190,30);
        /*-----------------------------------------*/
        //Botones
        /*-----------------------------------------*/
        BAceptar= new JButton();
        BAceptar.setBounds(50, 400, 115, 40);
        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(this::aceptarActionPerformed);
        /*-----------------------------------------*/
        BCancelar= new JButton();
        BCancelar.setBounds(200, 400, 115, 40);
        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(this::cancelarActionPerformed);
        //Combobox
       /*-----------------------------------------*/
       CRol= new JComboBox();
       CRol.setBounds(125, 360, 100, 20);
       CRol.addItem("Observador");
       CRol.addItem("Vendedor");
       CRol.addItem("Comprador");
       /*-----------------------------------------*/
        //Frame
        this.setSize(400,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Registro - Sistema de Remesas");
        this.add(CreacionUser);
        this.add(LNombre);
        this.add(LApellido);
        this.add(LCorreo);
        this.add(LDireccion);
        this.add(LTelefono);
        this.add(LRol);
        this.add(LPassword);
        this.add(TNombre);
        this.add(TApellido);
        this.add(TCorreo);
        this.add(TDireccion);
        this.add(TTelefono);
        this.add(TPassword);
        this.add(BAceptar);
        this.add(BCancelar);
        this.add(LFecha);
       this.add(CRol);
       this.add(TFecha);
    }
      private void aceptarActionPerformed(ActionEvent evt){
       
    }
        private void cancelarActionPerformed(ActionEvent evt){
        dispose();
        new Sesion().setVisible(true);
    }
         public boolean comprobarUsuario(Usuario[] user,String correo, int limite){
        for (int i = 0; i <limite; i++) {
            if (correo.equals(user[i].getCorreo())) {
                return true;
            }
        }
        return false;
    }
      private JLabel CreacionUser;
    private JLabel LNombre;
    private JLabel LApellido;
    private JLabel LCorreo;
    private JLabel LDireccion;
    private JLabel LTelefono;
    private JLabel LRol;
    private JLabel LFecha;
    private JLabel LPassword;
    private JTextField TNombre;
    private JTextField TApellido;
    private JTextField TCorreo;
    private JTextField TDireccion;
    private JTextField TTelefono;
    private JTextField TFecha;
    private JPasswordField TPassword;
    private JButton BAceptar;
    private JButton BCancelar;
    private JComboBox CRol;
}

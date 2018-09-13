package Paquete;

import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author byron
 */
public class Sesion extends JFrame{
    public Sesion(){
        inicializarComponentes();
    }
    private void inicializarComponentes(){
        //Labels
         iniSesion= new JLabel("Inicio de Sesion");
         iniSesion.setBounds(135, 20, 120, 20);
         iniSesion.setFont(new Font("SansSerif",Font.PLAIN,16));
         /*-------------------------------------------------------*/
         Luser= new JLabel("Usuario");
         Luser.setBounds(25, 70, 70, 40);
         Luser.setFont(new Font("SansSerif",Font.PLAIN,12));
         /*-------------------------------------------------------*/
         LPass= new JLabel("Contrasenya");
         LPass.setBounds(25, 120, 70, 40);
         LPass.setFont(new Font("SansSerif",Font.PLAIN,12));
         /*-------------------------------------------------------*/
         LRol= new JLabel("Rol");
         LRol.setBounds(100,210,50,40);
         /*-------------------------------------------------------*/
        //Botones
        Ingreso= new JButton("Ingresar");
        Ingreso.setBounds(25,170,150,40);
        Ingreso.addActionListener(this::ingresoActionPerformed);
         /*-------------------------------------------------------*/
        Salida= new JButton("Registro");
        Salida.setBounds(200,170,150,40);
        Salida.addActionListener(this::registroActionPerformed);
        //textos
        TUser= new JTextField();
        TUser.setBounds(100, 70, 250, 40);
         /*-------------------------------------------------------*/
        TPass= new JTextField();
        TPass.setBounds(100, 120, 250, 40);
        //ComboBox
        Rol= new JComboBox();
        Rol.setBounds(160,220,100,20);
        Rol.addItem("Admin");
        Rol.addItem("Vendedor");
        Rol.addItem("Comprador");
        Rol.addItem("Observador");
        Rol.addItem("Usuario");
         /*-------------------------------------------------------*/
        //frame
        this.setSize(400,300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Inicio Sesion - Sistema de Remesas");
         this.add(iniSesion);
        this.add(Ingreso);
        this.add(Salida);
        this.add(Luser);
        this.add(LPass);
        this.add(TUser);
        this.add(TPass);
        this.add(LRol);
        this.add(Rol);
        
       
    }
     private void ingresoActionPerformed(ActionEvent evt){
         
        }
     private void registroActionPerformed(ActionEvent evt){
        
     }
     
     //Declaracion de variables
    private JLabel iniSesion;
    private JLabel Luser;
    private JLabel LPass;
    private JButton Ingreso;
    private JButton Salida;
    private JLabel LRol;
    private JComboBox Rol; 
    private JTextField TUser;
    private JTextField TPass;
}

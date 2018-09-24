package Paquete;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.HashSet;
import javax.swing.*;

/**
 *
 * @author byron
 */
public class Sesion extends JFrame{
    private Administrador[] admin= new Administrador[1];
    public static Fijo[] temp= new Fijo[1];
    public Sesion(){
        inicializarComponentes();
        admin[0]= new Administrador(1, "Byron", "Orellana", "12/12/1998", "Desconocida", "Micasa", "51313792", "byron", "Admin", "123");
        temp[0]= new Fijo();
    }
    private void inicializarComponentes(){
        //Labels
         iniSesion= new JLabel("Inicio de Sesion");
         iniSesion.setBounds(135, 20, 120, 20);
         iniSesion.setFont(new Font("SansSerif",Font.PLAIN,16));
         /*-------------------------------------------------------*/
         Luser= new JLabel("Correo");
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
        TPass= new JPasswordField();
        TPass.setBounds(100, 120, 250, 40);
        //ComboBox
        Rol= new JComboBox();
        Rol.setBounds(160,220,100,20);
        Rol.addItem("Administrador");
        Rol.addItem("Vendedor");
        Rol.addItem("Comprador");
        Rol.addItem("Observador");
        Rol.addItem("Beneficiario");
        Rol.addItem("Remitente");
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
          if(Rol.getSelectedItem().equals("Administrador")){
              if (comprobarUsuario(admin, TUser.getText(),1)) {
                 if (comprobarContrasenya(admin, TPass.getText(), 1)) {
                    String contra= JOptionPane.showInputDialog("Ingrese contrasenya de Admin: ");
                     if (contra.equals("Admin")) {
                        // Usuario[] user,String correo, int limite,Usuario[] fin
                         colocarUsuario(admin, TUser.getText(), 1, temp);
                         JOptionPane.showMessageDialog(null, "Bienvenido "+admin[0].getNombre()+" "+admin[0].getApellido());
                         new MainAdmin().setVisible(true);
                         this.setVisible(false);
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                     }
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                 }
             }
             else{
               JOptionPane.showMessageDialog(null, "Correo invalido");
             }
         }
         if(Rol.getSelectedItem().equals("Remitente")){
             if (comprobarUsuario(Registro.remitente, TUser.getText(),Registro.ContadorRemitente)) {
                 if (comprobarContrasenya(Registro.remitente, TPass.getText(), Registro.ContadorRemitente)) {
                    colocarUsuario(Registro.remitente, TUser.getText(), Registro.ContadorRemitente, temp);
                         JOptionPane.showMessageDialog(null, "Bienvenido");
                         new MainRemitente().setVisible(true);
                         this.setVisible(false);
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                 }
             }
             else{
               JOptionPane.showMessageDialog(null, "Correo invalido");
             }
         }
          if(Rol.getSelectedItem().equals("Beneficiario")){
             if (comprobarUsuario(Registro.beneficiario, TUser.getText(),Registro.ContadorBeneficiario)) {
                 if (comprobarContrasenya(Registro.beneficiario, TPass.getText(), Registro.ContadorBeneficiario)) {
                   colocarUsuario(Registro.beneficiario, TUser.getText(), Registro.ContadorBeneficiario, temp);
                         JOptionPane.showMessageDialog(null, "Bienvenido");
                         new MainBeneficiario().setVisible(true);
                         this.setVisible(false);
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                 }
             }
             else{
               JOptionPane.showMessageDialog(null, "Correo invalido");
             }
         }
           if(Rol.getSelectedItem().equals("Vendedor")){
              if (comprobarUsuario(RegistroAdmin.vendedor, TUser.getText(),RegistroAdmin.ContadorVendedor)) {
                 if (comprobarContrasenya(RegistroAdmin.vendedor, TPass.getText(), RegistroAdmin.ContadorVendedor)) {
                    String contra= JOptionPane.showInputDialog("Ingrese contrasenya de Vendedor: ");
                     if (contra.equals("Vendedor")) {
                         colocarUsuario(RegistroAdmin.vendedor, TUser.getText(), RegistroAdmin.ContadorVendedor, temp);
                         JOptionPane.showMessageDialog(null, "Bienvenido "+RegistroAdmin.vendedor[RegistroAdmin.ContadorVendedor-1].getNombre());
                         new ModuloVenta().setVisible(true);
                         this.setVisible(false);
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                     }
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                 }
             }
             else{
               JOptionPane.showMessageDialog(null, "Correo invalido");
             }
              }
               if(Rol.getSelectedItem().equals("Comprador")){
              if (comprobarUsuario(RegistroAdmin.comprador, TUser.getText(),RegistroAdmin.ContadorComprador)) {
                 if (comprobarContrasenya(RegistroAdmin.comprador, TPass.getText(), RegistroAdmin.ContadorComprador)) {
                    String contra= JOptionPane.showInputDialog("Ingrese contrasenya de Comprador: ");
                     if (contra.equals("Comprador")) {
                         colocarUsuario(RegistroAdmin.comprador, TUser.getText(), RegistroAdmin.ContadorComprador, temp);
                         JOptionPane.showMessageDialog(null, "Bienvenido "+RegistroAdmin.comprador[RegistroAdmin.ContadorComprador-1].getNombre());
                         new ModuloPago().setVisible(true);
                         this.setVisible(false);
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                     }
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                 }
             }
             else{
               JOptionPane.showMessageDialog(null, "Correo invalido");
             }
               }
               
            if(Rol.getSelectedItem().equals("Observador")){
              if (comprobarUsuario(RegistroAdmin.observador, TUser.getText(),RegistroAdmin.ContadorObservador)) {
                 if (comprobarContrasenya(RegistroAdmin.observador, TPass.getText(),RegistroAdmin.ContadorObservador )) {
                    String contra= JOptionPane.showInputDialog("Ingrese contrasenya de Observador: ");
                     if (contra.equals("Observador")) {
                         colocarUsuario(RegistroAdmin.observador, TUser.getText(), RegistroAdmin.ContadorObservador, temp);
                         JOptionPane.showMessageDialog(null, "Bienvenido "+RegistroAdmin.observador[RegistroAdmin.ContadorObservador-1].getNombre());
                         //new moduloObservador().setVisible(true);
                         this.setVisible(false);
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                     }
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "Contrasenya invalida");
                 }
             }
             else{
               JOptionPane.showMessageDialog(null, "Correo invalido");
             }
         }
     } 
     private void registroActionPerformed(ActionEvent evt){
        new Registro().setVisible(true);
        this.setVisible(false);
     }
    public boolean comprobarUsuario(Usuario[] user,String correo, int limite){
        for (int i = 0; i <limite; i++) {
            if (correo.equals(user[i].getCorreo())) {
                return true;
            }
        }
        return false;
    } 
    public boolean comprobarContrasenya(Usuario[] user,String contra, int limite){
        for (int i = 0; i <limite; i++) {
            if (contra.equals(user[i].getPassword())) {
                return true;
            }
        }
        return false;
    }
    public void colocarUsuario(Usuario[] user,String correo, int limite,Usuario[] fin){
        for (int i = 0; i < limite; i++) {
            if (correo.equals(user[i].getCorreo())) {
                //idRemitente, Nombre, Apellido, fechaNac, Nacionalidad, Direccion, Telefono, correo, PasswordComprador, Password
                fin[0].setIdRemitente(user[i].getIdRemitente());
                fin[0].setNombre(user[i].getNombre());
                fin[0].setApellido(user[i].getApellido());
                fin[0].setFechaNac(user[i].getFechaNac());
                fin[0].setNacionalidad(user[i].getNacionalidad());
                fin[0].setDireccion(user[i].getDireccion());
                fin[0].setTelefono(user[i].getTelefono());
                fin[0].setCorreo(user[i].getCorreo());
                fin[0].setEspecial(user[i].getEspecial());
                fin[0].setPassword(user[i].getPassword());
            }
            else   {
                System.out.println("no");
            }
        }
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
    private JPasswordField TPass;
}

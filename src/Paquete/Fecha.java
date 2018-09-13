/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

/**
 *
 * @author byron
 */
class Fecha {
     private int dia, mes, anyo;
   public Fecha(){
      this(1,1,1900);//inicializa el costructor con variables
   }
   public Fecha(int dia, int mes, int anyo){
      setDia(dia);
      setMes(mes);
      setAnyo(anyo);
   }
   public void setDia(int dia){
      this.dia= (dia>=1 && dia<=31)?dia:1;//this es un operador que permite obtener los atributos y metodos de una clase sin declarar un objeto.
   }
   public void setMes(int mes){
      this.mes=(mes>=1 && mes<=12)?mes:1;
   }
   public void setAnyo(int anyo){
      this.anyo=(anyo<=1900)?1900:anyo;
   }
   public int getDia(){
      return dia;
   }
   public int getMes(){
      return mes;
   }
   public int getAnyo(){
      return anyo;
   }
   public String toString(String sep){
      return dia+sep+mes+sep+anyo;
   }
   public String toString(){
      return toString("/");
   }
}

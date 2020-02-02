package com.futbol.domain;

import javax.persistence.Entity;

/**
 *
 * @author atenc
 */
@Entity
public class Director extends Empleado{
   
    public Director(){super();}
   public Director(int empleado,String Cargo){
    //super();
    this.Id=empleado;
    this.Posicion=Cargo;
    }
    
   public Director(int Id_Empleado,String Nom_Empleado,int Edad,double salario,String Cargo){
    super(Id_Empleado,Nom_Empleado,Edad,salario);
  
    }
    
  
    //void Get_Det_empleado(){System.out.println("Directora->Id_Empleado:" + this.Get_Id_Det_Empleado() + "| Salario:" + this.Salario + "| Cargo:" + this.Cargo);}   
   //La funcion llama los datos del director, revelando el id, nombre, edad, equipo, salario y posicion
   public void Get_Det_empleado2(){System.out.println("Det_empleado->Id_Empleado:" + this.getId()+ "| Nom_Empleado:" + this.getNom() + "| Edad:" + this.Edad + "| Id_Equipo:" + this.getEquipo() + "| Salario:" + this.Salario + "| Posicion:" + this.Posicion);}
   
    
}

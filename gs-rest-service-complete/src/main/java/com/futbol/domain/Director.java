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
    this.Id=empleado;
    this.Posicion=Cargo;
    }
    
   public Director(int Id_Empleado,String Nom_Empleado,int Edad,double salario,String Cargo){
    super(Id_Empleado,Nom_Empleado,Edad,salario);
  
    }
    
 
}

package com.futbol.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Empleado extends Persona{
    
    @ManyToOne
    protected Equipo equipo;
    
    public Empleado(){}
   public Empleado(int Id_Empleado,String Nom_Empleado,int Edad,double Salario){
     this.equipo=new Equipo();
    this.Id=Id_Empleado;
    this.Nom=Nom_Empleado;
    this.Edad=Edad;
    this.Salario=Salario;
    }
    
    /*Empleado(int Id_Empleado,String Nom_Empleado,String Cargo,float Salario,int Id_Equipox,String Nom_Equipox,int Jugadosx,int Ganadosx,int Empatadosx,int Perdidosx,int Favorx,int Encontrax){
    super(Id_Equipox,Nom_Equipox,Jugadosx,Ganadosx,Empatadosx,Perdidosx,Favorx,Encontrax);
    this.Id_Empleado=Id_Empleado;
    this.Nom_Empleado=Nom_Empleado;
    this.Cargo=Cargo;
    this.Salario=Salario;
    }*/


    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }


   public void Get_Empleado(){System.out.println("Empleado->Id_Empleado:" + this.Id+ "| Nom_Empleado:" + this.Nom + "| Edad:" + this.Edad + "| Id_Equipo:" + this.equipo.Id_Equipo);}   
}

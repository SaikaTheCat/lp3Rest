package com.futbol.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity //establece que una clase puede ser mapeado a una tabla
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


    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

}

package com.futbol.domain;

import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Jugador extends Persona {

    //protected int Id_Jugador;
    protected int Camiseta;
    
    @ManyToOne
    private  Equipo equipo;
    //Contiene el nombre del torneo y lo gana el jugador o lo pierde
    @Transient
    private HashMap<String,Boolean> torneoGanar=new HashMap<>();
  
    public Jugador() {
        super();
    }

    
   public Jugador(int Id_Jugador, int Camiseta, String Posicion) {
        //super();
        this.Id=Id_Jugador;
        this.Camiseta = Camiseta;
        this.Posicion = Posicion;
    }

    //Jugador(12345678,"Rafael Lopez",23,16000,9,"Delantero",equipo);
    //Empleado(int Id_Empleado,String Nom_Empleado,int Edad,double Salario,Equipo equipo)
   public Jugador(int Id_Empleado, String Nom_Empleado, int Edad, double Salario, int Camiseta, String Posicion) {
       
        this.Id=Id_Empleado;
        this.Nom=Nom_Empleado;
        this.Camiseta = Camiseta;
        this.Posicion = Posicion;
        this.Salario=Salario;
        this.Edad=Edad;
        
        //this.Id_Equipo=equipo.Get_Id_Equipo();
    }

    public int getCamiseta() {
        return Camiseta;
    }

    public void setCamiseta(int Camiseta) {
        this.Camiseta = Camiseta;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public HashMap<String, Boolean> getTorneoGanar() {
        return torneoGanar;
    }

    public void setTorneoGanar(HashMap<String, Boolean> torneoGanar) {
        this.torneoGanar = torneoGanar;
    }

    public void Get_Jugador() {
        System.out.println("Jugador->Id_Jugador:" + this.Id + "| Nombres:" + this.Nom + "| Edad:" + this.Edad + "| Camiseta:" + this.Camiseta + "| Posicion:" + this.Posicion + "| Equipo:" + this.equipo + "| Salario:" + this.Salario);
    }

}

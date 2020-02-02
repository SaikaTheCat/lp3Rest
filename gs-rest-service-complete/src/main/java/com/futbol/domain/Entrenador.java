package com.futbol.domain;

import javax.persistence.Entity;


@Entity
public class Entrenador extends Jugador{
    
   public Entrenador(){super();}
    
    public Entrenador(String Nom_Titulo,int jugador){
    this.Id=jugador;
    this.Nom=Nom_Titulo;
    
    }
    

    public void Get_Entrenador(){System.out.println("Entrenador->Id_Entrenador:" + this.Id + "| Nom_Titulo:" + this.Nom);}  
    
}

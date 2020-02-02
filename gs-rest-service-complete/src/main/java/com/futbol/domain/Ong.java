package com.futbol.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ong {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id_Ong;
    private String Nom_Ong;
    private int Tiempo_Ong;
    @OneToMany(mappedBy ="Id_Ong" )
    private List<Donaciones> donaciones=new ArrayList<>();
    
   public Ong(){}
    
    public Ong(int Id_Ong,String Nom_Ong,int Tiempo_Ong){
    this.Id_Ong=Id_Ong;
    this.Nom_Ong=Nom_Ong;
    this.Tiempo_Ong=this.Tiempo_Ong;
    }
    
   public void Get_Ong(){System.out.println("Ong->Id_Ong:" + this.Id_Ong + "| Nom_Ong:" + this.Nom_Ong + "| Tiempo_Ong:" + this.Tiempo_Ong);}   
    


    public int getId_Ong() {
        return Id_Ong;
    }

    public void setId_Ong(int Id_Ong) {
        this.Id_Ong = Id_Ong;
    }

    public String getNom_Ong() {
        return Nom_Ong;
    }

    public void setNom_Ong(String Nom_Ong) {
        this.Nom_Ong = Nom_Ong;
    }

    public int getTiempo_Ong() {
        return Tiempo_Ong;
    }

    public void setTiempo_Ong(int Tiempo_Ong) {
        this.Tiempo_Ong = Tiempo_Ong;
    }

    public List<Donaciones> getdonaciones() {
        return donaciones;
    }

    public void setdonaciones(List<Donaciones> donaciones) {
        this.donaciones = donaciones;
    }
}
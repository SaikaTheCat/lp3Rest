package com.futbol.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "equipo")
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int Id_Equipo;
    private String Nom_Equipo;
    private String Pais;
    @OneToMany(mappedBy = "equipo")
    private List<Jugador> jugadors;
    
    private int entrenador;
    private int Ganados;
    private int Empatados;
    private int Perdidos;
    private int Favor;
    private int Encontra;

    public Equipo() {
//        this.Id_Equipo = 0;
//        this.Nom_Equipo = "";
//        this.Pais = "";
//        this.jugadors=new ArrayList<>();
//        this.entrenador=new Entrenador();
//        this.Ganados = 0;
//        this.Empatados = 0;
//        this.Perdidos = 0;
//        this.Favor = 0;
//        this.Encontra = 0;
    }

  public  Equipo(int Id_Equipo, String Nom_Equipo, String Pais, int Ganados, int Empatados, int Perdidos, int Favor, int Encontra,int entrenador) {
        this.Id_Equipo = Id_Equipo;
        this.Nom_Equipo = Nom_Equipo;
        this.Pais = Pais;
        this.Ganados = Ganados;
        this.Empatados = Empatados;
        this.Perdidos = Perdidos;
        this.Favor = Favor;
        this.Encontra = Encontra;
         this.jugadors=new ArrayList<>();
          this.entrenador=entrenador;
    }

    public int getId_Equipo() {
        return Id_Equipo;
    }

    public void setId_Equipo(int Id_Equipo) {
        this.Id_Equipo = Id_Equipo;
    }

    public String getNom_Equipo() {
        return Nom_Equipo;
    }

    public void setNom_Equipo(String Nom_Equipo) {
        this.Nom_Equipo = Nom_Equipo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public List<Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(List<Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public int getGanados() {
        return Ganados;
    }

    public void setGanados(int Ganados) {
        this.Ganados = Ganados;
    }

    public int getEmpatados() {
        return Empatados;
    }

    public void setEmpatados(int Empatados) {
        this.Empatados = Empatados;
    }

    public int getPerdidos() {
        return Perdidos;
    }

    public void setPerdidos(int Perdidos) {
        this.Perdidos = Perdidos;
    }

    public int getFavor() {
        return Favor;
    }

    public void setFavor(int Favor) {
        this.Favor = Favor;
    }

    public int getEncontra() {
        return Encontra;
    }

    public void setEncontra(int Encontra) {
        this.Encontra = Encontra;
    }

    

    public void Get_Equipo() {
        System.out.println("Equipo->Id_Equipo:" + this.Id_Equipo + "| Nom_Equipo:" + this.Nom_Equipo + "| Pais:" + this.Pais + "| Jugados:" + this.jugadors + "| Ganados:" + this.Ganados + "| Empatados" + this.Empatados + "| Perdidos:" + this.Perdidos + "| Favor:" + this.Favor + "| Encontra:" + this.Encontra);
    }

}

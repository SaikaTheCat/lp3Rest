package com.futbol.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Torneo{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id_Torneo;
    private String Nom_Torneo;
    private String Tipo;
    
    @OneToMany
    private List<Equipo> equipos;
   
    public Torneo(){super();};
    
   public Torneo(int Id_Torneo,String Nom_Torneo,String Tipo){
    //super();
    this.Id_Torneo=Id_Torneo;
    this.Nom_Torneo=Nom_Torneo;
    this.Tipo=Tipo;
    };

    public int getId_Torneo() {
        return Id_Torneo;
    }

    public void setId_Torneo(int Id_Torneo) {
        this.Id_Torneo = Id_Torneo;
    }

    public String getNom_Torneo() {
        return Nom_Torneo;
    }

    public void setNom_Torneo(String Nom_Torneo) {
        this.Nom_Torneo = Nom_Torneo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    
    
    void Get_Torneo(){System.out.println("Torneo->Id_Torneo:" + this.Id_Torneo + "| Nom_Torneo:" + this.Nom_Torneo + "| Tipo:" + this.Tipo);}   
    
}

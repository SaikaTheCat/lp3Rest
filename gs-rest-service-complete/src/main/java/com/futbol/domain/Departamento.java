package com.futbol.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author 
 */
@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nom;
    @OneToOne
    private Director director;

    public Departamento() {
    }
    //Constructor
    public Departamento(int id, String nom, Director director) {
        this.id = id;
        this.nom = nom;
        this.director = director;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Director getdirector() {
        return director;
    }

    public void setdirector(Director director) {
        this.director = director;
    }
    
    public void getDepartamento(){
         System.out.println("Equipo->id:" + this.id + "| Nom:" + this.nom + "| director:" + this.director);
    }
    
}

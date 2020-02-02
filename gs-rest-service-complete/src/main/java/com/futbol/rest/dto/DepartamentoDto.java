package com.futbol.rest.dto;

/**
 *
 * @author lue
 */
public class DepartamentoDto {
   
    
    private String nom;
    
    private int directorId;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }
    
    
}

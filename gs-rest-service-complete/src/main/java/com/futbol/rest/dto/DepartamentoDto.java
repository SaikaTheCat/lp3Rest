package com.futbol.rest.dto;

/**
 *
 * DTO classes it's act to Data transfer object and transfer the data from view 
 * to the Controller create Departamento API
 * @author
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

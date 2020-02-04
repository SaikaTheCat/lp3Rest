package com.futbol.rest.dto;

/**
 * Las clases DTO (Data transfer object) transfiere los datos de la vista o view
 * al controller que crea la API del Departamento.
 * Usamos el patron DTO donde solo contiene los atributos, getters y setters
 * para la transferencia de atributos entre el cliente y servidor o viceversa
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

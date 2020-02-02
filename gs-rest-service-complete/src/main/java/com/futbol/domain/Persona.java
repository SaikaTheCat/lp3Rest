package com.futbol.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Clase de personas que heredará toda entidad del sistema y contiene los
 * detalles básicos.
 *
 * @author
 */
@MappedSuperclass
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int Id;

    protected String Nom;

    protected String Posicion;

    protected double Salario;

    protected int Edad;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

}

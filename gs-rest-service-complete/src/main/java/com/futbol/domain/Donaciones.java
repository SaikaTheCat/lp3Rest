package com.futbol.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Donaciones {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int Id_Donacion;
    protected int Id_Ong;
    protected int Id_Equipo;
    private double Monto;
    
    public Donaciones(){};
    
    Donaciones(int Id_Donacion,double Monto,int equipo, int ong){
    
    this.Id_Donacion=Id_Donacion;
    this.Id_Ong=ong;
    this.Id_Equipo=equipo;
    this.Monto=Monto;
    }
    
    void Set_Id_Donacion(double Id_Donacion){this.Monto=Id_Donacion;}
    void Set_Monto(double Monto){this.Monto=Monto;}
    
    
    int Get_Id_Donacion(){return this.Id_Donacion;}
    double Get_Monto(){return this.Monto;}
    void Get_Donaciones(){System.out.println("Donaciones->Id_Donacion:" + this.Id_Donacion + "| Id_Ong:" + this.Id_Ong + "| Id_Equipo:" + this.Id_Equipo + "| Monto:" + this.Monto);}   
    
}

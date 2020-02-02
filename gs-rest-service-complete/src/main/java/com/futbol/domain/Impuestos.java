package com.futbol.domain;

public class Impuestos {
    
    private int Id_Jugador;
    private int personalIncomeTax=10; //Personal Income Tax (10%)
    private int technologyTax = 4; //technology tax is 4%
    private int promotionTax = 2;  //promotion tax is 2%
    private int luxuryTax = 30;  //luxury tax is 30%
    
   public Impuestos(){};
    /*
    double Imp_Tec(){return this.Get_Salario()*0.04;};
    double Imp_Pro(){return this.Get_Salario()*0.02;};
    double Imp_Sal(){return 0;};
    */

    public int getId_Jugador() {
        return Id_Jugador;
    }

    public void setId_Jugador(int Id_Jugador) {
        this.Id_Jugador = Id_Jugador;
    }

    public int getPersonalIncomeTax() {
        return personalIncomeTax;
    }

    public void setPersonalIncomeTax(int personalIncomeTax) {
        this.personalIncomeTax = personalIncomeTax;
    }

    public int getTechnologyTax() {
        return technologyTax;
    }

    public void setTechnologyTax(int technologyTax) {
        this.technologyTax = technologyTax;
    }

    public int getPromotionTax() {
        return promotionTax;
    }

    public void setPromotionTax(int promotionTax) {
        this.promotionTax = promotionTax;
    }

    public int getLuxuryTax() {
        return luxuryTax;
    }

    public void setLuxuryTax(int luxuryTax) {
        this.luxuryTax = luxuryTax;
    }

    
    
}
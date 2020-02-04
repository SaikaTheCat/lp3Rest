package com.futbol.domain;

public class Impuestos {
    
    private int Id_Jugador;
    private int personalIncomeTax=10; //Impuesto a la renta personal (10%)
    private int technologyTax = 4; //Impuesto para tecnologia (4%)
    private int promotionTax = 2;  //Impuesto para promocion (2%)
    private int luxuryTax = 30;  //Impuesto de lujo (30%)
    
   public Impuestos(){};
   
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

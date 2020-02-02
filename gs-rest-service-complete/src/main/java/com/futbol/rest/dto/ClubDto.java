package com.futbol.rest.dto;

/**
 * DTO classes it's act to Data transfer object and trasfer the data from view 
 * to the Controller create club API
 * @author
 */
public class ClubDto {
    
   private int employeeId;
   
   private int equipmentId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(int equipmentId) {
        this.equipmentId = equipmentId;
    }
   
   
   
    
}

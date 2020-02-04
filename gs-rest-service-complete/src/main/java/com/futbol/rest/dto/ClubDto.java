package com.futbol.rest.dto;

/**
 * Las clases DTO (Data transfer object) transfiere los datos de la vista o view
 * al controller que crea la API del Club.
 * Usamos el patron DTO donde solo contiene los atributos, getters y setters
 * para la transferencia de atributos entre el cliente y servidor o viceversa
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

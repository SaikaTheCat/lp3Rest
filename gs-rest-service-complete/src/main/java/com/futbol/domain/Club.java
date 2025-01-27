package com.futbol.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author
 */

@Entity(name = "club")
public class Club {
    
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO) //generamos un id automatico
	private long id;
	
    @JoinColumn(name = "employee_id",referencedColumnName = "Id")   //agrega una columna a la bd
    @ManyToOne 
    private Empleado empleado;
    
    @JoinColumn(name = "equipo_id",referencedColumnName = "Id_Equipo")   
    @ManyToOne //relacion muchos a uno
    private Equipo equipo;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
  
}

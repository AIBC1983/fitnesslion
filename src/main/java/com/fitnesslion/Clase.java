package com.fitnesslion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String horario;
    private String instructor;

    public Clase() {
    }

    public Clase(String nombre, String horario, String instructor) {
        this.nombre = nombre;
        this.horario = horario;
        this.instructor = instructor;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
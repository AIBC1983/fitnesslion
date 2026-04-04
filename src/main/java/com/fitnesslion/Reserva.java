package com.fitnesslion;

import jakarta.persistence.*;

@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Clase clase;

    public Reserva() {
    }

    public Reserva(Usuario usuario, Clase clase) {
        this.usuario = usuario;
        this.clase = clase;
    }

    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Clase getClase() {
        return clase;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
}
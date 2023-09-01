package com.example.lab2.entidad;

import jakarta.persistence.*;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJugador")
    private int idJugador;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "edad")
    private int edad;

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdJugador() {
        return idJugador;
    }

    @Column(name = "posicion", nullable = false)
    private String posicion;

    @Column(name = "club", nullable = false)
    private String club;

    @Column(name = "sn_idseleccion")
    private int sn_idseleccion;
}

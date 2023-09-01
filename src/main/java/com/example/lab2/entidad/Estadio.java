package com.example.lab2.entidad;

import jakarta.persistence.*;

@Entity
public class Estadio {
    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getClub() {
        return club;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJugador")
    private int idEstadio;
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "provincia", nullable = false)
    private String provincia;

    @Column(name = "club", nullable = false)
    private String club;


}

package com.example.lab2.entidad;

import jakarta.persistence.*;

@Entity
public class Seleccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSeleccion")
    private int idSeleccion;
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tecnico", nullable = false)
    private String tecnico;

    @Column(name = "estadio_idEstadio")
    private int estadio_idEstadio;

    public int getIdSeleccion() {
        return idSeleccion;
    }

    public void setIdSeleccion(int idSeleccion) {
        this.idSeleccion = idSeleccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setEstadio_idEstadio(int estadio_idEstadio) {
        this.estadio_idEstadio = estadio_idEstadio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getEstadio_idEstadio() {
        return estadio_idEstadio;
    }
}
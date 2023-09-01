package com.example.lab2.repositorio;

import com.example.lab2.entidad.Seleccion;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeleccionRepository {
    List<Seleccion> findByCompanyName(String name);

    List<Seleccion> findByCompanyNameOrPhone(String n, String p);

    @Query(nativeQuery = true,value = "select * from shippers where CompanyName = ?1")
    List<Seleccion> buscarPorNombre(String nombre);

    @Query(nativeQuery = true, value = "select * from shippers where CompanyName like %?1%")
    List<Seleccion> buscarParcialPorNombre(String nombre);

}

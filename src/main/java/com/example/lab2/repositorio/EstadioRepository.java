package com.example.lab2.repositorio;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EstadioRepository {
    List<Estadio> findByCompanyName(String name);

    List<Estadio> findByCompanyNameOrPhone(String n, String p);

    @Query(nativeQuery = true,value = "select * from shippers where CompanyName = ?1")
    List<Estadio> buscarPorNombre(String nombre);

    @Query(nativeQuery = true, value = "select * from shippers where CompanyName like %?1%")
    List<Estadio> buscarParcialPorNombre(String nombre);

}

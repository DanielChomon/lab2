package com.example.lab2.repositorio;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface JugadorRepository {

    List<Jugador> findByCompanyName(String name);

    List<Jugador> findByCompanyNameOrPhone(String n, String p);

    @Query(nativeQuery = true,value = "select * from shippers where CompanyName = ?1")
    List<Jugador> buscarPorNombre(String nombre);

    @Query(nativeQuery = true, value = "select * from shippers where CompanyName like %?1%")
    List<Jugador> buscarParcialPorNombre(String nombre);

}

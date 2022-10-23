/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.EtiquetaModel;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author egarc
 */
public interface EtiquetaRepository extends CrudRepository<EtiquetaModel, Object>{
    
    @Query(value = "SELECT * FROM bd_tablero.bd_etiqueta be WHERE be.codigo_tablero = :codigoTablero",
            nativeQuery = true)
    Optional<EtiquetaModel> obtenerByTablero(@Param("codigoTablero") Integer codigoTablero);
    
}

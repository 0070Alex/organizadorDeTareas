/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.ListaTareaModel;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author egarc
 */
public interface ListaTareaRepository extends CrudRepository<ListaTareaModel, Object>{
    /*Obtener todas las listas por codigo tablero*/
    @Query(value = "select * from bd_tablero.bd_lista_tarea blt where blt.codigo_tablero = :codigoTablero",
            nativeQuery = true)
    List<ListaTareaModel> obtenerListaByTarea(@Param("codigoTablero") Integer codigoTablero);
}

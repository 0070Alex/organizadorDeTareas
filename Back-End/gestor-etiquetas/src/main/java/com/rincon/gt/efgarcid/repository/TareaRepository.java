/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.ListaTareaModel;
import com.rincon.gt.efgarcid.models.TareaModel;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author egarc
 */
public interface TareaRepository extends CrudRepository<TareaModel, Object>{
    /*Obtener todas las tareas por codigoLista*/
    @Query(value = "select * from bd_tablero.bd_tarea  bt where bt.codigo_lista = :codigoLista",
            nativeQuery = true)
    List<TareaModel> obtenerListaByTarea(@Param("codigoLista") Integer codigoLista);
}

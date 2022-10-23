/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.repository;

import com.rincon.gt.efgarcid.models.TableroModel;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author egarc
 */
public interface TableroRepository extends CrudRepository<TableroModel, Object>{
    /*Obtener todos los tableros por Usuario*/
    @Query(value = "select * from bd_tablero.bd_tablero  bt where bt.usuario_asignacion = :usuario",
            nativeQuery = true)
    List<TableroModel> obtenerTablerosByUsuario(@Param("usuario") String usuario);
}

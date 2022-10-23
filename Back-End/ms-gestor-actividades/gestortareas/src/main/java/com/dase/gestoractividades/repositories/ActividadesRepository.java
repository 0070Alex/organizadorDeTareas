/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.repositories;

import com.dase.gestoractividades.entities.Actividades;
import com.dase.gestoractividades.projection.ActividadesProjection;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Elias
 */
public interface ActividadesRepository extends CrudRepository<Actividades, Object> {

    @Query(value = "select a.id_actividad as id,\n"
            + "       a.id_lista as idLista,\n"
            + "       a.nombre_actividad as nombreActividad,\n"
            + "       a.descripcion as descripcion,\n"
            + "       a.fecha_creacion as fechaCreacion,\n"
            + "       a.usuario_adiciono as usuarioAdiciono,\n"
            + "       a.estado as estado\n"
            + "from db_actividades.actividades a\n"
            + "\n"
            + "where a.id_lista = ?1",
            nativeQuery = true)
    public List<ActividadesProjection> findActividadesbyIdLista(Long id);

}

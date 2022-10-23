/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.repositories;

import com.dase.gestoractividades.entities.ListaActividad;
import com.dase.gestoractividades.projection.ListaProjection;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Elias
 */
public interface ListaActividadRepository extends CrudRepository<ListaActividad, Object> {

    @Query(value = "select la.id_lista as id,\n"
            + "	   la.id_tarea as idTarea,\n"
            + "	   la.nombre_lista as nombreLista,\n"
            + "	   la.fecha_adicion as fechaAdicion,\n"
            + "	   la.usuario_adiciono as usuarioAdiciono,\n"
            + "	   la.estado as estado\n"
            + "from db_actividades.lista_actividad la \n"
            + "where la.id_tarea = ?1",
            nativeQuery = true)
    public List<ListaProjection> findByListaByIdTarea(Long id);

}

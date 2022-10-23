/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.repositories;

import com.dase.gestorcomentarios.entities.Comentarios;
import com.dase.gestorcomentarios.projection.ComentarioProjection;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Elias
 */
public interface ComentariosRepository extends CrudRepository<Comentarios, Object> {

    @Query(value = "select c.id_comentario as id,\n"
            + "	   c.id_tarea as idTarea,\n"
            + "	   c.comentario as comentario,\n"
            + "	   c.fecha_adicion as fechaAdicion,\n"
            + "	   c.usuario_adiciono as usuarioAdiciono,\n"
            + "	   c.estado as estado\n"
            + "	   from db_comentarios.comentarios c \n"
            + "	   where c.id_tarea = ?1",
            nativeQuery = true)
    public List<ComentarioProjection> findComentarioByIdTarea(Long id);

}

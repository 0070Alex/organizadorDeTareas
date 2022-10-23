/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.services;

import com.dase.gestorcomentarios.commons.CommonSvc;
import com.dase.gestorcomentarios.entities.Comentarios;
import com.dase.gestorcomentarios.projection.ComentarioProjection;
import java.util.List;

/**
 *
 * @author Alexander Elias
 */
public interface ComentariosSvc  extends CommonSvc<Comentarios>{
    
    public List<ComentarioProjection> findComentarioByIdTarea(Long id);
    
}

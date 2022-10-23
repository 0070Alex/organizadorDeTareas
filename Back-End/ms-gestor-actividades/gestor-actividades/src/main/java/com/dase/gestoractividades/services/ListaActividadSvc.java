/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.services;

import com.dase.gestoractividades.commons.CommonSvc;
import com.dase.gestoractividades.entities.ListaActividad;
import com.dase.gestoractividades.projection.ListaProjection;
import java.util.List;

/**
 *
 * @author Alexander Elias
 */
public interface ListaActividadSvc extends CommonSvc<ListaActividad>{
    
    public List<ListaProjection> findByListaByIdTarea (Long id);
    
}

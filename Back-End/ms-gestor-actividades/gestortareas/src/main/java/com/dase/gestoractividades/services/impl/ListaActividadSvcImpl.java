/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.services.impl;

import com.dase.gestoractividades.commons.CommonSvcImpl;
import com.dase.gestoractividades.entities.ListaActividad;
import com.dase.gestoractividades.projection.ListaProjection;
import org.springframework.stereotype.Service;
import com.dase.gestoractividades.repositories.ListaActividadRepository;
import com.dase.gestoractividades.services.ListaActividadSvc;
import java.util.List;

/**
 *
 * @author Alexander Elias
 */
@Service
public class ListaActividadSvcImpl extends CommonSvcImpl<ListaActividad,ListaActividadRepository> implements   ListaActividadSvc{

    @Override
    public List<ListaProjection> findByListaByIdTarea(Long id) {
        return this.repository.findByListaByIdTarea(id);
    }
    
}

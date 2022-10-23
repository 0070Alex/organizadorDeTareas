/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.services.impl;

import com.dase.gestoractividades.commons.CommonSvcImpl;
import com.dase.gestoractividades.entities.Actividades;
import com.dase.gestoractividades.projection.ActividadesProjection;
import com.dase.gestoractividades.repositories.ActividadesRepository;
import com.dase.gestoractividades.services.ActividadesSvc;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander Elias
 */
@Service
public class ActividadesSvcImpl extends CommonSvcImpl<Actividades,ActividadesRepository> implements   ActividadesSvc{

    @Override
    public List<ActividadesProjection> findActividadesbyIdLista(Long id) {
        return this.repository.findActividadesbyIdLista(id);
        
    }
    
}

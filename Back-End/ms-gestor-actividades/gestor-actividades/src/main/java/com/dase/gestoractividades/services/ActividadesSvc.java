/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.services;

import com.dase.gestoractividades.commons.CommonSvc;
import com.dase.gestoractividades.entities.Actividades;
import com.dase.gestoractividades.projection.ActividadesProjection;
import java.util.List;

/**
 *
 * @author Alexander Elias
 */
public interface ActividadesSvc  extends CommonSvc<Actividades>{
    
    public List<ActividadesProjection> findActividadesbyIdLista(Long id);
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.projection;

import java.util.Date;

/**
 *
 * @author Alexander Elias
 */
public interface ActividadesProjection {

    Long    getId();
    Long    getIdLista();
    String  getNombreActividad();
    String  getDescripcion();
    Date getFechaCreacion();
    String getUsuarioAdiciono();
    boolean getEstado();
}

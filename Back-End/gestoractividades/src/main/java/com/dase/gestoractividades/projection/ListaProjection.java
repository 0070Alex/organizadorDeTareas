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
public interface ListaProjection {
    
    Long    getId();
    Long    getIdTarea();
    String  getNombreLista();
    Date  getFechaAdicion();
    String getUsuarioAdiciono();
    boolean getEstado();
    
}

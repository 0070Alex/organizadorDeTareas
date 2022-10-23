/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.projection;

import java.util.Date;

/**
 *
 * @author Alexander Elias
 */
public interface ComentarioProjection {
    
    Long getId();
    Long getIdTarea();
    String  getComentario();
    Date  getFechaAdicion();
    String getUsuarioAdiciono();
    String getEstado();
    

          
          
           
            
}

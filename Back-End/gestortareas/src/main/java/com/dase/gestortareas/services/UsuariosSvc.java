/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.services;

import com.dase.gestortareas.commons.CommonSvc;
import com.dase.gestortareas.entities.Usuarios;
import com.dase.gestortareas.projection.UsuarioProjection;


/**
 *
 * @author Alexander Elias
 */
public interface UsuariosSvc extends CommonSvc<Usuarios>{    
     
     public UsuarioProjection findUserByUsernameAndPass(String user, String pass);
     
}

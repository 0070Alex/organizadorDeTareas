/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorusuarios.services;

import com.dase.gestorusuarios.commons.CommonSvc;
import com.dase.gestorusuarios.entities.Usuarios;
import com.dase.gestorusuarios.projection.UsuarioProjection;


/**
 *
 * @author Alexander Elias
 */
public interface UsuariosSvc extends CommonSvc<Usuarios>{    
     
     public UsuarioProjection findUserByUsernameAndPass(String user, String pass);
     
      public UsuarioProjection findUserByEmial(String email);
}

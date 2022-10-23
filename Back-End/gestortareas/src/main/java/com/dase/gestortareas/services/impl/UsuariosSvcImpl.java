/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.services.impl;

import com.dase.gestortareas.commons.CommonSvcImpl;
import com.dase.gestortareas.entities.Usuarios;
import com.dase.gestortareas.projection.UsuarioProjection;
import org.springframework.stereotype.Service;
import com.dase.gestortareas.repositories.UsuariosRepository;
import com.dase.gestortareas.services.UsuariosSvc;

/**
 *
 * @author Alexander Elias
 */
@Service
public class UsuariosSvcImpl extends CommonSvcImpl<Usuarios,UsuariosRepository> implements   UsuariosSvc {   

    @Override
    public UsuarioProjection findUserByUsernameAndPass(String user, String pass) {
        return this.repository.findUserByUsernameAndPass(user, pass);
    }  
    

}

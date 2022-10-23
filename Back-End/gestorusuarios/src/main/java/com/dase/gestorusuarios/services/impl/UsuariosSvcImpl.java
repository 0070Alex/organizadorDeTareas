/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorusuarios.services.impl;

import com.dase.gestorusuarios.commons.CommonSvcImpl;
import com.dase.gestorusuarios.entities.Usuarios;
import com.dase.gestorusuarios.projection.UsuarioProjection;
import org.springframework.stereotype.Service;
import com.dase.gestorusuarios.repositories.UsuariosRepository;
import com.dase.gestorusuarios.services.UsuariosSvc;

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

    @Override
    public UsuarioProjection findUserByEmial(String email) {
        return this.repository.findUsserByEmail(email);
    }
    

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorusuarios.services.impl;

import com.dase.gestorusuarios.commons.CommonSvcImpl;
import com.dase.gestorusuarios.entities.Roles;
import com.dase.gestorusuarios.repositories.RolesRepository;
import com.dase.gestorusuarios.services.RolesSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander Elias
 */
@Service
public class RolesSvcImpl extends CommonSvcImpl<Roles,RolesRepository> implements   RolesSvc{
    
}

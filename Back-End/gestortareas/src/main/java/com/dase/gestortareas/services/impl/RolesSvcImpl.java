/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.services.impl;

import com.dase.gestortareas.commons.CommonSvcImpl;
import com.dase.gestortareas.entities.Roles;
import com.dase.gestortareas.repositories.RolesRepository;
import com.dase.gestortareas.services.RolesSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander Elias
 */
@Service
public class RolesSvcImpl extends CommonSvcImpl<Roles,RolesRepository> implements   RolesSvc{
    
}

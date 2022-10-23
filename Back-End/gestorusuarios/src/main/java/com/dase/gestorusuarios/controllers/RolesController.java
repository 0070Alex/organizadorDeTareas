/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorusuarios.controllers;

import com.dase.gestorusuarios.commons.CommonController;
import com.dase.gestorusuarios.entities.Roles;
import com.dase.gestorusuarios.services.RolesSvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */
@CrossOrigin(origins="https://app-organizador-tareas.herokuapp.com")
@RestController
@RequestMapping(path = "/roles")
public class RolesController extends CommonController<Roles, RolesSvc>{
    
}

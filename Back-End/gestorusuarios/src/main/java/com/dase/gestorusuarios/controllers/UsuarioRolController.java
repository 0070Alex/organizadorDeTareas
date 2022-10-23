/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorusuarios.controllers;

import com.dase.gestorusuarios.commons.CommonController;
import com.dase.gestorusuarios.entities.UsuarioRol;
import com.dase.gestorusuarios.services.UsuarioRolSvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */

@CrossOrigin(origins="https://app-organizador-tareas.herokuapp.com")
@RestController
@RequestMapping(path = "/usurio-rol")
public class UsuarioRolController  extends CommonController<UsuarioRol, UsuarioRolSvc>{
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.controllers;

import com.dase.gestortareas.commons.CommonController;
import com.dase.gestortareas.entities.ActividadTarea;
import com.dase.gestortareas.services.ActividadTareaSvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path = "/actividad-tarea")
public class ActividadTareaController extends CommonController<ActividadTarea, ActividadTareaSvc>{
    
}

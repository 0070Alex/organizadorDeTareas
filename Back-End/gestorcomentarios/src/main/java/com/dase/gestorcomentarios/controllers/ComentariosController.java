/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.controllers;

import com.dase.gestorcomentarios.commons.CommonController;
import com.dase.gestorcomentarios.entities.Comentarios;
import com.dase.gestorcomentarios.services.ComentariosSvc;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Locale;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */

@CrossOrigin(origins="https://app-organizador-tareas.herokuapp.com")
@RestController
@RequestMapping(path = "/comentarios")
public class ComentariosController extends CommonController<Comentarios, ComentariosSvc> {
    
    @GetMapping("/byIdTarea/{id}")
    @ApiOperation(value = "Busca todos los cometarios por medio de un id de tarea")
    public ResponseEntity<?> findComentarioByIdTarea(@PathVariable(required = true) @ApiParam(value = "id") Long id, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale){
        return ResponseEntity.ok().body(service.findComentarioByIdTarea(id));
    }
    
}

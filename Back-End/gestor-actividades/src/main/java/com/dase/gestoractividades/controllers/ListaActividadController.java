/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.controllers;

import com.dase.gestoractividades.commons.CommonController;
import com.dase.gestoractividades.entities.ListaActividad;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dase.gestoractividades.services.ListaActividadSvc;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Locale;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 *
 * @author Alexander Elias
 */

@CrossOrigin(origins="https://app-organizador-tareas.herokuapp.com")
@RestController
@RequestMapping(path = "/lista-actividad")
public class ListaActividadController extends CommonController<ListaActividad, ListaActividadSvc>{
     @GetMapping("/byIdTarea/{id}")
    @ApiOperation(value = "Consulta todas las listas de actividades por medio del id de tarea")
    public ResponseEntity<?> findActividadesbyIdLista(@PathVariable(required = true) @ApiParam(value = "id") Long id, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale){
        return ResponseEntity.ok().body(service.findByListaByIdTarea(id));
    }
}

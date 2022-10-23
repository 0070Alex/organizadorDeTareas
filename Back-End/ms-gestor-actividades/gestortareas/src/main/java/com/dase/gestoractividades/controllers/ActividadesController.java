/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.controllers;

import com.dase.gestoractividades.commons.CommonController;
import com.dase.gestoractividades.entities.Actividades;
import com.dase.gestoractividades.services.ActividadesSvc;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.Locale;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */

@CrossOrigin(origins="https://app-organizador-tareas.herokuapp.com")
@RestController
@RequestMapping(path = "/actividades")
public class ActividadesController extends CommonController<Actividades, ActividadesSvc>{
    
    @GetMapping("/byIdLista/{id}")
    @ApiOperation(value = "Busca todas las actividades por id de lista")
    public ResponseEntity<?> findActividadesbyIdLista(@PathVariable(required = true) @ApiParam(value = "id") Long id, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale){
        return ResponseEntity.ok().body(service.findActividadesbyIdLista(id));
    }
    
    @PutMapping
    @ApiOperation(value = "Actualiza el estado, nombre y descipcion de una actividad")
    public ResponseEntity<?> updateTurno( @RequestBody Actividades entity, BindingResult result, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        

        Optional<Actividades> t = this.service.findById(entity.getId());
        if(!t.isPresent()){
            return ResponseEntity.notFound().build();
        }        
        Actividades newData = t.get();
        
        newData.setEstado(entity.getEstado());
        newData.setNombreActividad(entity.getNombreActividad());
        newData.setDescripcion(entity.getDescripcion());
             
        
        
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(newData));
    }
}
    


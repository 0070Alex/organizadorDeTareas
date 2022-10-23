/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.controller;

import com.rincon.gt.efgarcid.common.CommonController;
import com.rincon.gt.efgarcid.models.ListaTareaModel;
import com.rincon.gt.efgarcid.models.TareaModel;
import com.rincon.gt.efgarcid.svc.TareaSvc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author egarc
 */
@Api
@RestController
@RequestMapping("/tarea")
@CrossOrigin(origins = "http://localhost:4200")
public class TareaController extends CommonController<TareaModel, TareaSvc>{
    @Autowired
    protected TareaSvc Service;
    
    @GetMapping("/obtener/tareas/{codigoLista}")
    @ApiOperation(value = "Obtener todas las tareas por codigo de lista")
    public List<TareaModel> obtenerTablerosByUsuario(
            @PathVariable @ApiParam(value = "Codigo Lista") Integer codigoLista,
            @RequestHeader(name = "Accept-Languaje", required = false) Locale locale)
            throws Exception {
        try {
            List<TareaModel> listaTarea = service.obtenerTareasByCodigoLista(codigoLista);
            return listaTarea;
        } catch (Exception handlerException) {
            return (List<TareaModel>) ResponseEntity.notFound().build();
        }

    }
}

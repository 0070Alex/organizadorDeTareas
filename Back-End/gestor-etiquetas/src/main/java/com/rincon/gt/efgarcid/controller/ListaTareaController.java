/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.controller;

import com.rincon.gt.efgarcid.common.CommonController;
import com.rincon.gt.efgarcid.models.ListaTareaModel;
import com.rincon.gt.efgarcid.models.TableroModel;
import com.rincon.gt.efgarcid.svc.ListaTareaSvc;
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
@RequestMapping("/lista")
@CrossOrigin(origins = "http://localhost:4200")
public class ListaTareaController extends CommonController<ListaTareaModel, ListaTareaSvc>{
    @Autowired
    protected ListaTareaSvc Service;
    
    @GetMapping("/obtener/listas/{codigoTablero}")
    @ApiOperation(value = "Obtener todas las listas por codigo de tablero")
    public List<ListaTareaModel> obtenerTablerosByUsuario(
            @PathVariable @ApiParam(value = "Codigo Tablero") Integer codigoTablero,
            @RequestHeader(name = "Accept-Languaje", required = false) Locale locale)
            throws Exception {
        try {
            List<ListaTareaModel> listaTarea = service.obtenerListasByCodigoTablero(codigoTablero);
            return listaTarea;
        } catch (Exception handlerException) {
            return (List<ListaTareaModel>) ResponseEntity.notFound().build();
        }

    }
}

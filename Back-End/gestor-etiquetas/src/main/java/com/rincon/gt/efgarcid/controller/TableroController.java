/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.controller;

import com.rincon.gt.efgarcid.common.CommonController;
import com.rincon.gt.efgarcid.models.TableroModel;
import com.rincon.gt.efgarcid.repository.TableroRepository;
import com.rincon.gt.efgarcid.svc.TableroSvc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/tablero")
@CrossOrigin(origins = "http://localhost:4200")
public class TableroController extends CommonController<TableroModel, TableroSvc> {

    Logger logger = Logger.getLogger("My Logs efgarcid");
    @Autowired
    protected TableroSvc Service;

    @GetMapping("/obtener/tableros/{usuario}")
    @ApiOperation(value = "Obtener todos los tableros por usuario")
    public List<TableroModel> obtenerTablerosByUsuario(
            @PathVariable @ApiParam(value = "Usuario") String usuario,
            @RequestHeader(name = "Accept-Languaje", required = false) Locale locale)
            throws Exception {
        try {
            List<TableroModel> tablero = service.obtenerTableros(usuario);
            return tablero;
        } catch (Exception handlerException) {
            logger.info("Entro a catch");
            return (List<TableroModel>) ResponseEntity.notFound().build();
        }

    }

}

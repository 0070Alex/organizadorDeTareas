/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.common;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 *
 * @author egarc
 */
@CrossOrigin(origins = "http://localhost:4200")
public class CommonController<E, S extends CommonSvc<E>> {
    
    @Autowired
    protected S service;

    @GetMapping("/obtener/registros")
    @ApiOperation(value = "Obtener lista de todos los registros")
    public ResponseEntity<?> findAll(@RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Obtener registro por ID")
    public ResponseEntity<?> findById(@PathVariable(required = true) @ApiParam(value = "id") Integer id, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        Optional<E> o = service.findById(id);
        if (!o.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(o.get());
    }

    @PostMapping("/crea")
    @ApiOperation(value = "Crear un nuevo registro")
    public ResponseEntity<?> save(@Valid @RequestBody E entity, BindingResult result, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        if (result.hasErrors()) {
            return this.validar(result);
        }
       // this.validator.validate(entity);
        E entityDb = service.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(entityDb);
    }
    
    @PutMapping("/actualiza")
    @ApiOperation(value = "Actualiza registro")
    public ResponseEntity<?> update(@Valid @RequestBody E entity, BindingResult result, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        if (result.hasErrors()) {
            return this.validar(result);
        }
       // this.validator.validate(entity);
        E entityDb = service.save(entity);
        return ResponseEntity.status(HttpStatus.CREATED).body(entityDb);
    }
    
    @DeleteMapping("/{id}")
    @ApiOperation(value = "Elimina la infirmación de un objeto")
    public ResponseEntity<?> eliminar(@PathVariable(required = true) @ApiParam(value = "id") Integer id, @RequestHeader(name = "Accept-Languaje", required = false) Locale locale) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    protected ResponseEntity<?> validar(BindingResult result) {
        Map<String, Object> errores = new HashMap<>();
        result.getFieldErrors().forEach(err -> {
            errores.put(err.getField(), " El campo " + err.getField() + " " + err.getDefaultMessage());
        });

        return ResponseEntity.badRequest().body(errores);
    }
}

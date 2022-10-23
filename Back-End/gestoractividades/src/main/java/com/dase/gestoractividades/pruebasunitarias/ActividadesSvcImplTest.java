/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.pruebasunitarias;

import com.dase.gestoractividades.entities.Actividades;
import com.dase.gestoractividades.projection.ActividadesProjection;
import com.dase.gestoractividades.repositories.ActividadesRepository;
import com.dase.gestoractividades.services.impl.ActividadesSvcImpl;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;


/**
 *
 * @author Alexander Elias
 */
public class ActividadesSvcImplTest {
    
    @Mock
    private ActividadesRepository repo;
    
    @InjectMocks
    private ActividadesSvcImpl service;
    
    private Actividades acti;
    
    @BeforeEach
    void setUp(){        
        MockitoAnnotations.initMocks( this);        
        acti = new Actividades();
        acti.setId(new Long(1));
        
    }
    
    @Test
    void findAll(){
        when(repo.findAll()).thenReturn(Arrays.asList(acti));
        assertNotNull(service.findAll());
        
    }
    
    
}

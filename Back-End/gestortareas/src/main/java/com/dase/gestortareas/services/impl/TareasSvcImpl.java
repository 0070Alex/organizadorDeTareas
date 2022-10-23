/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.services.impl;

import com.dase.gestortareas.commons.CommonSvcImpl;
import com.dase.gestortareas.entities.Tareas;
import com.dase.gestortareas.repositories.TareasRepository;
import com.dase.gestortareas.services.TareasSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander Elias
 */
@Service
public class TareasSvcImpl extends CommonSvcImpl<Tareas,TareasRepository> implements   TareasSvc {
    
}

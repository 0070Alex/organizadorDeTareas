/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.services.impl;

import com.dase.gestortareas.commons.CommonSvcImpl;
import com.dase.gestortareas.entities.Tableros;
import com.dase.gestortareas.repositories.TablerosRepository;
import com.dase.gestortareas.services.TablerosSvc;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexander Elias
 */
@Service
public class TablerosSvcImpl extends CommonSvcImpl<Tableros,TablerosRepository> implements   TablerosSvc {
    
}

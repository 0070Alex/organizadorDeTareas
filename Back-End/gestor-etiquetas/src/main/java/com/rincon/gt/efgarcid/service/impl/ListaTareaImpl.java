/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.service.impl;

import com.rincon.gt.efgarcid.common.CommonImpl;
import com.rincon.gt.efgarcid.models.ListaTareaModel;
import com.rincon.gt.efgarcid.repository.ListaTareaRepository;
import com.rincon.gt.efgarcid.svc.ListaTareaSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author egarc
 */
@Service
public class ListaTareaImpl extends CommonImpl<ListaTareaModel,ListaTareaRepository> implements   ListaTareaSvc{
    
    @Autowired
    protected ListaTareaRepository Repository;
    
    @Override
    public List<ListaTareaModel> obtenerListasByCodigoTablero(Integer codigoTablero) throws Exception {
        List<ListaTareaModel> listaTarea = Repository.obtenerListaByTarea(codigoTablero);
        return listaTarea;
    }
    
}

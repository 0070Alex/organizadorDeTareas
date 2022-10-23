/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.service.impl;

import com.rincon.gt.efgarcid.common.CommonImpl;
import com.rincon.gt.efgarcid.models.ListaTareaModel;
import com.rincon.gt.efgarcid.models.TareaModel;
import com.rincon.gt.efgarcid.repository.ListaTareaRepository;
import com.rincon.gt.efgarcid.repository.TareaRepository;
import com.rincon.gt.efgarcid.svc.TareaSvc;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author egarc
 */
@Service
public class TareaImpl extends CommonImpl<TareaModel, TareaRepository> implements TareaSvc {

    @Autowired
    protected TareaRepository Repository;

    @Override
    public List<TareaModel> obtenerTareasByCodigoLista(Integer codigoLista) throws Exception {
        List<TareaModel> listaTarea = Repository.obtenerListaByTarea(codigoLista);
        return listaTarea;

    }
}

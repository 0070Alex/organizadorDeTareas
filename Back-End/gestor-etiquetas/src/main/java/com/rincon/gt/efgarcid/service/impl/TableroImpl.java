/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.service.impl;

import com.rincon.gt.efgarcid.common.CommonImpl;
import com.rincon.gt.efgarcid.models.TableroModel;
import com.rincon.gt.efgarcid.repository.TableroRepository;
import com.rincon.gt.efgarcid.svc.TableroSvc;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author egarc
 */
@Service
public class TableroImpl extends CommonImpl<TableroModel, TableroRepository> implements TableroSvc {

    @Autowired
    protected TableroRepository Repository;

    @Override
    public List<TableroModel> obtenerTableros(String usuario) throws Exception {
        List<TableroModel> tableros = Repository.obtenerTablerosByUsuario(usuario);
        return tableros;
    }

}

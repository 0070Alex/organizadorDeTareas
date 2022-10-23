/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.svc;

import com.rincon.gt.efgarcid.common.CommonSvc;
import com.rincon.gt.efgarcid.models.TableroModel;
import com.rincon.gt.efgarcid.models.TareaModel;
import java.util.List;

/**
 *
 * @author egarc
 */
public interface TareaSvc extends CommonSvc<TareaModel>{
    
    public List<TareaModel> obtenerTareasByCodigoLista(Integer codigoLista) throws Exception;
    
}

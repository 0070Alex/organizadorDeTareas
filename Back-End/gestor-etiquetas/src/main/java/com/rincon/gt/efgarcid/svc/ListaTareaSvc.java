/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.svc;

import com.rincon.gt.efgarcid.common.CommonSvc;
import com.rincon.gt.efgarcid.models.ListaTareaModel;
import com.rincon.gt.efgarcid.models.TableroModel;
import java.util.List;

/**
 *
 * @author egarc
 */
public interface ListaTareaSvc extends CommonSvc<ListaTareaModel>{
    
    public List<ListaTareaModel> obtenerListasByCodigoTablero(Integer codigoTablero) throws Exception;
}

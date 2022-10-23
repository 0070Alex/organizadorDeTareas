/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rincon.gt.efgarcid.svc;

import com.rincon.gt.efgarcid.common.CommonSvc;
import com.rincon.gt.efgarcid.models.TableroModel;
import com.rincon.gt.efgarcid.repository.TableroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author egarc
 */
public interface TableroSvc extends CommonSvc<TableroModel>{
    
    public List<TableroModel> obtenerTableros(String usuario) throws Exception;
    
}

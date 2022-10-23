/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.repositories;

import com.dase.gestortareas.entities.Usuarios;
import com.dase.gestortareas.projection.UsuarioProjection;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Elias
 */
public interface UsuariosRepository extends CrudRepository<Usuarios, Object> {    
    
    @Query(value = "SELECT u.id_usuario as id, u.username , u.password, u.nombre, u.apellido, u.email, u.telefono, u.enable FROM org_t.usuarios u where u.username = ?1 and u.password = ?2",
            nativeQuery = true)
    public UsuarioProjection findUserByUsernameAndPass(String user, String pass);
    
    
    

}

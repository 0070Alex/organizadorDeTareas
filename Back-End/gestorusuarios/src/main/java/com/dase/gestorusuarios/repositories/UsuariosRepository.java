/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorusuarios.repositories;

import com.dase.gestorusuarios.entities.Usuarios;
import com.dase.gestorusuarios.projection.UsuarioProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Alexander Elias
 */
public interface UsuariosRepository extends CrudRepository<Usuarios, Object> {

    @Query(value = "SELECT u.id_usuario as id, u.username , u.password, u.nombre, u.apellido, u.email, u.telefono, u.estado FROM db_usuarios.usuarios u where u.username = ?1 and u.password = ?2",
            nativeQuery = true)
    public UsuarioProjection findUserByUsernameAndPass(String user, String pass);

    @Query(value = "SELECT u.id_usuario as id, \n"
            + "	   u.username , \n"
            + "	   u.password, \n"
            + "	   u.nombre, \n"
            + "	   u.apellido, \n"
            + "	   u.email, \n"
            + "	   u.telefono, \n"
            + "	   u.estado \n"
            + "FROM db_usuarios.usuarios u \n"
            + "where u.email = ?1",
            nativeQuery = true)
    public UsuarioProjection findUsserByEmail(String email);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestortareas.projection;

import com.dase.gestortareas.entities.UsuarioRol;

/**
 *
 * @author Alexander Elias
 */
public interface UsuarioProjection {

    Long getId();
    String getUsername();
    String getPassword();
    String getNombre();
    String getApellido();
    String getEmail();
    String getTelefono();
    int getEnable ();
    UsuarioRol getUsuarioRoles();

}

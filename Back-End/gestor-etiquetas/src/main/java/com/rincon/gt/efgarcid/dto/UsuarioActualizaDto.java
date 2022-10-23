/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.dto;

/**
 *
 * @author egarc
 */
public class UsuarioActualizaDto {
    private Integer codigoUsuario;
    private Integer estado;
    private String nombreUsuario;
    private String passwordUsuario;

    public UsuarioActualizaDto() {
    }
    
    
    public UsuarioActualizaDto(Integer codigoUsuario, Integer estado, String nombreUsuario, String passwordUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }
    
    
    
}

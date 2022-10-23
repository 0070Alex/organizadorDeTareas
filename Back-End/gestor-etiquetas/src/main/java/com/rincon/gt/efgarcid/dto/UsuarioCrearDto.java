/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.dto;

/**
 *
 * @author egarc
 */
public class UsuarioCrearDto {
    private Integer codigoUsuario;
    private Integer estado;
    private String nombreUsuario;
    private String passwordUsuario;
    private String correoElectronico;
    private String direccion;

    public UsuarioCrearDto() {
    }

    public UsuarioCrearDto(Integer codigoUsuario, Integer estado, String nombreUsuario, String passwordUsuario, String correoElectronico, String direccion) {
        this.codigoUsuario = codigoUsuario;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "UsuarioCrearDto{" + "codigoUsuario=" + codigoUsuario + ", estado=" + estado + ", nombreUsuario=" + nombreUsuario + ", passwordUsuario=" + passwordUsuario + ", correoElectronico=" + correoElectronico + ", direccion=" + direccion + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rincon.gt.efgarcid.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

/**
 *
 * @author egarc
 */
@Entity
@DynamicUpdate
@Table(name = "bd_tablero",
         schema = "bd_tablero"
)
public class TableroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_tablero")
    private Integer codigoTablero;
    
    @Column(name = "nombre_tablero")
    private String nombreTablero;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "usuario_asignacion")
    private String usuarioAsignacion;
    
    @Column(name = "es_publico")
    private String esPbulico;
    
    @Column(name = "estado")
    private String estado;

    public TableroModel() {
    }

    public TableroModel(Integer codigoTablero, String nombreTablero, String descripcion, String usuarioAsignacion, String esPbulico, String estado) {
        this.codigoTablero = codigoTablero;
        this.nombreTablero = nombreTablero;
        this.descripcion = descripcion;
        this.usuarioAsignacion = usuarioAsignacion;
        this.esPbulico = esPbulico;
        this.estado = estado;
    }

    public Integer getCodigoTablero() {
        return codigoTablero;
    }

    public void setCodigoTablero(Integer codigoTablero) {
        this.codigoTablero = codigoTablero;
    }

    public String getNombreTablero() {
        return nombreTablero;
    }

    public void setNombreTablero(String nombreTablero) {
        this.nombreTablero = nombreTablero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuarioAsignacion() {
        return usuarioAsignacion;
    }

    public void setUsuarioAsignacion(String usuarioAsignacion) {
        this.usuarioAsignacion = usuarioAsignacion;
    }

    public String getEsPbulico() {
        return esPbulico;
    }

    public void setEsPbulico(String esPbulico) {
        this.esPbulico = esPbulico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 *
 * @author Alexander Elias
 */

@Entity
@Table(name = "ACTIVIDADES", schema = "DB_ACTIVIDADES")
public class Actividades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ACTIVIDAD")
    private Long id;   
    
    @JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LISTA")
    private ListaActividad listaActividad;    
    
    @Column(name = "NOMBRE_ACTIVIDAD")
    private String nombreActividad;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;   
              
    @Column(name = "FECHA_CREACION")  
    private Date fechaCreacion;
    
    @Column(name = "USUARIO_ADICIONO")
    private String usuarioAdiciono;
    
    @Column(name = "ESTADO")
    private boolean estado;
    
    @PrePersist
    public void prePersist(){
        this.fechaCreacion = new Date();
    }

    public Actividades() {
    }

    public Actividades(Long id, ListaActividad listaActividad, String nombreActividad, String descripcion, Date fechaCreacion, String usuarioAdiciono, boolean estado) {
        this.id = id;
        this.listaActividad = listaActividad;
        this.nombreActividad = nombreActividad;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ListaActividad getListaActividad() {
        return listaActividad;
    }

    public void setListaActividad(ListaActividad listaActividad) {
        this.listaActividad = listaActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioAdiciono() {
        return usuarioAdiciono;
    }

    public void setUsuarioAdiciono(String usuarioAdiciono) {
        this.usuarioAdiciono = usuarioAdiciono;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
       
    
}

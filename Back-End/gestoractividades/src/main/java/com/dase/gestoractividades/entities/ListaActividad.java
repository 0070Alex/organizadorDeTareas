/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestoractividades.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Alexander Elias
 */
@Entity
@Table(name = "LISTA_ACTIVIDAD", schema = "DB_ACTIVIDADES")
public class ListaActividad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LISTA")
    private Long id;
    
    @Column(name = "ID_TAREA")
    private int idTarea; 
    
    @Column(name = "NOMBRE_LISTA")
    private String nombreLista;
              
    @Column(name = "FECHA_ADICION")
    private Date fechaAdicion;
    
    @Column(name = "USUARIO_ADICIONO")
    private String usuarioAdiciono;
    
    @Column(name = "ESTADO")
    private boolean estado;
    
    
    @PrePersist
    public void prePersist(){
        this.fechaAdicion = new Date();
        this.estado = true;
    }


    public ListaActividad() {
    }

    public ListaActividad(Long id, String nombreLista, int idTarea, Date fechaAdicion, String usuarioAdiciono, boolean estado) {
        this.id = id;
        this.nombreLista = nombreLista;
        this.idTarea = idTarea;
        this.fechaAdicion = fechaAdicion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public Date getFechaAdicion() {
        return fechaAdicion;
    }

    public void setFechaAdicion(Date fechaAdicion) {
        this.fechaAdicion = fechaAdicion;
    }

    public String getUsuarioAdiciono() {
        return usuarioAdiciono;
    }

    public void setUsuarioAdiciono(String usuarioAdiciono) {
        this.usuarioAdiciono = usuarioAdiciono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  
}

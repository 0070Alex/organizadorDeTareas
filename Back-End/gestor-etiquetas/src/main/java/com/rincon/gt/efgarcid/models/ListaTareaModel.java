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
@Table(name = "bd_lista_tarea",
         schema = "bd_tablero"
)
public class ListaTareaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_lista")
    private Integer codigoLista;
    
    @Column(name = "codigo_tablero")
    private Integer codigoTablero;
    
    @Column(name = "nombre_lista")
    private String nombreLista;
    
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    
    @Column(name = "usuario_adiciono")
    private String usuarioAdiciono;
    
    @Column(name = "estado")
    private String estado;

    public ListaTareaModel() {
    }

    public ListaTareaModel(Integer codigoLista, Integer codigoTablero, String nombreLista, Date fechaCreacion, String usuarioAdiciono, String estado) {
        this.codigoLista = codigoLista;
        this.codigoTablero = codigoTablero;
        this.nombreLista = nombreLista;
        this.fechaCreacion = fechaCreacion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.estado = estado;
    }

    public Integer getCodigoLista() {
        return codigoLista;
    }

    public void setCodigoLista(Integer codigoLista) {
        this.codigoLista = codigoLista;
    }

    public Integer getCodigoTablero() {
        return codigoTablero;
    }

    public void setCodigoTablero(Integer codigoTablero) {
        this.codigoTablero = codigoTablero;
    }

    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

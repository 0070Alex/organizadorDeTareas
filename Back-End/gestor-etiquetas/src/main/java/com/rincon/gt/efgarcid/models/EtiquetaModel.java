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
@Table(name = "bd_etiqueta",
         schema = "bd_tablero"
)

public class EtiquetaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_etiqueta")
    private Integer codigoEtiqueta;
    
    @Column(name = "codigo_tablero")
    private Integer codigoTablero;
    
    @Column(name = "nombre_etiqueta")
    private String nombreEtiqueta;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    
    @Column(name = "usuario_adiciono")
    private String usuarioAdiciono;
    
    @Column(name = "estado")
    private String estado;

    public EtiquetaModel() {
    }

    public EtiquetaModel(Integer codigoEtiqueta, Integer codigoTablero, String nombreEtiqueta, String descripcion, Date fechaCreacion, String usuarioAdiciono, String estado) {
        this.codigoEtiqueta = codigoEtiqueta;
        this.codigoTablero = codigoTablero;
        this.nombreEtiqueta = nombreEtiqueta;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.usuarioAdiciono = usuarioAdiciono;
        this.estado = estado;
    }

    public Integer getCodigoEtiqueta() {
        return codigoEtiqueta;
    }

    public void setCodigoEtiqueta(Integer codigoEtiqueta) {
        this.codigoEtiqueta = codigoEtiqueta;
    }

    public Integer getCodigoTablero() {
        return codigoTablero;
    }

    public void setCodigoTablero(Integer codigoTablero) {
        this.codigoTablero = codigoTablero;
    }

    public String getNombreEtiqueta() {
        return nombreEtiqueta;
    }

    public void setNombreEtiqueta(String nombreEtiqueta) {
        this.nombreEtiqueta = nombreEtiqueta;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EtiquetaModel{" + "codigoEtiqueta=" + codigoEtiqueta + ", codigoTablero=" + codigoTablero + ", nombreEtiqueta=" + nombreEtiqueta + ", descripcion=" + descripcion + ", fechaCreacion=" + fechaCreacion + ", usuarioAdiciono=" + usuarioAdiciono + ", estado=" + estado + '}';
    }

    
}

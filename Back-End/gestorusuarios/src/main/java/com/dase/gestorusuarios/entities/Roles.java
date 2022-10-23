package com.dase.gestorusuarios.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "ROLES",schema="DB_USUARIOS")
public class Roles {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROL")
    private Long id;

    @Column(name = "ROL_NOMBRE")
    private String nombreRol;

    @Column(name = "FECHA_REGISTRO")
    private Date fechaRegistro;

    @Column(name = "ESTADO")
    private String estado;
    
    @PrePersist
    public void prePersist() {
        this.fechaRegistro = new Date();
        this.estado = "A";
    }

    public Roles() {
    }

    public Roles(Long id, String nombreRol, Date fechaRegistro, String estado) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }    
    
}

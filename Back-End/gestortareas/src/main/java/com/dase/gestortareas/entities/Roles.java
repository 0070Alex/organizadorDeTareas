package com.dase.gestortareas.entities;

import javax.persistence.*;

@Entity
@Table(name = "ROLES",schema="ORG_T")
public class Roles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROL")
    private Long id;    
    
    @Column(name = "ROL_NOMBRE")
    private String nombreRol;   
    
  

    public Roles() {
    }

    public Roles(Long rolId, String nombreRol) {
        this.id = rolId;
        this.nombreRol = nombreRol;
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

   
    
    
}

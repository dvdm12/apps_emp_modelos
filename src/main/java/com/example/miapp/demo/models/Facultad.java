package com.example.miapp.demo.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Facultad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ubicacion;
    
    @OneToOne(mappedBy = "facultad")
    private Decano decano;
    
    @OneToMany(mappedBy = "facultad")
    private Set<Docente> docentes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Decano getDecano() {
        return decano;
    }

    public void setDecano(Decano decano) {
        this.decano = decano;
    }

    public Set<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(Set<Docente> docentes) {
        this.docentes = docentes;
    }

    
}
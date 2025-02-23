package com.example.miapp.demo.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String codigo;

    @Column(nullable = false, name="creditos")
    private int creditos;

    @OneToMany(mappedBy = "asignatura", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="docente_id")
    private List<Docente> listaDocentes;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<Docente> getListaDocentes() {
        return listaDocentes;
    }

    public void setListaDocentes(List<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

}

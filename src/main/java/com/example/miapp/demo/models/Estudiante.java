package com.example.miapp.demo.models;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellido;

    @Column(nullable = false, length = 100)
    private String codigo;

    @Column(nullable = false)
    private int edad;

    @ManyToMany
    @JoinTable(
        name="estudiantes_asignaturas",
        joinColumns = @JoinColumn(name="asignatura_id"),
        inverseJoinColumns = @JoinColumn(name="estudiantes_id")
    )
}

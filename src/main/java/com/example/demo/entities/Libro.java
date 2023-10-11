package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Libro extends Base{

    @Column(name="Titulo")
    private String titulo;
    @Column(name="Fecha")
    private int fecha;
    @Column(name="Genero")
    private String genero;
    @Column(name="Paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores = new ArrayList<Autor>();



}

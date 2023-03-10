package com.example.democasaalex.Identity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
//@Table(name = "libros")
public class Libro {
    @Id
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private Integer precio;

    public Libro() {
    }

    public Libro(Long id, String titulo, String autor, String isbn, Integer precio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(id, libro.id) && Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(isbn, libro.isbn) && Objects.equals(precio, libro.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.autor,this.titulo,this.id,this.isbn,this.precio);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", precio=" + precio +
                '}';
    }
}

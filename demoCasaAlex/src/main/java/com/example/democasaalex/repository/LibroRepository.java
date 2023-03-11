package com.example.democasaalex.repository;

import com.example.democasaalex.Identity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}

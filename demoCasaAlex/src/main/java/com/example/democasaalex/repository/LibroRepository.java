package com.example.democasaalex.repository;

import com.example.democasaalex.Identity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}

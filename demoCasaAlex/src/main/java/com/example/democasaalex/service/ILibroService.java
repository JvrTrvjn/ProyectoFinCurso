package com.example.democasaalex.service;

import com.example.democasaalex.Identity.Libro;

import java.util.Optional;

public interface ILibroService {

    Optional<Libro> findById(Long id);}

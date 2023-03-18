package com.alexdev.simpleget.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="LIBROS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="LIBROID")
    private Long id;
    
    @Column(name ="TITULO")
    private String title;
    
    @Column(name ="AUTOR")
   	private String author;
    
    @Column(name ="ISBN")
  	private String ISBN;
    
    @Column(name ="PRECIO")
 	  private float price;
    public Book(Long id) {
        this.id = id;
    }

}
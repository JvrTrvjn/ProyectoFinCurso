package com.alexdev.simpleget.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="LIBROS")
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    
    @Id
    @Column(name ="LIBROID")
    private long id;
    
    @Column(name ="TITULO")
    private String title;
    
    @Column(name ="AUTOR")
   	private String author;
    
    @Column(name ="ISBN")
  	private String ISBN;
    
    @Column(name ="PRECIO")
 	  private float price;
}
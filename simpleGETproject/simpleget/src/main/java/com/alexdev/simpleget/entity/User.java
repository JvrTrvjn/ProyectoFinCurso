package com.alexdev.simpleget.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name ="USUARIOS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="USERID")
    private Long userId;

    @Column(name ="DNI")
    private String dni;

    @Column(name ="NOMBRE")
    private String nombre;

    @Column(name ="APELLIDO")
    private String apellido;

    @Column(name ="EMAIL")
    private String email;

    public User(Long userId) {
        this.userId = userId;
    }

}

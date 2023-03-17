package com.alexdev.simpleget.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

}

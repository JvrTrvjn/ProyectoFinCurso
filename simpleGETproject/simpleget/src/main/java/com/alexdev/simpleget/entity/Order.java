package com.alexdev.simpleget.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name ="PEDIDOS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="PEDIDOID")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "LIBROID")
    private Book orderBook;

    @ManyToOne
    @JoinColumn(name = "USERID")
    private User orderUser;

    @JoinColumn(name = "Cantidad")
    private Integer cantidad;
}

package com.alexdev.simpleget.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Entity
@Table(name ="PEDIDOS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @Column(name ="PEDIDOID")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "LIBROID")
    private Book orderBook;

    @ManyToOne
    @JoinColumn(name = "USERID")
    private User orderUser;
}

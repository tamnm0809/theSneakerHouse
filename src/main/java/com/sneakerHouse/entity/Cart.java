package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Table(name = "CART")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {
    @Id
    private Long id;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "total", nullable = false, precision = 10, scale = 0)
    private BigDecimal total;

    @ManyToOne
    @JoinColumn(name = "id_dt_pro", nullable = false)
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "id_acc", nullable = false)
    private User user;
}

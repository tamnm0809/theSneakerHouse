package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Table(name = "PRODUCT_DETAIL")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductDetail {
    @Id
    private Long id;

    @Column(name = "price_pro", nullable = false, precision = 10, scale = 0)
    private BigDecimal price_Pro;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "active", nullable = false)
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "id_dis", nullable = false)
    private Discount discount;

    @ManyToOne
    @JoinColumn(name = "id_size", nullable = false)
    private Size size;

    @ManyToOne
    @JoinColumn(name = "id_pro", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "productDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cart> cart;

    @OneToMany(mappedBy = "productDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Favourite> favourite;
}

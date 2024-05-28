package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "PRODUCT_IMAGE")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductImage {
    @Id
    private Long id;

    @Column(name = "url", nullable = false, length = 255)
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_pro", nullable = false)
    private Product product;
}

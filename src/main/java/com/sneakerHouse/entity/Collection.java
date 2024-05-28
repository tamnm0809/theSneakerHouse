package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name = "COLLECTION")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Collection {
    @Id
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_cate", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "collection", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> product;
}

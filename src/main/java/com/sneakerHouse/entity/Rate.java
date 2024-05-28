package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name = "RATE")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rate {
    @Id
    private Long id;

    @Column(name = "star", nullable = false)
    private int star;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_pro", nullable = false)
    private Product product;

    @OneToMany(mappedBy = "rate", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ImageRate> imageRate;
}

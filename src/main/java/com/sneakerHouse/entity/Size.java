package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name = "SIZE")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Size {
    @Id
    private Long id;

    @Column(name = "size_no", nullable = false, length = 10)
    private String sizeNo;

    @OneToMany(mappedBy = "size", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductDetail> productDetail;
}

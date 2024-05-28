package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "DISCOUNT")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Discount {
    @Id
    private Long id;

    @Column(name = "value", nullable = false, length = 10)
    private String value;

    @Column(name = "price_dis", nullable = false, precision = 10, scale = 0)
    private BigDecimal price_Dis;

    @Column(name = "start", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date start;

    @Column(name = "end", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date end;

    @OneToMany(mappedBy = "discount", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductDetail> productDetail;
}

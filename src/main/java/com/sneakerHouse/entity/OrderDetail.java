package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Table(name = "ORDER_DETAIL")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderDetail {
    @Id
    private Long id;

    @Column(name = "price_unit", nullable = false, precision = 10, scale = 0)
    private BigDecimal price_Unit;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "name_receive", nullable = false, length = 50)
    private String name_Receive;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @Column(name = "payment_method", nullable = false, length = 10)
    private String payment_Method;

    @Column(name = "delivery_method", nullable = false, length = 10)
    private String delivery_Method;

    @Column(name = "note", length = 255)
    private String note;

    @Column(name = "amount", nullable = false, precision = 10, scale = 0)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "id_dt_pro", nullable = false)
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "id_ord", nullable = false)
    private Order order;
}

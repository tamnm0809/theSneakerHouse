package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Table(name = "ORDER")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    @Id
    private Long id;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "date_order", nullable = false, length = 100)
    @Temporal(TemporalType.DATE)
    private Date date_order;

    @ManyToOne
    @JoinColumn(name = "id_acc", nullable = false)
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VNPay> vnPay;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderDetail> orderDetail;
}

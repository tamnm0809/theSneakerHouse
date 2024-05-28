package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Table(name = "FAVOURITE")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Favourite {
    @Id
    private Long id;

    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "id_dt_pro", nullable = false)
    private ProductDetail productDetail;

    @ManyToOne
    @JoinColumn(name = "id_acc", nullable = false)
    private User user;
}

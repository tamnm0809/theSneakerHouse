package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "IMAGE_RATE")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ImageRate {
    @Id
    private Long id;

    @Column(name = "url", nullable = false, length = 255)
    private String url;

    @ManyToOne
    @JoinColumn(name = "id_rate", nullable = false)
    private Rate rate;
}

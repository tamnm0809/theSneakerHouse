package com.sneakerHouse.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "ADDRESS")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "address", nullable = false, length = 255)
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_acc", nullable = false)
    private User user;
}

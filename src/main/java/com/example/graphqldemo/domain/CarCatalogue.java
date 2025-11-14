package com.example.graphqldemo.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "car_catalogue")
@Data
@NoArgsConstructor
public class CarCatalogue {
    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(name = "is_ready")
    private Boolean ready = false;

    @Column(nullable = true)
    private Integer price = null;

    private Integer stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Car car;
}

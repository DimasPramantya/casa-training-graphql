package com.example.graphqldemo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "type")
@Data
@NoArgsConstructor
public class CarType {
    @Id
    @Column(columnDefinition = "uuid")
    private UUID id;
    @Column(name = "type_name")
    private String typeName;
}

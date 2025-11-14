package com.example.graphqldemo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
public class Author{
    @Id
    @Column
    private String id;

    private String firstName;
    private String lastName;
    private Integer birthYear;
}


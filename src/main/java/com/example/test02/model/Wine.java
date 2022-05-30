package com.example.test02.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wine")
public class Wine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wine_seq")
    @SequenceGenerator(name = "wine_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String name;

}
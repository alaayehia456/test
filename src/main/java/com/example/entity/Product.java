package com.example.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Date date;
}

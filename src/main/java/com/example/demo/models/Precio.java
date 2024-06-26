package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name="precio")
@Entity
@Getter
@Setter

public class Precio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Habitacion habitacion;
    private String formaDePago;
    private String moneda;
    private int precioHabitacion;
}

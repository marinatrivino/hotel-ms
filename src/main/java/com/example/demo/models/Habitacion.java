package com.example.demo.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name="habitacion")
@Entity
@Getter
@Setter
public class Habitacion {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int nroHabitacion;
    private int capacidad;
    private Reserva reserva;
}

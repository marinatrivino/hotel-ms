package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name= "reserva")
@Entity
@Getter
@Setter

public class Reserva {
    private String nombrecliente;
    private int DNI;
    private int fechallegada;
    private int fechasalida;
    private int habitacion;
}

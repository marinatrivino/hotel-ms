package com.example.demo.dtos;

import com.example.demo.models.Reserva;
import lombok.Data;

@Data

public class HabitacionRequest {
    private int nroHabitacion;
    private int capacidad;
    private Reserva reserva;
}

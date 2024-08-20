package com.example.demo.dtos;

import com.example.demo.models.Reserva;
import lombok.Data;

@Data

public class HabitacionResponse {
    private int nroHabitacion;
    private int capacidad;
    private Reserva reserva;
}

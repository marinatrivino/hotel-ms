package com.example.demo.dtos;

import com.example.demo.models.Habitacion;
import lombok.Data;

@Data

public class PrecioResponse {
    private Habitacion habitacion;
    private String formaDePago;
    private String moneda;
    private int precioHabitacion;
}
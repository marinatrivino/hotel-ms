package com.example.demo.mappers;

import com.example.demo.dtos.HabitacionRequest;
import com.example.demo.dtos.HabitacionResponse;
import com.example.demo.models.Habitacion;
import org.springframework.stereotype.Service;

@Service
public class HabitacionMapper {
    public Habitacion habitacionRequestToHabitacion(HabitacionRequest habitacionRequest){
        Habitacion habitacion = new Habitacion();
        habitacion.setNroHabitacion(habitacionRequest.getNroHabitacion());
        habitacion.setCapacidad(habitacionRequest.getCapacidad());
        habitacion.setReserva(habitacionRequest.getReserva());

        return habitacion;
    }

    public HabitacionResponse habitacionResponseToHabitacion(HabitacionResponse habitacionResponse){
        HabitacionResponse habitacionResponse = new HabitacionResponse();
        HabitacionResponse.setNroHabitacion(habitacionResponse.getNroHabitacion());
        HabitacionResponse.setCapacidad(habitacionResponse.getCapacidad());
        HabitacionResponse.setReserva(habitacionResponse.getReserva());
        return habitacionResponse;
    }

}

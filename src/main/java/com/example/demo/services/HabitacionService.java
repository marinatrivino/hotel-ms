package com.example.demo.services;

import com.example.demo.dtos.HabitacionRequest;
import com.example.demo.mappers.HabitacionMapper;
import com.example.demo.models.Habitacion;
import com.example.demo.repositories.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HabitacionService {
    @Autowired
    private HabitacionRepository habitacionRepository;

    @Autowired
    private HabitacionMapper habitacionMapper;

    public ResponseEntity setHabitacion(HabitacionRequest habitacionRequest){
        Habitacion habitacion = habitacionMapper.habitacionRequestToHabitacion(habitacionRequest);
        habitacionRepository.save(habitacion);
        return ResponseEntity.ok("Habitacion numero: " + habitacion.getNroHabitacion + " "+ "Capacidad: " + habitacion.getCapacidad);
    }
}

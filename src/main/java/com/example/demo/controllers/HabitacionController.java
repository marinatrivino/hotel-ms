package com.example.demo.controllers;

import com.example.demo.dtos.HabitacionRequest;
import com.example.demo.services.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")

@Controller
public class HabitacionController {
    @Autowired
    private HabitacionService habitacionService;

    @PostMapping("/nuevaHabitacion")
    public ResponseEntity nuevaHabitacion(@RequestBody HabitacionRequest habitacionRequest){
        return habitacionService.setHabitacion(habitacionRequest);
    }
}

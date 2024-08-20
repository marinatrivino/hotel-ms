package com.example.demo.repositories;


import com.example.demo.models.Precio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrecioRepository extends JpaRepository<Precio, Long> {
}

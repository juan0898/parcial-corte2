package com.corhuila.app_parcial_g2.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.app_parcial_g2.Dto.ReservationDto;
import com.corhuila.app_parcial_g2.Models.Reservation;
import com.corhuila.app_parcial_g2.Services.IReservationService;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    private IReservationService service;

    @GetMapping List<Reservation> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Reservation findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Reservation create(@RequestBody ReservationDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}") 
    public Reservation update(@PathVariable Long id, @RequestBody ReservationDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
}

package com.corhuila.app_parcial_g2.Services;

import java.util.List;

import com.corhuila.app_parcial_g2.Dto.ReservationDto;
import com.corhuila.app_parcial_g2.Models.Reservation;

public interface IReservationService {
    List<Reservation> findAll();
    Reservation findById(Long id);
    Reservation create(ReservationDto dto);
    Reservation update(Long id, ReservationDto dto);
    void delete(Long id);
} 
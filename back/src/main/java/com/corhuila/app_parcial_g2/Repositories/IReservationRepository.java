package com.corhuila.app_parcial_g2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corhuila.app_parcial_g2.Models.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, Long> { 
}

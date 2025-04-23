package com.corhuila.app_parcial_g2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.app_parcial_g2.Dto.ReservationDto;
import com.corhuila.app_parcial_g2.Models.Reservation;
import com.corhuila.app_parcial_g2.Repositories.IReservationRepository;

@Service
public class ReservationService implements IReservationService {
    
    @Autowired
    private IReservationRepository repository;

    @Override
    public List<Reservation> findAll(){
        return repository.findAll();
    }

    @Override
    public Reservation findById(Long id){
        return repository.findById(id).orElse(null);
    }

    @Override
    public Reservation create(ReservationDto dto) {
        Reservation reservation = new Reservation();
        reservation.setDate(dto.getDate());
        reservation.setTime(dto.getTime());
        reservation.setName(dto.getName());
        reservation.setContact(dto.getContact());
        reservation.setTableId(dto.getTableId());
        return repository.save(reservation);
    }

    @Override
    public Reservation update(Long id, ReservationDto dto) {
        Reservation existing = findById(id);
        if (existing != null) {
            existing.setDate(dto.getDate());
            existing.setTime(dto.getTime());
            existing.setName(dto.getName());
            existing.setContact(dto.getContact());
            existing.setTableId(dto.getTableId());
            return repository.save(existing);
        }
        return null;
    }
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

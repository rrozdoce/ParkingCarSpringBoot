package com.api.parkingcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.parkingcontrol.models.ParkingSpotModel;

import java.util.UUID;

@Repository // transações com base de dados
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
  
}
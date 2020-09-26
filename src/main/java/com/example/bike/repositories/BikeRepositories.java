package com.example.bike.repositories;

import com.example.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepositories extends JpaRepository<Bike,Long> {

}

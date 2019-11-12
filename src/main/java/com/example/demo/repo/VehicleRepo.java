package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Vehicle;

/*@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

}*/
@Repository
public interface VehicleRepo extends JpaRepository <Vehicle,Long>
{}
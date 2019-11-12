package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Vehicle;

public interface VehicleService {
public Vehicle saveVehicle(Vehicle vehicle);
public Vehicle updateVehicle(Vehicle vehicle); 
public Boolean deleteVehicle(Long id);
public Vehicle getVehicle(Long id);
public List<Vehicle> getAllVehicles();
}

package com.example.demo.services.impl;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vehicle;
import com.example.demo.repo.VehicleRepo;
import com.example.demo.services.*;
@Service("vehicleServiceImpl")
public class VehicleServiceImpl implements VehicleService{
@Autowired
private VehicleRepo vehicleRepo;
	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepo.save(vehicle);
		
	}

	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}

	@Override
	public Boolean deleteVehicle(Long id) {
		Optional<Vehicle> vehicle=vehicleRepo.findById(id);
		if(vehicle.isPresent())
			{vehicleRepo.delete(vehicle.get());
			return true;}
		return false;
	}

	@Override
	public Vehicle getVehicle(Long id) {
		
		Optional<Vehicle> vehicle= vehicleRepo.findById(id);
		if(vehicle.isPresent())
		{
			return (vehicle.get());
		}
		return null;
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return vehicleRepo.findAll();
	}

}

package com.example.demo.services.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Driver;
import com.example.demo.repo.DriverRepo;
import com.example.demo.services.*;

@Service("driverServiceImpl")
public class DriverServiceImpl implements DriverService{
@Autowired
private DriverRepo driverRepo;
	@Override
	public Driver createDriver(Driver driver) {
		return  driverRepo.save(driver);
		
	}

	@Override
	public Driver updateDriver(Driver driver) {
		return  driverRepo.save(driver);
	}

	@Override
	public Boolean deleteDriver(Long driverId) {
		Boolean val=false;
		Optional<Driver> o=driverRepo.findById(driverId);
		if(o.isPresent())
		{
			val=true;
			driverRepo.delete(o.get());
		}
		return val;
	}

	@Override
	public Driver getDriver(Long driverId) {
		Optional<Driver> o=driverRepo.findById(driverId);
		if(o.isPresent())
		{
			return o.get();
		}
		return null;
	}

	@Override
	public List<Driver> getAllDrivers() {
		return driverRepo.findAll();
		
	}

}

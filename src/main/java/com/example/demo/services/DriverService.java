package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Driver;

public interface DriverService {
//create
	Driver createDriver(Driver driver);
	//update
	 Driver updateDriver(Driver driver);
	//delete
 Boolean deleteDriver(Long driverId);
	//getById
	 Driver getDriver(Long driverId);
	//getAll
	 List<Driver> getAllDrivers();
}

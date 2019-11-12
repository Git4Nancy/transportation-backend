package com.example.demo.services;

import java.util.List;

import com.example.demo.model.DriverSalary;

public interface DriverSalaryService {
	public DriverSalary createDriverSalary(DriverSalary driverSalary);

	public DriverSalary updateDriverSalary(DriverSalary driverSalary);

	public DriverSalary getDriverSalary(Long id);

	public Boolean deleteDriverSalary(DriverSalary driverSalary);

	public List<DriverSalary> getAllDriverSalary();

}

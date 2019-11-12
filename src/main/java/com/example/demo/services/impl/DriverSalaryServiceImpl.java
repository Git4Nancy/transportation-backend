package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DriverSalary;
import com.example.demo.repo.DriverSalaryRepo;
import com.example.demo.services.DriverSalaryService;
@Service("driverSalaryServiceImpl")
public class DriverSalaryServiceImpl implements DriverSalaryService{
@Autowired
private DriverSalaryRepo driverSalaryRepo;
	@Override
	public DriverSalary createDriverSalary(DriverSalary driverSalary) {
		// TODO Auto-generated method stub
		return driverSalaryRepo.save(driverSalary);
	}

	@Override
	public DriverSalary updateDriverSalary(DriverSalary driverSalary) {
		// TODO Auto-generated method stub
		return driverSalaryRepo.save(driverSalary);
	}

	@Override
	public DriverSalary getDriverSalary(Long id) {
		// TODO Auto-generated method stub
		Optional<DriverSalary> driverSalary=driverSalaryRepo.findById(id);
		if(driverSalary.isPresent())
			return driverSalary.get();
		return null;
	}

	@Override
	public Boolean deleteDriverSalary(DriverSalary driverSalary) {
		// TODO Auto-generated method stub
		Boolean deleted = true;
		driverSalaryRepo.delete(driverSalary);
		return deleted;
	}

	@Override
	public List<DriverSalary> getAllDriverSalary() {
		// TODO Auto-generated method stub
		return driverSalaryRepo.findAll();
	}

}

package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Driver;
import com.example.demo.services.impl.DriverServiceImpl;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/api/driver")
public class DriverController {
	
	// injecting 'DriverServiceImpl' class
@Autowired
private DriverServiceImpl driverServiceImpl;

//method to save 'Driver' object
@PostMapping
public ResponseEntity<?> saveDriver(@RequestBody Driver d)
{d.setDated(new Date());
	return (ResponseEntity<?>) ResponseEntity.ok().body(driverServiceImpl.createDriver(d));
	
}

//method to update 'Driver' object
@PutMapping
public ResponseEntity<?> updateDriver(@RequestBody Driver d)
{
	Driver dbdrvr=driverServiceImpl.getDriver(d.getId());
	if(dbdrvr==null)
		return (ResponseEntity<?>) ResponseEntity.notFound();
	BeanUtils.copyProperties(d, dbdrvr);
	return (ResponseEntity<?>) ResponseEntity.ok().body(driverServiceImpl.updateDriver(dbdrvr));
	
}

//method to delete 'Driver' object
@DeleteMapping("/{id}")
public ResponseEntity<?> deleteDriver(@PathVariable("id") Long driverId)
{
	return ResponseEntity.ok().body(driverServiceImpl.deleteDriver(driverId));
	}

@GetMapping("/{id}")
public ResponseEntity<?> getDriver(@PathVariable("id") Long driverId)
{
	if(driverServiceImpl.getDriver(driverId)==null)
		return (ResponseEntity<?>) ResponseEntity.notFound();
	return ResponseEntity.ok().body(driverServiceImpl.getDriver(driverId));
	
	}
@GetMapping("/all")
public ResponseEntity<?> getAll()
{ 
	return ResponseEntity.ok().body(driverServiceImpl.getAllDrivers());
	}







}

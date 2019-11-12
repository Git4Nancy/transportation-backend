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

import com.example.demo.model.Vehicle;
import com.example.demo.services.impl.VehicleServiceImpl;


@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
@Autowired
private VehicleServiceImpl vehicleServiceImpl;
@PostMapping
public ResponseEntity<?> Create(@RequestBody Vehicle veh)
{
	veh.setDated(new Date());
	return (ResponseEntity<?>) ResponseEntity.ok().body(vehicleServiceImpl.saveVehicle(veh));
}
@PutMapping
public ResponseEntity<?> update(@RequestBody Vehicle veh)
{
	Vehicle vehicle=vehicleServiceImpl.getVehicle(veh.getId());
	if(vehicle!=null)
	{
		BeanUtils.copyProperties(veh, vehicle);
		return(ResponseEntity<?>) ResponseEntity.ok().body(vehicleServiceImpl.updateVehicle(vehicle));
	}
	return (ResponseEntity<?>) ResponseEntity.notFound();
	
}
@DeleteMapping ("/{id}")
public ResponseEntity<?> delete(@PathVariable("id") Long id)
{
	return (ResponseEntity<?>) ResponseEntity.ok().body(vehicleServiceImpl.deleteVehicle(id));
}
@GetMapping ("/{id}")
public ResponseEntity<?> get(@PathVariable ("id") Long id)
{
return (ResponseEntity<?>)	ResponseEntity.ok().body(vehicleServiceImpl.getVehicle(id));
}
@GetMapping ("/all")
public ResponseEntity<?> getAll()
{
	return (ResponseEntity<?>) ResponseEntity.ok().body(vehicleServiceImpl.getAllVehicles());
}
}

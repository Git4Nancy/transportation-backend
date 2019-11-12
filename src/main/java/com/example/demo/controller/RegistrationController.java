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

import com.example.demo.model.Registration;
import com.example.demo.services.RegistrationService;
@CrossOrigin(origins="*", maxAge=3600)
@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Registration registration) {
		registration.setDated(new Date());
		return (ResponseEntity<?>) ResponseEntity.ok().body(registrationService.saveRegistration(registration));
	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Registration registration) {
		Registration register = registrationService.getRegistration(registration.getId());
		if (register != null) {
			BeanUtils.copyProperties(registration, register);
			return (ResponseEntity<?>) ResponseEntity.ok().body(registrationService.updateRegistration(register));
		}
		return (ResponseEntity<?>) ResponseEntity.notFound();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		return (ResponseEntity<?>) ResponseEntity.ok().body(registrationService.deleteRegistration(id));
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Long id) {
		return (ResponseEntity<?>) ResponseEntity.ok().body(registrationService.getRegistration(id));
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAll() {
		
		return (ResponseEntity<?>) ResponseEntity.ok().body(registrationService.getAllRegistration());
	}
}

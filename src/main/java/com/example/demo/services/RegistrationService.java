package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Registration;
import com.example.demo.model.RegistrationView;

public interface RegistrationService {
public Registration saveRegistration(Registration registration);
public Registration updateRegistration(Registration registration);
public Boolean deleteRegistration(Long id);
public Registration getRegistration(Long id);
public List<RegistrationView> getAllRegistration();
}

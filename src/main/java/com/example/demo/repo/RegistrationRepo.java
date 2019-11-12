package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Registration;
@Repository
public interface RegistrationRepo extends JpaRepository<Registration,Long>{

}

package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DriverSalary;

@Repository
public interface DriverSalaryRepo extends JpaRepository <DriverSalary,Long>{

}

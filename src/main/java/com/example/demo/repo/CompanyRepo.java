package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Company;

/*@Repository
public interface CompanyRepo extends JpaRepository<Company, Long> {

}*/
@Repository
public interface CompanyRepo extends JpaRepository<Company,Long>
{}
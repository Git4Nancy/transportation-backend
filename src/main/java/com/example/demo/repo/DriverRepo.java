package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Driver;

/*@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {

}
*/
@Repository
public interface DriverRepo extends JpaRepository<Driver,Long>
{}
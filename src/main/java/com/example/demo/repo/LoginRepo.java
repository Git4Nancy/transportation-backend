package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Login;

public interface LoginRepo extends JpaRepository<Login,Long> {

	Login findByUserName(String username);

}

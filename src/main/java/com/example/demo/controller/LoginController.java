package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.services.impl.LoginServiceImpl;

import ch.qos.logback.classic.net.SyslogAppender;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/api/login")
public class LoginController {
@Autowired
private LoginServiceImpl loginServiceImpl;
@PostMapping
public Boolean verifyLogin(@RequestBody Login l)
{
	return loginServiceImpl.verify(l);
}
}

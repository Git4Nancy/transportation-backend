package com.example.demo.services;

import com.example.demo.model.Login;

public interface LoginService {
public Login saveLogin(Login login);
public Login updateLogin(Login login);
public Boolean deleteLogin(int id);
public Boolean verify(Login l);
}

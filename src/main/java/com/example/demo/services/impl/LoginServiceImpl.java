package com.example.demo.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repo.LoginRepo;
import com.example.demo.services.LoginService;

@Service(value="loginService")
public class LoginServiceImpl implements LoginService {
@Autowired
private LoginRepo loginRepo;
	@Override
	public Login saveLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Login updateLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteLogin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean verify(Login l) {
	/*Boolean r=false;
		int id=1;
		Login o=loginRepo.findByUserName(l.getUserName());
		if(o!=null)
		{
			
			if( o.getUserName().equals(l.getUserName()) && o.getPassword().equals(l.getPassword()))
			{
				
				r=true;
			}
		}
		return r;
		*/
		return false;
	}

}

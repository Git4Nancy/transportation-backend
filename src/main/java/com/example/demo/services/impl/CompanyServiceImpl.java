package com.example.demo.services.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.repo.CompanyRepo;
import com.example.demo.services.*;
@Service("companyService")
public class CompanyServiceImpl implements CompanyService{
@Autowired
private CompanyRepo companyRepo;
	@Override
	public Company saveCompany(Company company) {
		return companyRepo.save(company);
	
	}

	@Override
	public Company updateCompany(Company company) {
		return companyRepo.save(company);
	}

	@Override
	public Boolean deleteCompany(Long comanyId) {
		Boolean val=false;
		Optional<Company> company=companyRepo.findById(comanyId);
		if(company.isPresent())
			{companyRepo.delete(company.get());
			val=true;
			}
		return val;
	}

	@Override
	public Company getCompany(Long companyId) {
		Optional<Company> company=companyRepo.findById(companyId);
		if(company.isPresent())
			return company.get();
		return null;
	}

	@Override
	public List<Company> getAll() {
		// TODO Auto-generated method stub
		return companyRepo.findAll();
	}

}

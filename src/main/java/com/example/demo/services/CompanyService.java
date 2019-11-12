package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Company;

public interface CompanyService {
//create company
	public Company saveCompany(Company company);
	//update
	public Company updateCompany(Company company);
	//delete
	public Boolean deleteCompany(Long comanyId);
	//getCompany
	public Company getCompany(Long companyId);
	//getAll
	public List<Company> getAll();
}

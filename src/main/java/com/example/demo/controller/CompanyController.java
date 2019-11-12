package com.example.demo.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.services.impl.CompanyServiceImpl;

@CrossOrigin(origins="*" , maxAge=3600)
@RestController
@RequestMapping("/api/company")
public class CompanyController {
	@Autowired
	private CompanyServiceImpl companyService;
//save
	
	@PostMapping
	public ResponseEntity<?> saveCompany(@RequestBody Company company)
	{	company.setDated(new Date());
		return (ResponseEntity<?>) ResponseEntity.ok().body(companyService.saveCompany(company));
			}
	//update
	@PutMapping
	public ResponseEntity<?> updateCompany(@RequestBody Company company)
	{
		
		Company com=companyService.getCompany(company.getId());
		if(com==null)
			return (ResponseEntity<?>) ResponseEntity.notFound();
		BeanUtils.copyProperties(company, com);
		return (ResponseEntity<?>) ResponseEntity.ok().body(companyService.updateCompany(com));
		}
	//delete
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCompany(@PathVariable("id")Long companyId)
	{
		return (ResponseEntity<?>) ResponseEntity.ok().body(companyService.deleteCompany(companyId));
	}
	//GetCompany
	@GetMapping("/{id}")
	public ResponseEntity<?> getCompany(@PathVariable ("id") Long companyId)
	{
		Company company=companyService.getCompany(companyId);
		if(company==null)
			return (ResponseEntity<?>) ResponseEntity.notFound();
		return (ResponseEntity<?>) ResponseEntity.ok().body(company);
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllCompanies()
	{
	return (ResponseEntity<?>) ResponseEntity.ok().body(companyService.getAll());
	}
	@GetMapping("/allSorted")
	public List<Company> getAllSortedCompanies()
	{
		Comparator<Company> com=(I1,I2)->{
			String c1=I1.toString();
			String c2=I2.toString();
			return c1.compareTo(c2);
		};
		List<Company> l=companyService.getAll();
		Collections.sort(l,com);
		 return l;
	
	}
}

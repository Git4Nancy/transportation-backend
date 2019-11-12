package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DriverSalary;
import com.example.demo.model.DriverSalaryBean;
import com.example.demo.model.DriverSalaryDetail;
import com.example.demo.model.DriverSalaryDetailBean;
import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceBean;
import com.example.demo.model.InvoiceItem;
import com.example.demo.model.InvoiceItemBean;
import com.example.demo.services.impl.DriverSalaryServiceImpl;

@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/api/driverSalary")
public class DriverSalaryController {
	@Autowired
private DriverSalaryServiceImpl driverSalaryServiceImpl;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public DriverSalary create(@RequestBody DriverSalary d)
	{
		d.setDated(new Date());
		return driverSalaryServiceImpl.createDriverSalary(d);
	
	}
	
	////////////////////////////////////////////
	@DeleteMapping(value = "/{id}")
	public Boolean delete(@PathVariable("id") Long id) {
		DriverSalary driverSalary = driverSalaryServiceImpl.getDriverSalary(id);
		if (driverSalary != null) {
			return driverSalaryServiceImpl.deleteDriverSalary(driverSalary);
		}
		return false;
	}

	@GetMapping(value = "/{id}")
	public DriverSalaryBean get(@PathVariable("id") Long id) {
		DriverSalary driverSalary = driverSalaryServiceImpl.getDriverSalary(id);
		DriverSalaryBean driverSalaryBean = new DriverSalaryBean();
		BeanUtils.copyProperties(driverSalary, driverSalaryBean);
		driverSalaryBean.setDriverSalaryDetail(new ArrayList<DriverSalaryDetailBean>());
		for (DriverSalaryDetail item : driverSalary.getDriverSalaryDetail()) {
			DriverSalaryDetailBean i = new DriverSalaryDetailBean();
			BeanUtils.copyProperties(item, i);
			driverSalaryBean.getDriverSalaryDetail().add(i);
		}

		return driverSalaryBean;
	}

	@GetMapping(value = "/all")
	public List<DriverSalary> getAll() {
		return driverSalaryServiceImpl.getAllDriverSalary();
	}

	////////////////////////////////////////////
}

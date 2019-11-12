package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.model.Driver;
import com.example.demo.model.Registration;
import com.example.demo.model.RegistrationView;
import com.example.demo.model.Vehicle;
import com.example.demo.repo.CompanyRepo;
import com.example.demo.repo.DriverRepo;
import com.example.demo.repo.RegistrationRepo;
import com.example.demo.repo.VehicleRepo;
import com.example.demo.services.RegistrationService;
@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService{
@Autowired 
private RegistrationRepo registrationRepo;
@Autowired
private DriverRepo driverRepo;
@Autowired
private CompanyRepo companyRepo;
@Autowired
private VehicleRepo vehicleRepo;
	@Override
	public Registration saveRegistration(Registration registration) {
		// TODO Auto-generated method stub
		return registrationRepo.save(registration);
	}

	@Override
	public Registration updateRegistration(Registration registration) {
		// TODO Auto-generated method stub
		return registrationRepo.save(registration);
	}

	@Override
	public Boolean deleteRegistration(Long id) {
		// TODO Auto-generated method stub
		Optional<Registration> registration=registrationRepo.findById(id);
		if(registration.isPresent())
		{registrationRepo.delete(registration.get());
		return true;}
		return false;
	}

	@Override
	public Registration getRegistration(Long id) {
		// TODO Auto-generated method stub
		Optional<Registration> registration=registrationRepo.findById(id);
		if(registration.isPresent())
			return registration.get();
		return null;
	}

	@Override
	public List<RegistrationView> getAllRegistration() {
		// TODO Auto-generated method stub
		List<Registration> regs= registrationRepo.findAll();
		
		List<RegistrationView> regisview=new ArrayList<>();
		for(Registration r:regs)
		{
			RegistrationView rv=new RegistrationView();
			//System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"+r.getDriver()+"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			if(r.getDriver()!=null)
			{
			Optional<Driver> o=driverRepo.findById(r.getDriver().getId());
			if(o.isPresent())
			{
				rv.setDriverName(o.get().getName());
				rv.setDriverPh(o.get().getPh());
			}
			}
			else
			{
				rv.setDriverName(null);
				rv.setDriverPh(null);
			}
			if(r.getCompany()!=null)
			{
			Optional<Company> company=companyRepo.findById(r.getCompany().getId());
			if(company.isPresent())
				rv.setCompanyName(company.get().getName());
			
			}
			else
				rv.setCompanyName(null);
			if(r.getVehicle()!=null)
			{
			Optional<Vehicle> vehicle= vehicleRepo.findById(r.getVehicle().getId());
			if(vehicle.isPresent())
				
				rv.setVehicleName(vehicle.get().getName());
				
			}
			else
				rv.setVehicleName(null);
			
			rv.setId(r.getId());
			rv.setArvlDate(r.getArvl_dt());
			rv.setDptDate(r.getDpt_d());
			rv.setGuest(r.getGuestName());
			rv.setComments(r.getComments());
			rv.setInvoiceId(r.getInvoiceId());
			rv.setStatus(r.getReservationStatus());
			//rv.setVehicle(new Vehicle());
			//rv.getVehicle().setName(r.getVehicle().getName());
			regisview.add(rv);
			//System.out.println(rv);
		}
		
		return regisview;
	}

}

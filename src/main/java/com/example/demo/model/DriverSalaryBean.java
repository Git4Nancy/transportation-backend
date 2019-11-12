package com.example.demo.model;

import java.util.Date;
import java.util.List;
public class DriverSalaryBean{
	private Long id;
	private String checkNo;
	private Date dated;
	private Company company;
	private String guest;
	private Driver driver;
	private Vehicle vehicle;
	private List<DriverSalaryDetailBean> driverSalaryDetail;
	private Double gratuity;
	private Double totalAmount;
	private Double taxRate;
	private Double taxAmount;
	private Double grossAmount;
	private Boolean active=true;
	private String description;
	private Double deduction;
	private String status="UN-PAID";
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	public Date getDated() {
		return dated;
	}
	public void setDated(Date dated) {
		this.dated = dated;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public List<DriverSalaryDetailBean> getDriverSalaryDetail() {
		return driverSalaryDetail;
	}
	public void setDriverSalaryDetail(List<DriverSalaryDetailBean> driverSalaryDetail) {
		this.driverSalaryDetail = driverSalaryDetail;
	}
	public Double getGratuity() {
		return gratuity;
	}
	public void setGratuity(Double gratuity) {
		this.gratuity = gratuity;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getDeduction() {
		return deduction;
	}
	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}

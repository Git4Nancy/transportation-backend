package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tbl_driver_salary")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DriverSalary {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String checkNo;
	private String guest;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dated;
	@OneToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;
	@OneToOne
	@JoinColumn(name = "driver_id", referencedColumnName = "id")
	private Driver driver;
	@OneToOne
	@JoinColumn(name = "vehicle_id", referencedColumnName = "id")
	private Vehicle vehicle;
	private String status="UN-PAID";
	@JsonManagedReference
	@OneToMany(mappedBy = "driverSalary", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DriverSalaryDetail> driverSalaryDetail;
	private Double gratuity;
	private Double totalAmount;
	private Double taxRate;
	private Double taxAmount;
	private Double grossAmount;
	private Boolean active=true;
	private String description;
	private Double deduction;
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
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<DriverSalaryDetail> getDriverSalaryDetail() {
		return driverSalaryDetail;
	}
	public void setDriverSalaryDetail(List<DriverSalaryDetail> driverSalaryDetail) {
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

}

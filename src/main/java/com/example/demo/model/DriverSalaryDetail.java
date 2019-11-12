package com.example.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "tbl_driver_salary_detail")
public class DriverSalaryDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date itemdate;
	private String description;
	@JsonBackReference
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_salary_id")
	private DriverSalary driverSalary;
	//@Temporal(TemporalType.TIMESTAMP)
	private Date timeIn;
	//@Temporal(TemporalType.TIMESTAMP)
	private Date timeOut;
	private Double lessHour;
	private Double totalHour;
	private Double hourCharge;
	private Double tripCharge;
	private Double parkCharge;
	private Double totalCharge;

	private String it_d;
	private String ti_d;
	private String to_d;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getItemdate() {
		return itemdate;
	}
	public void setItemdate(Date itemdate) {
		this.itemdate = itemdate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DriverSalary getDriverSalary() {
		return driverSalary;
	}
	public void setDriverSalary(DriverSalary driverSalary) {
		this.driverSalary = driverSalary;
	}
	public Date getTimeIn() {
		return timeIn;
	}
	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}
	public Date getTimeOut() {
		return timeOut;
	}
	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}
	public Double getLessHour() {
		return lessHour;
	}
	public void setLessHour(Double lessHour) {
		this.lessHour = lessHour;
	}
	public Double getTotalHour() {
		return totalHour;
	}
	public void setTotalHour(Double totalHour) {
		this.totalHour = totalHour;
	}
	public Double getHourCharge() {
		return hourCharge;
	}
	public void setHourCharge(Double hourCharge) {
		this.hourCharge = hourCharge;
	}
	public Double getTripCharge() {
		return tripCharge;
	}
	public void setTripCharge(Double tripCharge) {
		this.tripCharge = tripCharge;
	}
	public Double getParkCharge() {
		return parkCharge;
	}
	public void setParkCharge(Double parkCharge) {
		this.parkCharge = parkCharge;
	}
	public Double getTotalCharge() {
		return totalCharge;
	}
	public void setTotalCharge(Double totalCharge) {
		this.totalCharge = totalCharge;
	}
	public String getIt_d() {
		return it_d;
	}
	public void setIt_d(String it_d) {
		this.it_d = it_d;
	}
	public String getTi_d() {
		return ti_d;
	}
	public void setTi_d(String ti_d) {
		this.ti_d = ti_d;
	}
	public String getTo_d() {
		return to_d;
	}
	public void setTo_d(String to_d) {
		this.to_d = to_d;
	}
	
}

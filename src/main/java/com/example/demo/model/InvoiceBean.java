package com.example.demo.model;
import java.util.Date;
import java.util.List;

public class InvoiceBean {
	private Long id;
	private Date dated;
	private String guest;
	private Company company;
	private Driver driver;
	private Vehicle vehicle;
	private List<InvoiceItemBean> invoiceItem;
	private Double gratuity;
	private Double totalAmount;
	private Double taxRate;
	private Double taxAmount;
	private Double deduction;
	private Double grossAmount;
	private String status;
	private String description;
	private Boolean active = true;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDated() {
		return dated;
	}
	public void setDated(Date dated) {
		this.dated = dated;
	}
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
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
	public List<InvoiceItemBean> getInvoiceItem() {
		return invoiceItem;
	}
	public void setInvoiceItem(List<InvoiceItemBean> invoiceItem) {
		this.invoiceItem = invoiceItem;
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
	public Double getDeduction() {
		return deduction;
	}
	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}
	public Double getGrossAmount() {
		return grossAmount;
	}
	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	}

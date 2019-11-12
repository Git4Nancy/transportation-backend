package com.example.demo.model;
import java.util.Collection;
import java.util.Date;

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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tbl_invoice")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dated;
	private Double gratuity;
	private Double grossAmount;
	private String guest;
	private Double taxAmount;
	private Double taxRate;
	private Double totalAmount;
	@OneToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;
	@OneToOne
	@JoinColumn(name = "driver_id", referencedColumnName = "id")
	private Driver driver;
	@OneToOne
	@JoinColumn(name = "vehicle_id", referencedColumnName = "id")
	private Vehicle vehicle;
	private Boolean active = true;
	private String status = "UN-PAID";
	@JsonManagedReference
	@OneToMany(mappedBy = "invoice", fetch = FetchType.LAZY, targetEntity = InvoiceItem.class, cascade = CascadeType.ALL, orphanRemoval = true)
	private Collection<InvoiceItem> invoiceItem;
	private String description;
	private Double deduction;

	public Double getDeduction() {
		return deduction;
	}

	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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

	public Double getGratuity() {
		return gratuity;
	}

	public void setGratuity(Double gratuity) {
		this.gratuity = gratuity;
	}

	public Double getGrossAmount() {
		return grossAmount;
	}

	public void setGross_amount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collection<InvoiceItem> getInvoiceItem() {
		return invoiceItem;
	}

	public void setInvoiceItem(Collection<InvoiceItem> invoiceItem) {
		this.invoiceItem = invoiceItem;
	}

	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

/*import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "tbl_invoice")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Invoice {
	//  " https://www.tutorialspoint.com/jpa/jpa_orm_components.htm " Learn from this link about annotations
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dated;
	private Double gratuity;
	private Double grossAmount;
	private String guest;
	private Double taxAmount;
	private Double taxRate;
	private Double totalAmount;
	@OneToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;
	@OneToOne
	@JoinColumn(name = "driver_id", referencedColumnName = "id")
	private Driver driver;
	@OneToOne
	@JoinColumn(name = "vehicle_id", referencedColumnName = "id")
	private Vehicle vehicle;
	private Boolean active = true;
	private String status = "UN-PAID";
	@JsonManagedReference
	@OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
	private List<InvoiceItem> invoiceItem;
	private String description;
	private Double deduction;


	public Double getDeduction() {
		return deduction;
	}

	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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

	public Double getGratuity() {
		return gratuity;
	}

	public void setGratuity(Double gratuity) {
		this.gratuity = gratuity;
	}

	public Double getGrossAmount() {
		return grossAmount;
	}

	public void setGross_amount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<InvoiceItem> getInvoiceItem() {
		return invoiceItem;
	}

	public void setInvoiceItem(List<InvoiceItem> invoiceItem) {
		this.invoiceItem = invoiceItem;
	}

}
*/
package com.example.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_registration")

public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//autoincrement
	private Long id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company company;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dated;
	private String wing;
	@Temporal(TemporalType.TIMESTAMP)//it assures that it is time java.sql.date
	private Date arrivalDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date departureDate;
	
	private String guestName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "driver_id", referencedColumnName = "id", nullable = true)
	private Driver driver;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vehicle_id", referencedColumnName = "id", nullable = true)
	private Vehicle vehicle;
	//@OneToOne
	//@JoinColumn(name = "invoice_id", referencedColumnName = "id", nullable = true)
	//private Invoice invoice;
	private String invoiceId;
	private String comments;
	private String reservationStatus="FRESH";
	private Boolean active=true;
private String arvl_dt;
private String dpt_d;

	public String getArvl_dt() {
	return arvl_dt;
}

public void setArvl_dt(String arvl_dt) {
	this.arvl_dt = arvl_dt;
}

public String getDpt_d() {
	return dpt_d;
}

public void setDpt_d(String dpt_d) {
	this.dpt_d = dpt_d;
}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Date getDated() {
		return dated;
	}

	public void setDated(Date dated) {
		this.dated = dated;
	}

	public Boolean getActive() {
	return active;
}

public void setActive(Boolean active) {
	this.active = active;
}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
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

	/*public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
*/
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getReservationStatus() {
		return reservationStatus;
	}

	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}

}

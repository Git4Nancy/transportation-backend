package com.example.demo.model;

import java.util.Date;

public class RegistrationBean {
	private Long id;
	private Company company;
	private String wing;
	private Date arrivalDate;
	private Date departureDate;
	private String guestName;
	private Driver driver;
	private Vehicle vehicle;
	//private InvoiceBean invoice;//object should be of invoice only
	private String comments;
	private String reservationStatus="FRESH";
	private Boolean active=true;
	private String invoiceId;
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
	/*public InvoiceBean getInvoice() {
		return invoice;
	}
	public void setInvoice(InvoiceBean invoice) {
		this.invoice = invoice;
	}*/
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

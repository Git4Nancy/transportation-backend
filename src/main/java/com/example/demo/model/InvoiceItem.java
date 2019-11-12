package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tbl_invoice_item")
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class InvoiceItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date itemDate;
	private String description;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice_id")
	private Invoice invoice;
	private Date timeIn;
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

	public Date getItemDate() {
		return itemDate;
	}

	public void setItemDate(Date itemDate) {
		this.itemDate = itemDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
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
		InvoiceItem other = (InvoiceItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Invoice;

public interface InvoiceService {

	Invoice createInvoice(Invoice invoice);

	Invoice updateInvoice(Invoice invoice);

	Invoice getInvoice(Long invoice);

	Boolean deleteInvoice(Invoice invoice);

	List<Invoice> getAllInvoice();

	/*List<Vehicle> getAllVehicle();

	List<Company> getAllCompany();

	List<Driver> getAllDriver();
*/
}

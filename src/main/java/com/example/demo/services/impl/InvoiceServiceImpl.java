package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repo.InvoiceRepo;
import com.example.demo.services.InvoiceService;

@Service(value = "invoiceservice")
public class InvoiceServiceImpl implements InvoiceService {

	
	@Autowired
	private InvoiceRepo invoiceRepo;

	@Override
	@Transactional
	public Invoice createInvoice(Invoice invoice) {
		return invoiceRepo.save(invoice);
	}

	@Override
	@Transactional
	public Invoice updateInvoice(Invoice invoice) {
		return invoiceRepo.save(invoice);
	}
	
	@Override
	@Transactional
	public Invoice getInvoice(Long invoice) {
		Optional<Invoice> inv = invoiceRepo.findById(invoice);
		if (inv.isPresent()) {
			return inv.get();
		}
		return null;
	}

	@Override
	@Transactional
	public Boolean deleteInvoice(Invoice invoice) {
		Boolean deleted = true;
		invoiceRepo.delete(invoice);
		return deleted;
	}

	@Override
	@Transactional
	public List<Invoice> getAllInvoice() {
		return invoiceRepo.findAll();
	}
}

/*package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Invoice;
import com.example.demo.repo.InvoiceRepo;
import com.example.demo.services.InvoiceService;

@Service(value = "invoiceservice")
public class InvoiceServiceImpl implements InvoiceService {

	
	@Autowired
	private InvoiceRepo invoiceRepo;

	@Override
	public Invoice createInvoice(Invoice invoice) {
		return invoiceRepo.save(invoice);
	}

	@Override
	public Invoice updateInvoice(Invoice invoice) {
	
		return invoiceRepo.save(invoice);
	}

	@Override
	public Invoice getInvoice(Long invoice) {
		Optional<Invoice> inv = invoiceRepo.findById(invoice);
		
		if (inv.isPresent()) {
			return inv.get();
		}
		return null;
	}

	@Override
	public Boolean deleteInvoice(Invoice invoice) {
		Boolean deleted = true;
		invoiceRepo.delete(invoice);
		return deleted;
	}

	@Override
	public List<Invoice> getAllInvoice() {
		return invoiceRepo.findAll();
	}
}
*/
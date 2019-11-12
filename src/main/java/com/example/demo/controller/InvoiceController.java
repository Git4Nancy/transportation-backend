package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.example.demo.model.Driver;
import com.example.demo.model.Invoice;
import com.example.demo.model.InvoiceBean;
import com.example.demo.model.InvoiceItem;
import com.example.demo.model.InvoiceItemBean;
import com.example.demo.repo.InvoiceItemRepo;
import com.example.demo.services.InvoiceService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {
	@Autowired
	private InvoiceService invoiceService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Invoice getCreateInvoicePage(@RequestBody Invoice invoice) {
		invoice.setDated(new Date());
		return invoiceService.createInvoice(invoice);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody Invoice invoice) {
		Invoice invoicedb=invoiceService.getInvoice(invoice.getId());
		if(invoicedb==null) {
			return (ResponseEntity<?>) ResponseEntity.notFound();
		}
		return (ResponseEntity<?>) ResponseEntity.ok().body(invoiceService.updateInvoice(invoice));
		
	}

	@DeleteMapping(value = "/{id}")
	public Boolean getDeleteInvoicePage(@PathVariable("id") Long id) {
		Invoice invoice = invoiceService.getInvoice(id);
		if (invoice != null) {
			return invoiceService.deleteInvoice(invoice);
		}
		return false;
	}

	@GetMapping(value = "/{id}")
	public InvoiceBean getInvoicePage(@PathVariable("id") Long id) {
		Invoice invoice = invoiceService.getInvoice(id);
		if(invoice==null)
			return null;
		else
		{
		InvoiceBean bean = new InvoiceBean();
		BeanUtils.copyProperties(invoice, bean);
		bean.setInvoiceItem(new ArrayList<InvoiceItemBean>());
		for (InvoiceItem item : invoice.getInvoiceItem()) {
			InvoiceItemBean i = new InvoiceItemBean();
			BeanUtils.copyProperties(item, i);
			bean.getInvoiceItem().add(i);
		}

		return bean;
		}
	}
	@GetMapping(value = "/all")
	public List<Invoice> getInvoices() {
		return invoiceService.getAllInvoice();
	}
	
}

/*public class InvoiceController {
	@Autowired
	private InvoiceService invoiceService;
	@Autowired
	private InvoiceItemRepo invoiceItemRepo;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Invoice getCreateInvoicePage(@RequestBody Invoice invoice) {
		invoice.setDated(new Date());
		return invoiceService.createInvoice(invoice);
	}

	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody InvoiceBean invoice) {
		Invoice invoicedb=invoiceService.getInvoice(invoice.getId());
		for(InvoiceItem item:invoicedb.getInvoiceItem())
		{
			invoiceItemRepo.deleteById(item.getId());
		}
		List<InvoiceItem> itemList=new ArrayList<>();
		for(InvoiceItemBean item:invoice.getInvoiceItem())
		{
		//	invoiceItemRepo.deleteById(item.getId());
			item.setId(null);
			InvoiceItem obj=new InvoiceItem();
			BeanUtils.copyProperties(item,obj);
			itemList.add(obj);
			
		}
		if(invoicedb==null)
			return (ResponseEntity<?>) ResponseEntity.notFound();
		BeanUtils.copyProperties(invoice,invoicedb);
		invoicedb.setInvoiceItem(itemList);
		return (ResponseEntity<?>) ResponseEntity.ok().body(invoiceService.updateInvoice(invoicedb));
		
	}

	@DeleteMapping(value = "/{id}")
	public Boolean getDeleteInvoicePage(@PathVariable("id") Long id) {
		Invoice invoice = invoiceService.getInvoice(id);
		if (invoice != null) {
			return invoiceService.deleteInvoice(invoice);
		}
		return false;
	}

	@GetMapping(value = "/{id}")
	public InvoiceBean getInvoicePage(@PathVariable("id") Long id) {
		Invoice invoice = invoiceService.getInvoice(id);
		InvoiceBean bean = new InvoiceBean();
		BeanUtils.copyProperties(invoice, bean);
		bean.setInvoiceItem(new ArrayList<InvoiceItemBean>());
		for (InvoiceItem item : invoice.getInvoiceItem()) {
			InvoiceItemBean i = new InvoiceItemBean();
			BeanUtils.copyProperties(item, i);
			bean.getInvoiceItem().add(i);
		}

		return bean;
	}

	

}
*/
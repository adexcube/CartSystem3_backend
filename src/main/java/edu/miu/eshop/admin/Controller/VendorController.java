package edu.miu.eshop.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.eshop.admin.Service.VendorService;
import edu.miu.eshop.admin.domain.Product;
import edu.miu.eshop.admin.domain.Vendor;


@RestController
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	public VendorService service;
	
	@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllVendors() {
		List<Vendor> vendor = service.getAllVendors();
		return new ResponseEntity<List<Vendor>>(vendor, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value="/update")
	public ResponseEntity<?> updateVendor(@RequestBody Vendor vendor) {
		service.addVendor(vendor);
		return new ResponseEntity<String>("Vendor Updated Successfully", HttpStatus.OK);
	}
	
	
	
	@GetMapping(value="/vendor/{regid}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getVendor(@PathVariable("regid") long regId) {
		Vendor vendor = service.getVendor(regId);
		return new ResponseEntity<Vendor>(vendor, HttpStatus.OK);
	}
	
	
	
	@GetMapping(value ="/status/{regid}" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getStatus(@PathVariable("regid") long regId) {
		Vendor vendor = service.getVendor(regId);
		boolean status = vendor.getStatus();
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value="/updatestatus")
	public ResponseEntity<?> updateStatus(@RequestParam("status") boolean status, @RequestParam("regid") long regId) {
		Vendor vendor = service.getVendor(regId);
		vendor.setStatus(status);
		service.addVendor(vendor);
		return new ResponseEntity<String>("Status updated successfully.", HttpStatus.OK);
	}
	
	
	
	@PostMapping(value= "/create/{vendornumber}/{vendorname}/{regid}")
	public ResponseEntity<?> createStatus(@PathVariable("vendornumber") long vendornumber, 
			@PathVariable("vendorname") String vendorname, @PathVariable("regid") long regId) {
		Vendor vendor = new Vendor(vendornumber, vendorname, regId);
		service.addVendor(vendor);
		return new ResponseEntity<String>("Vendor created successfully", HttpStatus.OK);
	}
	
	
	@GetMapping(value="/vendorproduct/{id}")
	public ResponseEntity<?> getVendorProducts(@PathVariable("id") long regId) {
		Vendor vendor = service.getVendor(regId);
		List<Product> product = vendor.getProduct();
		return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
	}

	
	
}

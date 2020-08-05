package edu.miu.eshop.admin.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.eshop.admin.Repository.VendorRepository;
import edu.miu.eshop.admin.domain.Vendor;


@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository repository;
	
	
	@Override
	public void addVendor(Vendor vendor) {
		repository.save(vendor);
	}


	@Override
	public void deleteVendor(long regId) {
		repository.deleteById(regId);
	}

	@Override
	public Vendor getVendor(long regId) {
		Optional<Vendor> vendor = repository.findById(regId);
		return vendor.orElse(null);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return repository.findAll();
	}




}

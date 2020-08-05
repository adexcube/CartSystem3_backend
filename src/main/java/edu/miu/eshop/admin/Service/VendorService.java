package edu.miu.eshop.admin.Service;

import java.util.List;

import edu.miu.eshop.admin.domain.Vendor;


public interface VendorService {
	
	public void addVendor(Vendor vendor);
	public void deleteVendor(long regId);
	public Vendor getVendor(long regId);
	public List<Vendor> getAllVendors();

}

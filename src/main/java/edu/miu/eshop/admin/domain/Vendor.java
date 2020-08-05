package edu.miu.eshop.admin.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Vendor {

	private long vendornumber;
	private String vendorname;
	@Id
	private long regId;
	private boolean status;
	private List<Product> product;
	
	public Vendor(long vendornumber, String vendorname, long regId) {
		this.vendornumber = vendornumber;
		this.vendorname = vendorname;
		this.regId = regId;
		this.status = false;
		product = new ArrayList<>();
	}

	public long getVendornumber() {
		return vendornumber;
	}

	public void setVendornumber(long vendornumber) {
		this.vendornumber = vendornumber;
	}

	public String getVendorname() {
		return vendorname;
	}

	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}

	public long getRegId() {
		return regId;
	}

	public void setRegId(long regId) {
		this.regId = regId;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	
	
}

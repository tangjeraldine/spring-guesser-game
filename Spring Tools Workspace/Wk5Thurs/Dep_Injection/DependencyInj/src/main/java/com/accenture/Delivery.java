package com.accenture;

public class Delivery {
	private String address;

	//constructor based injection
	public Delivery(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Delivery [address=" + address + "]";
	}
	
	
}

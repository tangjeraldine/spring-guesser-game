package com.accenture;

import org.springframework.stereotype.Component;

@Component
public class Courier {
	private Delivery address;
	private String companyName;
	private float cost;
	private Deliveryman deliveryman;
	
	public Courier(Deliveryman deliveryman) {
		this.deliveryman = deliveryman;
	}
	
	public void greetings() {
		System.out.println("Good day, here is your parcel, please sign here.");
		deliveryman.info();
	}
	
	
	public Delivery getAddress() {
		return address;
	}
	public void setAddress(Delivery address) {
		this.address = address;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Courier [address=" + address + ", companyName=" + companyName + ", cost=" + cost + "]";
	}
	
	public void courierInfo() {
		System.out.println("Courier Company: "+companyName);
//		System.out.println("Delivery Address: "+address.getAddress());
		System.out.println("Cost of delivery: "+cost);
	}
}

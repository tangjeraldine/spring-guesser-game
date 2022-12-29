package com.accenture;

public class Customer {
	private String name;
	private int phone_no;
	private boolean premium;
	
	public void dispCustomerInfo() {
		System.out.println("Customer's Name: "+name);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public boolean getPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	//setters injection
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone_no=" + phone_no + ", premium=" + premium + "]";
	}
	
}

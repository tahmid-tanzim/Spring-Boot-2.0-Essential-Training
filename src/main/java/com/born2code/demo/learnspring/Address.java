package com.born2code.demo.learnspring;

public class Address {
	public String street;
	public String postcode;

	public Address(){
		
	}
	
	public Address(String street, String postcode) {
		this.street = street;
		this.postcode = postcode;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getPostcode() {
		return postcode;
	}
	
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	public void init() {
		System.out.println("Address created - " + this);
	}	
	
	public void destroy() {
		System.out.println("Address destroy");
	}			
}

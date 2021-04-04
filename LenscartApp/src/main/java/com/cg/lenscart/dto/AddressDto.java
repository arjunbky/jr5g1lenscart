package com.cg.lenscart.dto;
public class AddressDto {
	private String House_number;
	private String Street_name;
	private String City;
	private String State;
	private int Pincode;
	public String getHouse_number() {
		return House_number;
	}
	public void setHouse_number(String house_number) {
		House_number = house_number;
	}
	public String getStreet_name() {
		return Street_name;
	}
	public void setStreet_name(String street_name) {
		Street_name = street_name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}

}

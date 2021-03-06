package com.cg.lenscart.dto;

public class LensesDto {
	private int lens_id;
	private float lens_power;
	private String lens_brand;
	public int getLens_id() {
		return lens_id;
	}
	public void setLens_id(int lens_id) {
		this.lens_id = lens_id;
	}
	public float getLens_power() {
		return lens_power;
	}
	public LensesDto(int lens_id, float lens_power, String lens_brand, String lens_type, double lens_price) {
		super();
		this.lens_id = lens_id;
		this.lens_power = lens_power;
		this.lens_brand = lens_brand;
		this.lens_type = lens_type;
		this.lens_price = lens_price;
	}
	public void setLens_power(float lens_power) {
		this.lens_power = lens_power;
	}
	public String getLens_brand() {
		return lens_brand;
	}
	public void setLens_brand(String lens_brand) {
		this.lens_brand = lens_brand;
	}
	public String getLens_type() {
		return lens_type;
	}
	public void setLens_type(String lens_type) {
		this.lens_type = lens_type;
	}
	public double getLens_price() {
		return lens_price;
	}
	public void setLens_price(double lens_price) {
		this.lens_price = lens_price;
	}
	private String lens_type;
	private double lens_price;

}

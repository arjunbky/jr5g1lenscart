package com.cg.lenscart.dto;

import java.util.Date;

public class OrdersDto {
private int order_id;
	private double total_cost;
	private Date date_of_order;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	public Date getDate_of_order() {
		return date_of_order;
	}
	public void setDate_of_order(Date date_of_order) {
		this.date_of_order = date_of_order;
	}
	public Date getExpected_date_of_arrival() {
		return expected_date_of_arrival;
	}
	public void setExpected_date_of_arrival(Date expected_date_of_arrival) {
		this.expected_date_of_arrival = expected_date_of_arrival;
	}
	public boolean isPayment_status() {
		return payment_status;
	}
	public void setPayment_status(boolean payment_status) {
		this.payment_status = payment_status;
	}
	private Date expected_date_of_arrival;
	private boolean payment_status;

}

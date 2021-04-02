package com.cg.lenscart.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	
	@Column(name="item_type")
	private String item_type;
	
	@Column(name="item_id")
	private int item_id;
	
	@Column(name="description",length=100)
	private String description;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="total_cost")
	private double total_cost;
	@Column(name="date_of_order")
	private Date date_of_order;
	
	@Column(name="expected_date_of_arrival")
	private Date expected_date_of_arrival;
	
	@Column(name="payment_status")
	private boolean payment_status;
	
	public Order() {
		
	}

	public Order(int order_id, String item_type, int item_id, String description,int quantity, double total_cost,
			Date date_of_order, Date expected_date_of_arrival, boolean payment_status) {
		super();
		this.order_id = order_id;
		this.item_type = item_type;
		this.item_id = item_id;
		this.description=description;
		this.quantity = quantity;
		this.total_cost = total_cost;
		this.date_of_order = date_of_order;
		this.expected_date_of_arrival = expected_date_of_arrival;
		this.payment_status = payment_status;
	}

	
	

}
package com.cg.lenscart.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	

	
	@Column(name="total_cost")
	private double total_cost;
	@Column(name="date_of_order")
	private Date date_of_order;
	
	@Column(name="expected_date_of_arrival")
	private Date expected_date_of_arrival;
	
	@Column(name="payment_status")
	private boolean payment_status;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public Order() {
		
	}

	public Order(int order_id, double total_cost,Date date_of_order, Date expected_date_of_arrival, boolean payment_status,Cart cart,Customer customer) {
		super();
		this.order_id = order_id;
		this.total_cost = total_cost;
		this.date_of_order = date_of_order;
		this.expected_date_of_arrival = expected_date_of_arrival;
		this.payment_status = payment_status;
		this.cart=cart;
		this.customer=customer;
	}

	
	

}
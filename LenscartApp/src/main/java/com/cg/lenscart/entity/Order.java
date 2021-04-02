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
	private long order_id;
	@Column(name="date_of_order")
	private Date date_of_order;
	
	@Column(name="expected_date_of_arrival")
	private Date expected_date_of_arrival;
	
	public Order() {
		
	}

	public Order(long order_id, Date date_of_order, Date expected_date_of_arrival) {
		super();
		this.order_id = order_id;
		this.date_of_order = date_of_order;
		this.expected_date_of_arrival = expected_date_of_arrival;
	}
	

}
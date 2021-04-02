package com.cg.lenscart.entity;
import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Cart")
public class Cart  implements Serializable    { 

	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int product_id;
@Column
private int number_of_products;
@Column
private float price;
@Column
private float total;
public Cart () {
		
	}
public Cart(int product_id, int number_of_products, float price, float total)  {
 super();
this.product_id = product_id;
this.number_of_products = number_of_products;
this.price = price;
this.total = total;
this.product_id = product_id;
}
}
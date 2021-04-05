package com.cg.lenscart.dto;

import com.cg.lenscart.entity.Cart;
import com.cg.lenscart.entity.Frames;
import com.cg.lenscart.entity.Lenses;

public class CartDto {
	private int cart_id;
	private int quantity;
	private Frames frame;
	private Lenses lenses;
	public CartDto(Cart cart) {
		this.setCart_id(cart.getCart_id());
		this.setQuantity(cart.getQuantity());
	}
	@Override
	public String toString() {
		return "CartDto [cart_id=" + cart_id + ", quantity=" + quantity + ", price=" + price + "]";
	}
	private double price;
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

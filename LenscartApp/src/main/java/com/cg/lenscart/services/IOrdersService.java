package com.cg.lenscart.services;

import java.util.List;

import com.cg.lenscart.entity.Orders;

public interface IOrdersService {
	public void addOrders(Orders orders);
	public List<Orders> getAllOrders();
	public Orders getOrdersByCartId(int cart_id);
//	public List<Orders> getCustomerDetails(int customer_id);

}

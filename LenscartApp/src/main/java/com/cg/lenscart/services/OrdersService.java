package com.cg.lenscart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.ICartDao;
import com.cg.lenscart.dao.ICustomerDao;
import com.cg.lenscart.dao.IOrdersDao;
import com.cg.lenscart.entity.Orders;

@Service
public class OrdersService implements IOrdersService {
	@Autowired
	IOrdersDao ordersDao;
	
	@Autowired
	ICartDao cartDao;
	
	@Autowired
	ICustomerDao customerDao;
  
	
	public void addOrders(Orders orders) {
		ordersDao.save(orders);
		
	}
	public List<Orders> getAllOrders(){
		List<Orders> orderslist=ordersDao.findAll();
		return orderslist;
	}
	public Orders getOrdersByCartId(int cart_id) {
		return ordersDao.getOrdersByCartId(cart_id);
		
	}
//	public List<Orders> getCustomerDetails(int customer_id) {
//		List<Orders> orderList=ordersDao.findAll();
//		return orderList;
//	}
	
	
}

package com.cg.lenscart.services;


import java.util.List;

import com.cg.lenscart.entity.Customer;

public interface ICustomerService {
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public String deleteCustomer(int customer_id);
	public String modifyCustomer(int customer_id, Customer cust);
}
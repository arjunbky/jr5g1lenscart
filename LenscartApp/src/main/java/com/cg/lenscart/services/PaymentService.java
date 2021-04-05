package com.cg.lenscart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.IOrdersDao;
import com.cg.lenscart.dao.IPaymentDao;
import com.cg.lenscart.entity.Customer;
import com.cg.lenscart.entity.Payment;

@Service
public class PaymentService implements IPaymentService {
	@Autowired
	IPaymentDao paymentDao;
	@Autowired
	IOrdersDao ordersDao;
	public void addPayment(Payment payment) {
		paymentDao.save(payment);  
	



package com.cg.lenscart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.IPaymentDao;

@Service
public class PaymentService implements IPaymentService {
	@Autowired
	IPaymentDao ipaymentDao;
	

}

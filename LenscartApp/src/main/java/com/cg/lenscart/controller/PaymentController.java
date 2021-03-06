package com.cg.lenscart.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscart.entity.Customer;
import com.cg.lenscart.services.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentService service;
	
	@PostMapping("/insertpayment")
	public ResponseEntity<String> addPayment(@RequestBody Customer customer){
		service.addPayment(customer);
		return new ResponseEntity<String>("Customer Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Customer>> getAllPayment(){
		List<Customer> customerList=service.getAllPayment();
		return new ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletedept")
	public ResponseEntity<String> deleteCustomer(@RequestBody int customer_id){
		String str=service.deleteCustomer(customer_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updatedept/{code}")
	public ResponseEntity<String> modifyCustomer(@PathVariable int customer_id,@RequestBody Customer cust){
		String str=service.modifyCustomer(customer_id, cust);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}

}

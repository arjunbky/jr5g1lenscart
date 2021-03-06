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

import com.cg.lenscart.entity.Orders;
import com.cg.lenscart.services.OrdersService;

@RestController
@RequestMapping("/order")
public class OrdersController {
	@Autowired
	OrdersService service;
	@PostMapping("/insertorder")
	public ResponseEntity<String> addOrders(@RequestBody Orders orders){
		service.addOrders(orders);
		return new ResponseEntity<String>("Order Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Orders>> getAllOrders(){
		List<Orders> ordersList=service.getAllOrders();
		return new ResponseEntity<List<Orders>>(ordersList,HttpStatus.OK);
	}
	@DeleteMapping("/deleteorder")
	public ResponseEntity<String> deleteOrders(@RequestBody int order_id){
		String str=service.deleteOrder(order_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updateorder/{code}")
	public ResponseEntity<String> modifyOrder(@PathVariable int order_id,@RequestBody Orders order){
		String str=service.modifyOrder(order_id, order);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}


}

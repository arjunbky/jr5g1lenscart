package com.cg.lenscart.controller;
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService service;
	@PostMapping("/insertorder")
	public ResponseEntity<String> addOrder(@RequestBody Order order){
		service.addOrder(order);
		return new ResponseEntity<String>("Order Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Order>> getAllOrder(){
		List<Order> orderList=service.getAllOrder();
		return new ResponseEntity<List<Order>>(orderList,HttpStatus.OK);
	}
	@DeleteMapping("/deleteorder")
	public ResponseEntity<String> deleteOrder(@RequestBody int order_id){
		String str=service.deleteOrder(order_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updateorder/{code}")
	public ResponseEntity<String> modifyOrder(@PathVariable int order_id,@RequestBody Order order){
		String str=service.modifyOrder(order_id, order);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}


}

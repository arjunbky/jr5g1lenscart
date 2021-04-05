package com.cg.lenscart.controller;
@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentService service;
	
	@PostMapping("/insertpayment")
	public ResponseEntity<String> addPayment(@RequestBody Payment payment){
		service.addPayment(payment);
		return new ResponseEntity<String>("Payment Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Payment>> getAllPayment(){
		List<Payment> paymentList=service.getAllPayment();
		return new ResponseEntity<List<Payment>>(paymentList,HttpStatus.OK);
	}
	@DeleteMapping("/deletepayment")
	public ResponseEntity<String> deletePayment(@RequestBody int payment_id){
		String str=service.deletePayment(payment_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updatepayment/{code}")
	public ResponseEntity<String> modifyPayment(@PathVariable int payment_id,@RequestBody Payment payment){
		String str=service.modifyPayment(payment_id, payment);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}

}

package com.cg.lenscart.controller;
@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService service;
	@PostMapping("/insertcart")
	public ResponseEntity<String> addCart(@RequestBody Cart cart){
		service.addCart(cart);
		return new ResponseEntity<String>("Cart Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Cart>> getAllCart(){
		List<Cart> cartList=service.getAllCart();
		return new ResponseEntity<List<Cart>>(cartList,HttpStatus.OK);
	}
	@DeleteMapping("/deletecart")
	public ResponseEntity<String> deleteCart(@RequestBody int cart_id){
		String str=service.deleteCart(cart_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updatecart/{code}")
	public ResponseEntity<String> modifyCart(@PathVariable int cart_id,@RequestBody Cart cart){
		String str=service.modifyCart(cart_id, cart);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}


}

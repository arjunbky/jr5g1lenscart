package com.cg.lenscart.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.ICartDao;
import com.cg.lenscart.entity.Cart;
import com.cg.lenscart.entity.Frames;
import com.cg.lenscart.entity.Lenses;



@Service
public class CartService implements ICartService {
	@Autowired
	ICartDao cartDao;
	public String deleteCart(int cart_id) {
		if(cartDao.existsById(cart_id)) {
			cartDao.deleteById(cart_id);
			return "cart deleted";
		}
		return "cart not found";
	}
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		cartDao.save(cart);
	}
	
	public List<Cart> getAllCart()
}
	


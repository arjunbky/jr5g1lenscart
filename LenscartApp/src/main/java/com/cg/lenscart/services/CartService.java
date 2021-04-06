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
<<<<<<< HEAD
	ICartDao cartDao;
=======
	ICartDao dao;
	@Autowired
	IFramesDao framesdao;
	@Autowired 
	ILensesDao lensesdao;
	@Override
	public void addFrames(Frames frames) {
		
		
	}
	@Override
	public List<Frames> getAllFrames() {
		return framesdao.findAll();
	}
	@Override
	public void addLenses(Lenses lenses) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Lenses> getAllLenses() {
		// TODO Auto-generated method stub
		return lensesdao.findAll();
	}
	@Override
	public String deleteFrames(Frames frames) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteLenses(Lenses lenses) {
		return null;
	}
>>>>>>> branch 'master' of https://github.com/arjunbky123/jr5g1lenscart.git
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
	


package com.cg.lenscart.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.ICartDao;
import com.cg.lenscart.dao.IFramesDao;
import com.cg.lenscart.dao.ILensesDao;
import com.cg.lenscart.entity.Cart;
import com.cg.lenscart.entity.Frames;
import com.cg.lenscart.entity.Lenses;

@Service
public class CartService implements ICartService {
	@Autowired
	ICartDao dao;
	@Autowired
	IFramesDao framesdao;
	@Autowired 
	ILensesDao lensesdao;
	@Override
	public void addFrames(Frames frames) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Frames> getAllFrames() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addLenses(Lenses lenses) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Lenses> getAllLenses() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteFrames(Frames frames) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String deleteLenses(Lenses lenses) {
		// TODO Auto-generated method stub
		return null;
	}
	public String deleteCart(int cart_id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}
	public List<Cart> getAllCart() {
		// TODO Auto-generated method stub
		return null;
	}
	public String modifyCart(int cart_id, Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}
	}
	
	
	


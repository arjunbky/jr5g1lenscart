package com.cg.lenscart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscart.entity.Cart;

public interface ICartDao extends JpaRepository<Cart, Integer>{

}

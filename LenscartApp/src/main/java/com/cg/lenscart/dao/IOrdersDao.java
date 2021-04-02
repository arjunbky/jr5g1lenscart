package com.cg.lenscart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscart.entity.Orders;

public interface IOrdersDao extends JpaRepository<Orders, Integer>{

}

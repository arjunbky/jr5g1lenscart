package com.cg.lenscart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscart.entity.Payment;

public interface IPaymentDao extends JpaRepository<Payment, Integer>{

}

package com.cg.lenscart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscart.entity.Customer;

public interface ICustomerDao extends JpaRepository<Customer, Integer> {

}

package com.cg.lenscart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscart.entity.Address;

public interface IAddressDao extends JpaRepository<Address, Integer>{

}

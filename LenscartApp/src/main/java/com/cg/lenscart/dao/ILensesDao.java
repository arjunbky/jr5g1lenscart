package com.cg.lenscart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscart.entity.Lenses;

public interface ILensesDao extends JpaRepository<Lenses, Integer> {

}

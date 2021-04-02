package com.cg.lenscart.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.lenscart.entity.Frames;
@Repository
public interface IFramesDao extends JpaRepository<Frames, Integer> {

}

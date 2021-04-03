package com.cg.lenscart.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.ICartDao;
import com.cg.lenscart.dao.IFramesDao;
import com.cg.lenscart.dao.ILensesDao;
import com.cg.lenscart.entity.Frames;
import com.cg.lenscart.entity.Lenses;

@Service
public class CartService {
	@Autowired
	ICartDao dao;
	@Autowired
	IFramesDao fdao;
	@Autowired 
	ILensesDao ldao;
	
	public void addFrames(Frames frames) {
		dao.save(frames);
	}
	public List<Frames> getAllFrames(){
		List<Frames> frameList=dao.findAll();
		return frameList;
	}
	public void addLenses(Lenses lenses) {
		dao.save(lenses);
	}
	public List<Lenses> getAllLenses(){
		List<Lenses> lenseList=dao.findAll();
		return lenseList;
	}
	public void deleteFrames(Frames frames) {
		if(dao.existsById(frame_id)) {
			dao.deleteById(frame_id);
			return "Frames Deleted";
		}
		return "Frames not found";
	}
	public void deleteLenses(Lenses lenses) {
		if(dao.existsById(lense_id)) {
			dao.deleteById(lense_id);
			return "Lenses Deleted";
		}
		return "Lenses not found";
	}
	public String modifyFrames(int frame_id, Frames frames) {
		if(dao.existsById(frame_id)) {
			Frames frames=dao.findById(frame_id).get();
			frames.setFirst_name(frames.getFrame_shape());
			frames.setLast_name(frames.getFrame_colour());
			frames.setPhone_number(frames.getFrame_brand());
			frames.setEmail_id(frames.getFrame_price());
			fDao.save(frames.getFrame());
			dao.save(frames);
			return "Frames Updated";
		}
		return "Frames not found";
	}
	public String modifyLenses(int lens_id, Lenses lenses) {
		if(dao.existsById(Lens_id)) {
			Lenses lenses=dao.findById(lens_id).get();
			lenses.setFirst_name(lenses.getLens_power());
			lenses.setLast_name(lenses.getLens_brand());
			lenses.setPhone_number(lenses.getLens_type());
			lenses.setEmail_id(lenses.getLense_price());
			lDao.save(lenses.getLenses());
			dao.save(lenses);
			return "Lenses Updated";
		}
		return "Lenses not found";
	}
}

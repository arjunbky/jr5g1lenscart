package com.cg.lenscart.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.IFramesDao;
import com.cg.lenscart.entity.Frames;

@Service
public class FramesService {
	@Autowired
	IFramesDao dao;
	public void addFrames(Frames frames) {
		dao.save(frames);
	}
	public List<Frames> getAllFrames(){
		List<Frames> framesList=dao.findAll();
		return framesList;
	}
	
	public String deleteFrames(int frame_id) {
		if(dao.existsById(frame_id)) {
			dao.deleteById(frame_id);
			return "Frame deleted";
		}
		return "Frame not found";
	}
	public String modifyFrames(int frame_id,Frames frames) {
		if(dao.existsById(frame_id)) {
			Frames frame=dao.findById(frame_id).get();
			frame.setFrame_shape(frames.getFrame_shape());
			frame.setFrame_colour(frames.getFrame_colour());
			frame.setFrame_brand(frames.getFrame_brand());
			dao.save(frames);
			return "Frame updated";
		}
		return "Frame not found";
	}

}

package com.cg.lenscart.services;

import java.util.List;

import com.cg.lenscart.dto.FramesDto;
import com.cg.lenscart.entity.Frames;

public interface IFramesService {
	public void addFrames(FramesDto frames);
	public List<Frames> getAllFrames();
	public String deleteFrames(int frame_id);
	public String modifyFrames(int frame_id,Frames frames);
	}

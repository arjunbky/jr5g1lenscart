package com.cg.lenscart.services;

import java.util.List;

import com.cg.lenscart.entity.Frames;
import com.cg.lenscart.entity.Lenses;

public interface ICartService {
	public void addFrames(Frames frames);
	public List<Frames> getAllFrames();
	public void addLenses(Lenses lenses);
	public List<Lenses> getAllLenses();
	public String deleteFrames(Frames frames);
	public String deleteLenses(Lenses lenses);
}

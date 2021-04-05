package com.cg.lenscart.services;

import java.util.List;

import com.cg.lenscart.dto.LensesDto;
import com.cg.lenscart.entity.Lenses;
//lens service
public interface ILensesService {
	public void addLenses(LensesDto lenses);
	public List<Lenses> getAllLenses();
	public String deleteLenses(int lens_id);
	public String modifyLenses(int lens_id,Lenses lens);

}

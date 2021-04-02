package com.cg.lenscart.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Frames")
public class Frames  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int frame_id;
	
	@Column(name="frame_shape",length=50,nullable=false)
	private String frame_shape;
	
	@Column(name="frame_colour",length=50)
	private String frame_colour;
	
	@Column(name="frame_brand",length=50)
	private String frame_brand;
	
	@Column(name="frame_price")
	private double frame_price;
	
	public Frames() {
		// TODO Auto-generated constructor stub
	}

	public Frames(int frame_id, String frame_shape, String frame_colour, String frame_brand, double frame_price) {
		this.frame_id = frame_id;
		this.frame_shape = frame_shape;
		this.frame_colour = frame_colour;
		this.frame_brand = frame_brand;
		this.frame_price = frame_price;
	}
	

}

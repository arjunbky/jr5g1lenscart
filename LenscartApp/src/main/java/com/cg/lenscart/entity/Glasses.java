package com.cg.lenscart.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Glasses")
public class Glasses implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int glass_id;
	
	@Column(name="glass_brand_name",length=50,nullable=false)
	private String glass_brand_name;
	
	@Column(name="glass_power")
	private float glass_power;
	
	@Column(name="glass_type",length=50,nullable=false)
	private String glass_type;
	
	@Column(name="glass_rate")
	private double glass_rate;

	public Glasses(){
	}
	
	public Glasses(int glass_id,String glass_brand_name, float glass_power,String glass_type, double glass_rate)
	{
		this.glass_id = glass_id;
		this. glass_brand_name= glass_brand_name;
		this. glass_power = glass_power ;
		this.glass_type = glass_type;
		this.glass_rate = glass_rate;
	}
}

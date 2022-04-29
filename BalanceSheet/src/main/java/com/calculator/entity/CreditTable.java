package com.calculator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="CREDIT")
public class CreditTable {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="C_ID")
	private int c_Id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="PRICE")
	private int price;
	

	public CreditTable(String description, int price) {
		super();
		this.description = description;
		this.price = price;
	
	}
	
	
}

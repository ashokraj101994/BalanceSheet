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
@Table(name="Expense")
public class ExpenseTable {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="E_ID")
	private int e_Id;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="PRICE")
	private int price;
    

	public ExpenseTable(String description, int price) {
		super();
		this.description = description;
		this.price = price;
	}
	
	 
}

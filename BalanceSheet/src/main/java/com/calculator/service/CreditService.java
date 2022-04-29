package com.calculator.service;

import java.util.List;

import com.calculator.entity.CreditTable;


public interface CreditService  {
	public CreditTable insert(int id,String description,int price);
	
	public CreditTable findById(int id);
	
	public List<CreditTable> clist();
	
	public void delete(CreditTable crdTb);
	
	public void save(CreditTable crdTb);
	
	
	

}

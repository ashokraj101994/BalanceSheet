package com.calculator.service;

import java.util.List;


import com.calculator.entity.ExpenseTable;

public interface ExpenseService {

	public ExpenseTable insert(int id,String description,int price);
	
	public ExpenseTable findById(int id);
	
	public List<ExpenseTable> clist();
	
	public void delete(ExpenseTable crdTb);
	
	public void save(ExpenseTable crdTb);
}

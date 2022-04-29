package com.calculator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.entity.CreditTable;
import com.calculator.entity.ExpenseTable;
import com.calculator.repository.ExpenseRepository;

@Service
public class ExpenseServiceImp implements ExpenseService {
    
	@Autowired
	ExpenseRepository expenseRepo;
	
	@Override
	public ExpenseTable insert(int id,String description,int price) {
		ExpenseTable expenseTable = new ExpenseTable();
		 if(id!=0) {
			 expenseTable=expenseRepo.getById(id);
			 expenseTable.setDescription(description);
			 expenseTable.setPrice(price);
			  }
			  else {
				  expenseTable.setDescription(description);
				  expenseTable.setPrice(price);
				 
			  }
		 return expenseTable;
		
	}

	@Override
	public ExpenseTable findById(int id) {
		ExpenseTable ExpenseTab=expenseRepo.getById(id);
		return ExpenseTab;
	}

	@Override
	public List<ExpenseTable> clist() {
		List<ExpenseTable> elist = expenseRepo.findAll();
		return elist;
	}

	@Override
	public void delete(ExpenseTable crdTb) {
		expenseRepo.delete(crdTb);
	}

	@Override
	public void save(ExpenseTable crdTb) {
		expenseRepo.save(crdTb);
		
	}

}

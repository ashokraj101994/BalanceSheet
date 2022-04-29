package com.calculator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.entity.CreditTable;
import com.calculator.repository.CreditRepository;

@Service
public class CreditServiceImp implements CreditService {
    
	@Autowired
    CreditRepository credRepo;
	

	
	@Override
	public CreditTable insert(int id,String description,int price) {
		CreditTable creditTable = new CreditTable();
		 if(id!=0) {
			  creditTable=credRepo.getById(id);
			  creditTable.setDescription(description);
			  creditTable.setPrice(price);
			  }
			  else {
				  creditTable.setDescription(description);
				  creditTable.setPrice(price);
				 
			  }
		 return creditTable;
		
	}

	@Override
	public CreditTable findById(int id) {
		CreditTable credTab=credRepo.getById(id);
		return credTab;
	}

	@Override
	public List<CreditTable> clist() {
		List<CreditTable> clist = credRepo.findAll();
		return clist;
	}

	@Override
	public void delete(CreditTable crdTb) {
		credRepo.delete(crdTb);
	}

	@Override
	public void save(CreditTable crdTb) {
		credRepo.save(crdTb);
		
	}

	
   
}

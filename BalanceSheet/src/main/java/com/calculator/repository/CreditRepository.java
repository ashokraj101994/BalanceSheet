package com.calculator.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.calculator.entity.CreditTable;

@Repository
public interface CreditRepository extends CrudRepository<CreditTable, Integer>,JpaRepository<CreditTable,Integer> {
	
}

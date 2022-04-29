package com.calculator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.calculator.entity.ExpenseTable;

public interface ExpenseRepository extends CrudRepository<ExpenseTable, Integer>, JpaRepository<ExpenseTable,Integer> {

}

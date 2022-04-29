package com.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.calculator.entity.CreditTable;
import com.calculator.entity.ExpenseTable;
import com.calculator.service.ExpenseServiceImp;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

	@Autowired
	ExpenseServiceImp expenseServ;

	@RequestMapping("/home")
	public String homePage() {

		return "HomePage";
	}

	@RequestMapping("/eTable")
	public String list(Model model) {
		List<ExpenseTable> elist = expenseServ.clist();
		model.addAttribute("ExpenseTable", elist);
		return "ExpenseTable";
	}

	@GetMapping("/add")
	public String add(Model theModel) {
		ExpenseTable expenseTable = new ExpenseTable();
		theModel.addAttribute("ExpenseTable", expenseTable);
		return "ExpenseModifier";
	}

	@RequestMapping("/save")
	public String save(@RequestParam("e_Id") int id, @RequestParam("description") String description,
			@RequestParam("price") int price) {
		ExpenseTable expenseTable = expenseServ.insert(id, description, price);

		expenseServ.save(expenseTable);
		return "redirect:/expense/eTable";
	}

	@RequestMapping("/update")
	public String update(@RequestParam("e_Id") int id, Model theModel) {
		ExpenseTable expenseTable = new ExpenseTable();
		expenseTable = expenseServ.findById(id);
		theModel.addAttribute("ExpenseTable", expenseTable);
		return "ExpenseModifier";

	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("e_Id") int id) {
		ExpenseTable expenseTable = new ExpenseTable();
		expenseTable = expenseServ.findById(id);
		expenseServ.delete(expenseTable);

		return "redirect:/expense/eTable";

	}
}

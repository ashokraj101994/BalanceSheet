package com.calculator.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.calculator.entity.CreditTable;
import com.calculator.service.CreditServiceImp;

@Controller
@RequestMapping("/credit")
public class CreditController {
	
	@Autowired
	CreditServiceImp credServ;
 
 @RequestMapping("/home")
  public String homePage() {
	
	  return "HomePage";
  }
 
 @RequestMapping("/cTable")
 public String list(Model model) {
	 List<CreditTable> clist = credServ.clist();
	 model.addAttribute("CreditTable", clist);
	 return "CreditTable";
 }
  @GetMapping("/add")
  public String add(Model theModel) {
	 CreditTable credTable =new CreditTable();
	 theModel.addAttribute("CreditTable",credTable);
	  return "CreditModifier";
  }
  
  @RequestMapping("/save")
  public String save(@RequestParam("c_Id") int id,@RequestParam("description") String  description, @RequestParam("price") int price) {
	  CreditTable creditTable = credServ.insert(id,description,price);
	 
	  credServ.save(creditTable);
	  return "redirect:/credit/cTable";
  }
  
  @RequestMapping("/update")
  public String update(@RequestParam("c_Id") int id,Model theModel) {
	  CreditTable credTable =new CreditTable();
	     credTable=credServ.findById(id);
		 theModel.addAttribute("CreditTable",credTable);
		  return "CreditModifier";
	  
  }
  
  @RequestMapping("/delete")
  public String delete(@RequestParam("c_Id") int id) {
	  CreditTable crdTb = new CreditTable();
	  crdTb=credServ.findById(id);
	  credServ.delete(crdTb);
	  
	  return "redirect:/credit/cTable";
	  
	  
  }
}

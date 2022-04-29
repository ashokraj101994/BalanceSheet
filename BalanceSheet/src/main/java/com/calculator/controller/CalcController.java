package com.calculator.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.calculator.calculations.Calculations;

@Controller
@RequestMapping("/Calc")
public class CalcController {

	@Autowired
	Calculations calc;

	@RequestMapping("/sum")
	public ModelAndView calc() throws ParseException {
		Calculations calc = new Calculations();
		int creditSum = calc.creditSum();
		String status = "";
		int expenseSum = calc.expenseSum();
		double percentage = calc.percentageprovider();
		ModelAndView mdv = new ModelAndView("Calculations");
		if (creditSum > expenseSum) {
			status = "Profit";
		}

		else if (creditSum == expenseSum) {
			status = "Neither profit nor loss";
		}

		else {
			status = "loss";
		}

		mdv.addObject("creditSum", creditSum);
		mdv.addObject("expenseSum", expenseSum);
		mdv.addObject("status", status);
		mdv.addObject("percentage", percentage);

		return mdv;
	}

}

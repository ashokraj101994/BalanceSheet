package com.calculator.calculations;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.calculator.repository.CreditRepository;

@Service
public class Calculations {
	
	
	@Autowired
	CreditRepository cRepo;

	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/CALCULATOR", "ashokraj101994",
				"Ashsar@143");
		return conn;
	}

	public Statement stmt() throws SQLException {
		Statement stmt = getConnection().createStatement();
		return stmt;
	}

	public int creditSum() {
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		try {

			ResultSet rst = stmt().executeQuery("select price from credit");
			while (rst.next()) {
				arr.add(rst.getInt("price"));
			}

			for (int i = 0; i < arr.size(); i++) {
				int n = arr.get(i);
				sum = sum + n;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sum;
	}

	public int expenseSum() {
		int sum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		try {

			ResultSet rst = stmt().executeQuery("select price from expense");
			while (rst.next()) {
				arr.add(rst.getInt("price"));
			}

			for (int i = 0; i < arr.size(); i++) {
				int n = arr.get(i);
				sum = sum + n;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sum;
	}

	public double percentageprovider() throws ParseException {
		double creditTotal = creditSum();
		double ExpenseTotal =expenseSum();
		double percentage;
		if (creditTotal > ExpenseTotal) {

			double difference = creditTotal - ExpenseTotal;
			double sum = creditTotal + ExpenseTotal;

			percentage = (difference / sum) * 100;
		}


		else {
			double difference = ExpenseTotal - creditTotal;
			double sum = creditTotal + ExpenseTotal;

			percentage =(difference / sum) * 100;
		}
		
		BigDecimal bd = new BigDecimal(percentage).setScale(2, RoundingMode.HALF_UP);
		double percent=bd.doubleValue();
		
		return percent;
	}
}

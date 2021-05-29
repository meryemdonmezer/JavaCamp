package com.day4;
import com.day4.homework2.CustomerCheckManager;
import com.day4.homework2.CustomerManagerBase;
import com.day4.homework2.SturbucksCustomerManager;
import com.day4.homework2.NeroCustomerManager;
import com.day4.homework2.entities.Customer;
import com.day4.homework2.services.CustomerCheckService;
import com.day4.homework2.services.CustomerService;
public class Program {

	public static void main(String[] args) {
		
		// homework2

		Customer mery = new Customer(1, "mery", "dönmezer","12345", 1995);
		CustomerCheckService checkService = new CustomerCheckManager();
		SturbucksCustomerManager sturbucksCustomerManager = new SturbucksCustomerManager(checkService);
		sturbucksCustomerManager.Save(mery);
		
		Customer gizem = new Customer(2, "gizem", "döner", "54321", 1993);
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.Save(gizem);
		//homerk3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

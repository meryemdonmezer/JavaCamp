package com.day4.homework2;

import com.day4.homework2.entities.Customer;
import com.day4.homework2.services.CustomerCheckService;
import com.day4.homework2.services.CustomerService;

public class SturbucksCustomerManager extends CustomerManagerBase{

	private CustomerCheckService customerCheckService;
	
	public SturbucksCustomerManager(CustomerCheckService customerCheckService){
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer))
			super.Save(customer);
	}
}

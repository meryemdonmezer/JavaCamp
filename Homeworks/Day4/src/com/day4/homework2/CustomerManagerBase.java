package com.day4.homework2;

import com.day4.homework2.entities.Customer;
import com.day4.homework2.services.CustomerService;

public abstract class CustomerManagerBase implements CustomerService{
	
	@Override
	public void Save(Customer customer) {
		System.out.println("id: "+customer.getId() + "first name: "+customer.getFirstName()+"last name: "+customer.getLastName()+"citizen no: " + customer.getCitizenNo());	
	}
}

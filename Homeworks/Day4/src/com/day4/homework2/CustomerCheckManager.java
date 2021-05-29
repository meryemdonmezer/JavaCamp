package com.day4.homework2;

import com.day4.homework2.entities.Customer;
import com.day4.homework2.services.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
	
}

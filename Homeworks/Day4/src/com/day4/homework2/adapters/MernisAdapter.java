package com.day4.homework2.adapters;

import com.day4.homework2.entities.Customer;
import com.day4.homework2.services.CustomerCheckService;

public class MernisAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// // mernis kodları
		return false;
	}

}

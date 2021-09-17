package concrete;

import abstracts.CustomerCheckService;

import entitites.Customer;

public class CustomerCheckManager implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		
		
	}

}

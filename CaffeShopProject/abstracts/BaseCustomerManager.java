package abstracts;

import java.rmi.RemoteException;

import entitites.Customer;

public class BaseCustomerManager implements CustomerService{
	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Saved to Db" + customer.getFirstName());
		
	}
	

}

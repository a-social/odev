package concrete;

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entitites.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheck;
	public StarbucksCustomerManager(CustomerCheckService customerCheck) {
		this.customerCheck = customerCheck;
	}
	@Override 
	public void save(Customer customer) throws NumberFormatException, RemoteException 
	{
		if (customerCheck.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("hatalý giris");
		}
		
	}
	
	
	
}
	




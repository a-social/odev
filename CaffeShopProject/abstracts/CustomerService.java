package abstracts;

import java.rmi.RemoteException;

import entitites.Customer;

public interface CustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;

}

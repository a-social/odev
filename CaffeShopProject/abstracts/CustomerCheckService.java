package abstracts;

import java.rmi.RemoteException;

import entitites.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}

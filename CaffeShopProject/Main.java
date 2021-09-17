package caffeShopProject;

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;

import concrete.StarbucksCustomerManager;
import entitites.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer());
		

	}

}

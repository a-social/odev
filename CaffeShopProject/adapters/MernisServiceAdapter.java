package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entitites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy checkCustomer = new KPSPublicSoapProxy();
		return checkCustomer.TCKimlikNoDogrula(Long.parseLong(customer.getNationalID()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		
	}

}

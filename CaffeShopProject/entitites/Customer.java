package entitites;

import abstracts.Entities;

public class Customer implements Entities {
	int id;
	String firstName;
	String lastName;
	int dateOfBirth;
	String NationalID;
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalID) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalID = nationalID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalID() {
		return NationalID;
	}
	public void setNationalID(String nationalID) {
		NationalID = nationalID;
	}
	

}

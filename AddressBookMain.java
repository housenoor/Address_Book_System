package com.bl.bridgelabz;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.printf("Welcome to Address Book Program \n");
		ContactDetails newContact = new ContactDetails();
		newContact.setFirstName("Srikanth \n");
		newContact.setLastName("Housenoor \n");
		newContact.setAddressCity("Nizamabad \n");
		newContact.setState("Telangana \n");
		newContact.setZip(502235);
		newContact.setPhoneNumber(756962166);
		newContact.setEmail("srikanthh994@gmail.com .\n");
		System.out.println("The Contact is : \n" + newContact);

	}
}

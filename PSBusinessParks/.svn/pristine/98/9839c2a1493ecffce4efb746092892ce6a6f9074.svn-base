package com.crmindz.psbusinessparks.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.crmindz.psbusinessparks.model.Address;
import com.crmindz.psbusinessparks.model.Contact;
import com.crmindz.psbusinessparks.model.Tenant;
import com.crmindz.psbusinessparks.service.TenantDataService;

/**
 * PSBusinessParkDemo class holds functions to read input tenant data form user
 * and display requested tenant details.
 * 
 * @author Sravan
 * @version %I%,%G%
 */
public class PSBusinessParkDemo {
	private Scanner sc = new Scanner(System.in);
	private TenantDataService tenantService = new TenantDataService();

	/**
	 * invokes methods to read and display tenant data
	 */
	public static void main(String[] args) {
		PSBusinessParkDemo psbParkDemo = new PSBusinessParkDemo();
		psbParkDemo.readTenantData();
		while (true) {
			List<Tenant> matchedTenantList = psbParkDemo.fetchTenantData();
			psbParkDemo.displayTenantData(matchedTenantList);
			System.out.println("Enter \"exit\" to quit the application or \"no\" to continue");
			String choice = psbParkDemo.sc.nextLine();
			if (choice.equalsIgnoreCase("exit")) {
				break;
			}
		}
		psbParkDemo.sc.close();
	}

	/**
	 * reads tenant data from user and saves it
	 */
	public void readTenantData() {
		System.out.println("Enter the number of Tenants you want to save:");
		String numberOfTenants = sc.nextLine();
		for (int i = 1; i <= Integer.parseInt(numberOfTenants); i++) {
			System.out.printf("Enter the name of tenant %d:\n", i);
			String tenantName = sc.nextLine();
			System.out.printf("Enter %s's address:\n", tenantName);
			System.out.println("Address line 1:");
			String addressLine1 = sc.nextLine();
			System.out.println("Address line 2:");
			String addressLine2 = sc.nextLine();
			System.out.println("City:");
			String city = sc.nextLine();
			System.out.println("State:");
			String state = sc.nextLine();
			System.out.println("zip:");
			String zip = sc.nextLine();
			System.out.println();
			// this list is to hold the contacts of current tenant
			List<Contact> contactList = new ArrayList<Contact>();

			for (int j = 1; j <= 2; j++) {
				System.out.printf("Enter %s's contact %d:\n", tenantName ,j);
				System.out.printf("Contact %d name:\n", j);
				String contactName = sc.nextLine();
				System.out.printf("Contact %d phone:\n", j);
				String phone = sc.nextLine();
				System.out.printf("Contact %d email:\n", j);
				String email = sc.nextLine();
				Contact contact = new Contact(contactName, phone, email);
				contactList.add(contact);
			}
			System.out.println();
			
			// address object is created using overloaded constructor
			Address address = new Address(addressLine1, addressLine2, city, state, zip);
			// Tenant object is created using overloaded constructor
			Tenant tenant = new Tenant(tenantName, address, contactList);
			// passing the current tenant object to the save tenant method in
			// service class to save
			// the details
			tenantService.saveTenant(tenant);
		}
	}

	/**
	 * reads query string that is either partial address or name of the tenant
	 * and fetches the matched tenant data.
	 * 
	 * @return List<Tenant> - a list of Tenants that matches the query
	 */
	public List<Tenant> fetchTenantData() {
		System.out.println("Enter the tenant name/address to find the details:");
		String tenantQueryString = sc.nextLine();
		return tenantService.fetchTenantData(tenantQueryString);
	}

	/**
	 * displays tenant data passed to it.
	 * 
	 * @param matchedTenantList
	 *            - list of Tenants passed to display
	 */
	public void displayTenantData(List<Tenant> matchedTenantList) {
		System.out.println("************************************\n");
		if(matchedTenantList.size()>0){
			System.out.println("Matched tenant details are as follows:\n");
			for (Tenant tenant : matchedTenantList) {
				System.out.printf("Tenant name: %s\nStreet address: %s\nSuite: %s\nCity: %s\nState: %s\nZip: %s\n\n",
						tenant.getTenantName().toUpperCase(), tenant.getAddress().getAddressLine1(),
						tenant.getAddress().getAddressLine2(), tenant.getAddress().getCity(),
						tenant.getAddress().getState(), tenant.getAddress().getZip());
				
				ListIterator<Contact> listItr = tenant.getContactList().listIterator();
				while (listItr.hasNext()) {
					Contact contact = listItr.next();
					System.out.printf("Contact name: %s\nPhone: %s\nEmail: %s\n\n", contact.getContactName(),
							contact.getPhone(), contact.getEmail());
				}
				System.out.println("************************************\n");
			}
		}else{
			System.out.println("No matches found. Please try again with valid details\n");
			System.out.println("************************************\n");
		}
	}

}

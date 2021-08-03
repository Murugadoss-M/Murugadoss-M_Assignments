package com.mmdoss.springrestassignment;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AddressService {
	private static List<Address> addresses = Arrays.asList(new Address("TN", "Chennai", "India", "600001"),
			new Address("TN", "Madurai", "India", "600002"), new Address("DL", "Delhi", "India", "600003"),
			new Address("MH", "Mumbai", "India", "600004"), new Address("WB", "Kolkata", "India", "600005"));
	public static Address findByZipcode(String zipcode) {
		Iterator<Address> iterator = addresses.iterator();
		while (iterator.hasNext()) {
			Address address = (Address) iterator.next();
			if(address.getZipcode().equals(zipcode))
				return address;			
		}
		return null;
	}
}

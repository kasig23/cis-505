package com.java8;

/**
 * The CustomerDB class used to get the customer details based on ID
 * @author kasiv
 *
 */
public class CustomerDB {

	private static String id1 = "1007";
	private static String id2 = "1008";
	private static String id3 = "1009";
	
	/**
	 * 
	 * @param id
	 * @return Customer
	 */
	public static Customer getCustomer(String id) {
		if(id.equals(id1)) {
			
			return new Customer("Foo","3902 N 187th Ave","Omaha","68134");
		}else if(id.equals(id2)) {
			
			return new Customer("Victor","3330 N 104th Ave","Omaha","68134");
		}else if(id.equals(id3)) {
			
			return new Customer("Murthy","10919 J Street","Omaha","68134");
		}else {
			return new Customer("Gita","10919 J Street","Omaha","68134");
		}
		
	}
}

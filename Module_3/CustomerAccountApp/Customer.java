package com.java8;

/**
 * The Customer class used to maintain customer basic details 
 * like name,address,city and zipcode
 * 
 * @author kasiv
 *
 */
public class Customer {

	private String name;
	
	private String address;
	
	private String city;
	
	private String zipCode;
	
	public Customer() {
		
	}

	public Customer(String name, String address, String city, String zipCode) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name:" + name +  System.lineSeparator()+ "Address:" + address + System.lineSeparator()+"City:" + city + System.lineSeparator()+"zip:" + zipCode;
	}
	
	
}

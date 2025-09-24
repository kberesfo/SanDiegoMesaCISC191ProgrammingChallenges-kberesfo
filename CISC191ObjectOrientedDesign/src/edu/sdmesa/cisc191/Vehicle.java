package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * 
 * @author Kiernan Beresford
 *
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * 
 *         Version/date: 9/22/25
 * 
 *         Responsibilities of class:
 *         - Represents a vehicle with properties like make, miles, price,
 *         seats, and options
 *         - Provides methods to get the price, miles, seats, and manufacturer
 *         name
 *         - Provides methods to get the options
 */
public class Vehicle {
	private int miles;
	private int seats;
	private int price;
	private String make;
	// has many options
	Option[] options;

	Vehicle(String make, int miles, int price, int numSeats, Option[] options) {
		this.miles = miles;
		this.price = price;
		this.seats = numSeats;
		this.make = make;
		this.options = options;
	}

	/**
	 * Purpose: get the price of the vehicle
	 * 
	 * @return the price of the vehicle
	 */

	public int getPrice() {
		return this.price;
	}

	/**
	 * Purpose: get the miles on the vehicle
	 * 
	 * @return the miles on the vehicle
	 */
	public int getMilesOnVehicle() {
		return this.miles;
	}

	/**
	 * Purpose: get the number of seats
	 * 
	 * @return the number of seats
	 */
	public int getNumberOfSeats() {
		return this.seats;
	}

	/**
	 * Purpose: get the manufacturer name
	 * 
	 * @return the manufacturer name
	 */
	public String getManufacturerName() {
		return this.make;
	}

	/**
	 * Purpose: get the options
	 * 
	 * @return the options
	 */
	public Option[] getOptions() {
		Option[] temp = new Option[this.options.length];
		// copy the options
		for (int i = 0; i < this.options.length; i++) {
			temp[i] = new Option(this.options[i]);
		}
		return temp;
	}
}

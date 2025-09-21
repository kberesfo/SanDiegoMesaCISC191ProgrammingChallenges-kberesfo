package edu.sdmesa.cisc191;

import java.util.ArrayList;

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
 *         <<add more references here>>
 * 
 *         Version/date:
 * 
 *         Responsibilities of class:
 * 
 */

// TODO: Implement and comment all IS-A and IS relationships separately

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

	public int getPrice() {
		return this.price;
	}

	public int getMilesOnVehicle() {
		return this.miles;
	}

	public int getNumberOfSeats() {
		return this.seats;
	}

	public String getManufacturerName() {
		return this.make;
	}

	public Object[] getOptions() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getOptions'");
	}
}

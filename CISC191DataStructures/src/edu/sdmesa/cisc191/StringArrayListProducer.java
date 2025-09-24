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
 * 
 *         Version/date: 9/22/25
 * 
 *         Responsibilities of class:
 *         - Represents a producer that produces strings
 *         - Implements the Producer interface
 *         - Uses an ArrayList to store the strings
 */
public class StringArrayListProducer implements Producer<String> {
	// An ArrayListConsumer has-many Strings
	private ArrayList<String> list;

	/**
	 * Purpose: create a new String array list producer
	 * 
	 * @param initialStrings the initial strings to produce
	 */
	public StringArrayListProducer(ArrayList<String> initialStrings) {
		this.list = initialStrings;
	}

	/**
	 * Purpose: produce a string
	 * 
	 * @param item the string to produce
	 */
	@Override
	public void produce(String item) {
		this.list.add(item);
	}

	/**
	 * Purpose: produce a string at a specific index
	 * 
	 * @param index     the index to produce at
	 * @param newString the string to produce
	 */
	public void produce(int index, String newString) {
		this.list.add(index, newString);
	}

}

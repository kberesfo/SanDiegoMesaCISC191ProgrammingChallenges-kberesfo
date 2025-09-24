package edu.sdmesa.cisc191;

import java.util.ArrayList;
import java.util.NoSuchElementException;

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
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a consumer of a collection
 *         - Consumes an element from the collection
 *         - Returns the consumed element
 */
public class StringArrayListConsumer implements Consumer<String> {
	// An ArrayListConsumer has-many Strings
	private ArrayList<String> list;

	public StringArrayListConsumer(ArrayList<String> initialStrings) {
		this.list = initialStrings;
	}

	/**
	 * Purpose: Pop left from the array list
	 * 
	 * @return String
	 */
	@Override
	public String consume() {
		try {
			return this.list.removeFirst();
		} catch (NoSuchElementException e) {
			// if element exception return null
			return null;

		}

	}
}

package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * 
 * @author
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date:
 * 
 * Responsibilities of class:
 * 
 */
import java.util.ArrayList;
import java.util.NoSuchElementException;

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

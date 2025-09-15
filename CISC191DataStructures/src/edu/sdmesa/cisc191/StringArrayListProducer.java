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

public class StringArrayListProducer implements Producer<String> {
	// An ArrayListConsumer has-many Strings
	private ArrayList<String> list;

	public StringArrayListProducer(ArrayList<String> initialStrings) {
		this.list = initialStrings;
	}

	/**
	 * Purpose: 
	 * 
	 * @param String item
	 */
	@Override
	public void produce(String item) {
		this.list.add(item);
	}

	/**
	 * Purpose:
	 * 
	 * @param int    index
	 * @param String newString
	 */
	public void produce(int index, String newString) {
		this.list.add(index, newString);
	}

}

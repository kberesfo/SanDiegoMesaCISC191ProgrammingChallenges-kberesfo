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
 * 
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a consumer of a collection
 *         - Consumes an element from the collection
 *         - Returns the consumed element
 */
public interface Consumer<T> {
	/**
	 * Consumes an element from the collection
	 * by removing an element that was previously produced by a Producer.
	 * 
	 * @return the consumed element
	 */
	public T consume();
}
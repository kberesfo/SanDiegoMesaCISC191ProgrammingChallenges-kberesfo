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
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a producer of a collection
 *         - Produces an element to the collection
 *         - Adds an element to the collection
 */
public interface Producer<T> {
	/**
	 * Adds an element from the collection; making it available for consumption.
	 */
	public void produce(T item);
}
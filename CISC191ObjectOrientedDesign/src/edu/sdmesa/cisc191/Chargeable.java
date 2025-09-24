package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * 
 * @author Kiernan Beresford
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
 *         - Represents a chargeable object that extends Movable interface
 *         - Provides methods to get the charge of the object
 *         - Implements the chargeTo method to set the charge of the object
 */
public interface Chargeable {
	/**
	 * Purpose: get the battery charge
	 * 
	 * @return the battery charge
	 */
	int getBatteryCharge();

	/**
	 * Purpose: add charge to the battery
	 * 
	 * @param charge the charge to charge up the battery to
	 */
	void chargeUp(int charge);

	/**
	 * Purpose: fill the battery to 100%
	 */
	void chargeUp();
}

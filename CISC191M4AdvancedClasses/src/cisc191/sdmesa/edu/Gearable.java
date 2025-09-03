package cisc191.sdmesa.edu;

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
 *         <<add more references here>>
 * 
 *         Version/date: 9/3/25
 * 
 *         Responsibilities of interface:
 * 
 */
public interface Gearable {

	/**
	 * 
	 * @return the gear that object is currently in
	 */
	int getGear();

	/**
	 * Purpose: Decrease the gear
	 */
	void gearDown();

	/**
	 * Purpose: Increase the gear
	 */
	void gearUp();
}

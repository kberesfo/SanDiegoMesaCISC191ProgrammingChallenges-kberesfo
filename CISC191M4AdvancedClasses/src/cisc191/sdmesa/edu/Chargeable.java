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
 * 
 *         Version/date: 9/14/25
 * 
 *         Responsibilities of class:
 *         - Represents a chargeable object that extends Movable interface
 *         - Provides methods to get the charge of the object
 *         - Implements the chargeTo method to set the charge of the object 
 */
public interface Chargeable extends Movable {
    // instance var
    int getCharge();

    /**
     * Purpose:
     * 
     * @param int charge
     */
    void chargeTo(int charge);
}

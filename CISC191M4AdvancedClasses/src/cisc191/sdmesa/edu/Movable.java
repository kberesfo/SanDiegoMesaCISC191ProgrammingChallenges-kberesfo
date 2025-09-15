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
 *         Responsibilities of interface:
 *         - Define methods for objects that can move and change speed.
 *         - Specify contract for getting current speed, speeding up, and
 *         slowing down.
 *         - Ensure implementing classes provide movement-related functionality.
 * 
 */

public interface Movable {
    /**
     * Purpose: get the current speed of the movable object
     * 
     * @return int
     */
    int getSpeed();

    /**
     * Purpose: speed the movable object up
     */
    void speedUp();

    /**
     * Purpose: slow the movable object down
     */
    void slowDown();

}

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
 *         Responsibilities of interface:
 *         - Represents a combustible object
 *         - Provides methods to get the fuel level
 *         - Provides methods to tank up
 */
public interface Combustible {
    /**
     * Purpose: get the fuel level
     * 
     * @return the fuel level
     */
    int getFuelLevel();

    /**
     * Purpose: fill the fuel tank to 100%
     *
     */
    void tankUp();

    /**
     * Purpose: add fuel to the fuel level
     * 
     * @param fuel the fuel to add to the fuel level
     */
    void addFuel(int fuel);
}

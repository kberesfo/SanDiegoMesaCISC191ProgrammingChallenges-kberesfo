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
 *         - Represents an option for a vehicle
 *         - Provides methods to get the details of the option
 */
public class Option {
    private String name;

    /**
     * Purpose: create a new option by copying the name of the option
     * 
     * @param option the option to copy
     */
    Option(Option option) {
        this(option.name);
    }

    /**
     * Purpose: create a new option
     * 
     * @param name the name of the option
     */
    Option(String name) {
        this.name = name;
    }

    /**
     * Purpose: get the details of the option
     * 
     * @return the details of the option
     */
    public String getDetails() {
        // return the name of the option
        return this.name;
    }
}

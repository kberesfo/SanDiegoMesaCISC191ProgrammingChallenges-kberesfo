package edu.sdmesa.cisc191;

import java.util.Hashtable;
import java.util.Map;

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
 *         r123454321. “Returning Null in a Method Whose Signature Says Return
 *         Int?” Stack Overflow, 20 June 2013,
 *         stackoverflow.com/questions/17221759/returning-null-in-a-method-whose-signature-says-return-int.
 * 
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a boat with properties like make, color, speed, price,
 *         and serial number
 *         - Manages boat ownership and captain assignment through Person
 *         objects
 *         - Provides methods to control boat speed (speedUp, slowDown)
 *         - Generates unique serial numbers for each boat instance
 *         - Supports multiple constructors for different initialization
 *         scenarios
 *         - Provides getter and setter methods for boat properties
 *         - Implements toString method for string representation of boat
 *         information
 */
public class PhoneDirectory {
    Map<String, Person> directory;

    /**
     * Locally defined person
     */
    public class Person {
        private String name;
        private int number;

        /**
         * Purpose: Constructor for a person
         * 
         * @param name   name of the person
         * @param number number for the person
         */
        Person(String name, int number) {
            this.name = name;
            this.number = number;
        }

        /**
         * Purpose: Getter for the phone number
         * 
         * @return get the number for the person
         */
        public int getNumber() {
            return this.number;
        }

        /**
         * Purpose: Set the phone number for the person
         * 
         * @param number
         */
        public void setNumber(int number) {
            this.number = number;
        }

        /**
         * Purpose: Get the name for the person
         * 
         * @return get the name for the person
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * Purpose: Constructor for a new phone directory
     */
    PhoneDirectory() {
        this(new Hashtable<String, Person>());
    }

    /**
     * Purpose: Create an instance from of phone directory
     * 
     * @param directory the directory to create
     */
    PhoneDirectory(Map<String, Person> directory) {
        this.directory = directory;
    }

    /**
     * Purpose: Find the phone number for a person
     * 
     * @param name find the phone number for a person using their name
     * @return the phone number for the person
     */
    public Integer findNumberForPerson(String name) {
        if (this.directory.containsKey(name))
            return this.directory.get(name).getNumber();

        return null;
    }

    /**
     * Purpose: Update a persons phone number
     * 
     * @param name   the name of the person to update their number
     * @param number the persons number to update
     */
    public void setNumberForPerson(String name, int number) {
        // add a person to the directory
        if (this.directory.containsKey(name))
            this.directory.get(name).setNumber(number);

        // if the person doesn't exist add them
        this.directory.put(name, new Person(name, number));
    }

    /**
     * Purpose: Forget a person
     * 
     * @param name the name of the person to forget
     */
    public void forget(String name) {
        if (this.directory.containsKey(name))
            this.directory.remove(name);
    }
}

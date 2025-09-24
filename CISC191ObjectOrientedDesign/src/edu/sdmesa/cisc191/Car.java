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
 *         - Represents a car that extends Vehicle
 *         - Provides methods to get the number of doors
 */
public class Car extends Vehicle {
    private int doors;

    /**
     * Purpose: create a new car
     * 
     * @param make     the make of the car
     * @param miles    the miles of the car
     * @param price    the price of the car
     * @param numSeats the number of seats of the car
     * @param options  the options of the car
     * @param doors    the number of doors of the car
     */
    Car(
            String make,
            int miles,
            int price,
            int numSeats,
            Option[] options,
            int doors) {
        super(make, miles, price, numSeats, options);
        this.doors = doors;
    }

    /**
     * Purpose: get the number of doors
     * 
     * @return the number of doors
     */
    public int getNumberOfDoors() {
        return this.doors;
    }

}

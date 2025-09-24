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
 *         <<add more references here>>
 * 
 *         Version/date:
 * 
 *         Responsibilities of class:
 *         - Represents a pickup truck that extends Vehicle
 *         - Provides methods to get the cargo capacity
 */
public class PickupTruck extends Vehicle {
    private int cargoCapacity;

    /**
     * Purpose: create a new pickup truck
     * 
     * @param make          the make of the pickup truck
     * @param miles         the miles of the pickup truck
     * @param price         the price of the pickup truck
     * @param numSeats      the number of seats of the pickup truck
     * @param options       the options of the pickup truck
     * @param cargoCapacity the cargo capacity of the pickup truck
     */
    PickupTruck(String make, int miles, int price, int numSeats, Option[] options, int cargoCapacity) {
        super(make, miles, price, numSeats, options);
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * Purpose: get the cargo capacity
     * 
     * @return the cargo capacity
     */
    public int getCargoCapacity() {
        return this.cargoCapacity;
    }
}

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
 *         - Represents a sport utility vehicle that extends Vehicle
 *         - Provides methods to get the cargo capacity
 */
public class SportsUtilityVehicle extends Vehicle {
    private int maxTowCapacity;

    /**
     * Purpose: create a new sport utility vehicle
     * 
     * @param make     the make of the sport utility vehicle
     * @param miles    the miles of the sport utility vehicle
     * @param price    the price of the sport utility vehicle
     * @param numSeats the number of seats of the sport utility vehicle
     * @param options  the options of the sport utility vehicle
     */
    SportsUtilityVehicle(String make, int miles, int price, int numSeats, Option[] options) {
        this(make, miles, price, numSeats, options, 5000);

    }

    /**
     * Purpose: create a new sport utility vehicle
     * 
     * @param make          the make of the sport utility vehicle
     * @param miles         the miles of the sport utility vehicle
     * @param price         the price of the sport utility vehicle
     * @param numSeats      the number of seats of the sport utility vehicle
     * @param options       the options of the sport utility vehicle
     * @param cargoCapacity the cargo capacity of the sport utility vehicle
     */
    SportsUtilityVehicle(String make, int miles, int price, int numSeats, Option[] options, int maxTowCapacity) {
        super(make, miles, price, numSeats, options);
        this.maxTowCapacity = maxTowCapacity;
    }

    /**
     * Purpose: get the max tow capacity
     * 
     * @return the max tow capacity
     */
    public int getMaxTowingWeight() {
        return this.maxTowCapacity;
    }
}

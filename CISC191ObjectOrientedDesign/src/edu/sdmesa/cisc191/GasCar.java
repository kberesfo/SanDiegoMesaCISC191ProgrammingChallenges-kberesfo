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
 *         - Represents a gas car that extends Car and implements Combustible
 *         - Provides methods to get the fuel level
 *         - Provides methods to tank up
 */
public class GasCar extends Car implements Combustible {
    private int fuelLevel = 0;

    /**
     * Purpose: create a new gas car
     * 
     * @param make     the make of the gas car
     * @param miles    the miles of the gas car
     * @param price    the price of the gas car
     * @param numSeats the number of seats of the gas car
     * @param options  the options of the gas car
     * @param doors    the number of doors of the gas car
     */
    GasCar(String make, int miles, int price, int numSeats, Option[] options, int doors) {
        this(make, miles, price, numSeats, options, doors, 0);
    }

    /**
     * Purpose: create a new gas car
     * 
     * @param make     the make of the gas car
     * @param miles    the miles of the gas car
     * @param price    the price of the gas car
     * @param numSeats the number of seats of the gas car
     * @param options  the options of the gas car
     * @param doors    the number of doors of the gas car
     */
    GasCar(String make, int miles, int price, int numSeats, Option[] options, int doors, int fuelLevel) {
        super(make, miles, price, numSeats, options, doors);
        this.fuelLevel = fuelLevel;
    }

    /**
     * Purpose: create a new gas car
     * 
     * @param make     the make of the gas car
     * @param miles    the miles of the gas car
     * @param price    the price of the gas car
     * @param numSeats the number of seats of the gas car
     * @param options  the options of the gas car
     * @param doors    the number of doors of the gas car
     */

    /**
     * Purpose: get the fuel level
     * 
     * @return the fuel level
     */
    @Override
    public int getFuelLevel() {
        return this.fuelLevel;
    }

    /**
     * Purpose: tank up the fuel level
     * 
     */
    @Override
    public void tankUp() {
        this.fuelLevel = 50;
    }

    /**
     * Purpose: add fuel to the fuel level
     * 
     * @param fuel the fuel to add to the fuel level
     */
    @Override
    public void addFuel(int fuel) {
        this.fuelLevel = Math.min(50, this.fuelLevel + fuel);
    }

}

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
 *         - Represents a hybrid car that extends Car and implements Combustible
 *         and Chargeable
 *         - Provides methods to get the fuel level and battery charge
 *         - Provides methods to tank up and charge up
 */
public class HybridCar extends Car implements Combustible, Chargeable {
    private int fuelLevel;
    private int batteryCharge;

    /**
     * Purpose: create a new hybrid car
     * 
     * @param make     the make of the hybrid car
     * @param miles    the miles of the hybrid car
     * @param price    the price of the hybrid car
     * @param numSeats the number of seats of the hybrid car
     * @param options  the options of the hybrid car
     * @param doors    the number of doors of the hybrid car
     */
    HybridCar(String make, int miles, int price, int numSeats, Option[] options, int doors) {
        this(make, miles, price, numSeats, options, doors, 0, 0);
    }

    /**
     * Purpose: create a new hybrid car
     * 
     * @param make          the make of the hybrid car
     * @param miles         the miles of the hybrid car
     * @param price         the price of the hybrid car
     * @param numSeats      the number of seats of the hybrid car
     * @param doors         the number of doors of the hybrid car
     * @param fuelLevel     the fuel level of the hybrid car
     * @param batteryCharge the battery charge of the hybrid car
     * @param options       the options of the hybrid car
     */
    HybridCar(
            String make,
            int miles,
            int price,
            int numSeats,
            Option[] options,
            int doors,
            int fuelLevel,
            int batteryCharge) {
        super(make, miles, price, numSeats, options, doors);
        this.fuelLevel = fuelLevel;
        this.batteryCharge = batteryCharge;
    }

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
     * Purpose: get the battery charge
     * 
     * @return the battery charge
     */
    @Override
    public int getBatteryCharge() {
        return this.batteryCharge;
    }

    /**
     * Purpose: tank up the fuel
     * 
     * @param fuel the fuel to tank up the fuel level to
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

    /**
     * Purpose: charge up the battery
     * 
     * @param charge the charge to charge up the battery to
     */
    @Override
    public void chargeUp(int charge) {
        this.batteryCharge = Math.min(100, this.batteryCharge + charge);
    }

    /**
     * Purpose: charge up the battery
     */
    @Override
    public void chargeUp() {
        this.batteryCharge = 100;
    }

}

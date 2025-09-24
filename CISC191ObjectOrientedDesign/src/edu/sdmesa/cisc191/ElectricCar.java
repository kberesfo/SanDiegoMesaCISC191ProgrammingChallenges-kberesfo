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
 *         - Represents an electric car that extends Car and implements
 *         Chargeable
 *         - Provides methods to get the battery charge
 *         - Provides methods to charge up the battery
 */
public class ElectricCar extends Car implements Chargeable {
    private int batteryCharge = 0;

    /**
     * Purpose: create a new electric car
     * 
     * @param make     the make of the electric car
     * @param miles    the miles of the electric car
     * @param price    the price of the electric car
     * @param numSeats the number of seats of the electric car
     * @param options  the options of the electric car
     * @param doors    the number of doors of the electric car
     */
    ElectricCar(String make, int miles, int price, int numSeats, Option[] options, int doors) {
        this(make, miles, price, numSeats, options, doors, 0);
    }

    /**
     * Purpose: create a new electric car
     * 
     * @param make          the make of the electric car
     * @param miles         the miles of the electric car
     * @param price         the price of the electric car
     * @param numSeats      the number of seats of the electric car
     * @param options       the options of the electric car
     * @param doors         the number of doors of the electric car
     * @param batteryCharge the battery charge of the electric car
     */
    ElectricCar(String make, int miles, int price, int numSeats, Option[] options, int doors, int batteryCharge) {
        super(make, miles, price, numSeats, options, doors);
        this.batteryCharge = batteryCharge;
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
     * Purpose: add charge to the battery
     * 
     * @param charge the charge to charge up the battery to
     */
    @Override
    public void chargeUp(int charge) {
        this.batteryCharge = Math.min(100, this.batteryCharge + charge);
    }

    /**
     * Purpose: fill the battery to 100%
     */
    @Override
    public void chargeUp() {
        this.batteryCharge = 100;
    }
}

package cisc191.sdmesa.edu;

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
 * 
 *         Version/date: 8/27/25
 * 
 *         Responsibilities of class:
 *         - Manages a collection of Boat objects in a harbor
 *         - Provides methods to park and retrieve boats from specific slips
 *         - Supports getting a complete inventory of boats in the harbor
 *         - Implements toString method for string representation of harbor
 *         inventory
 */
public class Harbor {
    // has many boats
    private Boat[] inventory;

    /**
     * @param int numberOfSlips
     */
    Harbor(int numberOfSlips) {
        this.inventory = new Boat[numberOfSlips];
    }

    /**
     * Purpose: Park a boat at a slip
     * 
     * @param Boat boat
     * @param int  slipNumber
     */
    public Boat parkBoatAt(Boat boat, int slipNumber) {
        // if a boat is already in the slip get it
        Boat boatInSlip = this.inventory[slipNumber];
        // set the new boat in the slip
        this.inventory[slipNumber] = boat;
        // return the boat that was in the slip
        return boatInSlip;
    }

    /**
     * Purpose: Return the boat parked at a slip
     * 
     * @param int slipNumber
     * @return Boat | null
     */
    public Boat getBoatAt(int slipNumber) {
        return this.inventory[slipNumber];
    }

    /**
     * Purpose return a carbon copy of the current boat slip
     * this could be made better by creating mutable copies of the boats as well
     * 
     * @return boat[]
     */
    public Boat[] getInventory() {
        // initialize a new array with the same length as old array
        Boat[] temp = new Boat[this.inventory.length];
        // iterate over the array and make a copy
        for (int i = 0; i < this.inventory.length; i++) {
            temp[i] = this.inventory[i];
        }
        // return the carbon copy
        return temp;
    }
}

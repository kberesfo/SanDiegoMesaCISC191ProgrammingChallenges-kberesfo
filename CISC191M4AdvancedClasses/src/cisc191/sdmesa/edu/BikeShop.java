package cisc191.sdmesa.edu;

import java.util.ArrayList;

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
 *         Version/date: 9/21/25
 * 
 *         Responsibilities of class:
 *         - Store the name of the bike shop
 *         - Maintain an inventory of Cycle objects
 *         - Add cycles to the inventory
 *         - Provide the current inventory size
 *         - Return a string representation of the shop and its inventory
 */
public class BikeShop {
    private String name;
    // has many cycles
    private ArrayList<Cycle> inventory = new ArrayList<>();

    /**
     * Purpose: create a new bike shop
     * 
     * @param name the name of the bike shop
     */
    BikeShop(String name) {
        this.name = name;
    }

    /**
     * Purpose: get the bike shops's
     * 
     * @return the bike shop's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Purpose: add the given cycle to the inventory
     * 
     * @param cycle the cycle to add to the inventory
     */
    public void addToInventory(Cycle cycle) {
        this.inventory.add(cycle);
    }

    /**
     * Purpose: Current size of the inventory
     * 
     * @return number of bikes in the inventory
     */
    public int getNumberOfBikesInInventory() {
        return this.inventory.size();
    }

    /**
     * Purpose: return a string representation of the bike shop and its inventory
     * 
     * @return String representation of the bike shop and its inventory
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(String.format("Name: %s", this.name));
        builder.append("\n");

        builder.append("Inventory: \n");

        for (Cycle cycle : this.inventory) {
            // convert cycle to string
            builder.append(cycle.toString());
            // add new line char
            builder.append("\n");
        }

        return builder.toString();
    }
}

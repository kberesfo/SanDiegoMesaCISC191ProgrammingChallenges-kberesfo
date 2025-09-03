package cisc191.sdmesa.edu;

import java.util.ArrayList;

public class BikeShop {
    private String name;
    private ArrayList<Cycle> inventory = new ArrayList<>();

    BikeShop(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addToInventory(Cycle cycle) {
        this.inventory.add(cycle);
    }

    public int getNumberOfBikesInInventory() {
        return this.inventory.size();
    }

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

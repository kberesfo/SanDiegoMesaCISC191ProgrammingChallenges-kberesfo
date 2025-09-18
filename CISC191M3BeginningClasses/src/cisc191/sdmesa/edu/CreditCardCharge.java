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
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a credit card charge with properties like year, month,
 *         day, boat, purchased from, and card
 *         - Manages credit card charge details through Boat and CreditCard
 *         objects
 *         - Provides methods to get charge information and card details
 *         - Implements toString method for string representation of credit card
 *         charge information
 */
public class CreditCardCharge {
    // instance vars
    private int year;
    private int month;
    private int day;
    // has-a boat
    private Boat boat;
    // has-a card
    private CreditCard card;
    // has-a purchased from
    private String purchasedFrom;

    /**
     * 
     * @param year          the year of the charge
     * @param month         the month of the charge
     * @param day           the current day
     * @param boat          the boat being purchased
     * @param purchasedFrom the store the boat was purchased from
     * @param card          the card used to purchase the boat
     */
    CreditCardCharge(int year, int month, int day, Boat boat, String purchasedFrom, CreditCard card) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.boat = boat;
        this.purchasedFrom = purchasedFrom;
        this.card = card;
    }

    /**
     * Purpose: display the charge on the card as a string
     */
    @Override
    public String toString() {
        // create a new string builder
        StringBuilder builder = new StringBuilder();
        // format the date
        builder.append(String.format("%d/%d/%d ", year, month, day));
        // formats the card info
        builder.append(String.format("%s ", this.card.toString()));
        // formats the purchased from
        builder.append(String.format("%s", this.purchasedFrom));
        // formats the boat info
        builder.append(String.format("%s $%d", this.boat.getMake(), this.boat.getPrice()));
        // return the formatted string
        return builder.toString();
    }
}

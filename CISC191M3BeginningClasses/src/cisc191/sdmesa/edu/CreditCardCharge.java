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
 * 
 */
public class CreditCardCharge {
    // has-a year
    private int year;
    // has-a month
    private int month;
    // has-a day
    private int day;
    // has-a boat
    private Boat boat;
    // has-a card
    private CreditCard card;
    // has-a purchased from
    private String purchasedFrom;

    /**
     * 
     * @param year
     * @param month
     * @param day
     * @param boat
     * @param purchasedFrom
     * @param card
     */
    CreditCardCharge(int year, int month, int day, Boat boat, String purchasedFrom, CreditCard card) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.boat = boat;
        this.purchasedFrom = purchasedFrom;
        this.card = card;
    }

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

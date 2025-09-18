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
 *         - Represents a credit card with properties like card number,
 *         expiration date, pin, and owner
 *         - Manages credit card ownership through Person objects
 *         - Provides methods to get card information and owner details
 *         - Implements toString method for string representation of credit card
 *         information
 */
public class CreditCard {
    // instance vars
    private String expDate;
    private String pin;
    private String cardNumber;
    // has-a Person owner
    private Person owner;

    /**
     * 
     * @param cardNumber the card number for the credit card
     * @param expDate    the expiration date of the credit card
     * @param pin        the pin for the credit card
     * @param Person     the owner of the credit card
     */
    CreditCard(String cardNumber, String expDate, String pin, Person owner) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.pin = pin;
        this.owner = owner;
    }

    /**
     * Purpose: Display the credit card as a string.
     */
    @Override
    public String toString() {
        // format the card info
        return String.format(
                "%s %s %s %s",
                this.cardNumber,
                this.expDate,
                this.pin,
                this.owner.getName());
    }
}

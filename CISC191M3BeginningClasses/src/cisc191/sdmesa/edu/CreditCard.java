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
public class CreditCard {
    // has-a card number
    private String cardNumber;
    // has-a expiration date
    private String expDate;
    // has-a pin
    private String pin;
    // has-a Person owner
    private Person owner;

    /**
     * 
     * @param String cardNumber
     * @param String expDate
     * @param String pin
     * @param Person owner
     */
    CreditCard(String cardNumber, String expDate, String pin, Person owner) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.pin = pin;
        this.owner = owner;
    }

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

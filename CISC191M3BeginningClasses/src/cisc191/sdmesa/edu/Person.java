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
public class Person {
    // has-a name
    private String name;
    // has-a phone number
    private String phoneNumber;
    // has-a zip code
    private String zipCode;

    Person(String name, String phoneNumber, String zipCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
    }

    /**
     * Purpose: get the current name
     * 
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Purpose: set a new name
     * 
     * @param String name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Purpose: get the current phone number
     * 
     * @return String
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Purpose: set a new phone number
     * 
     * @param String phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Purpose: get the current zipcode
     * 
     * @return String
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Purpose: zet a new zipcode
     * 
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return String.format(
                "%s %s %s",
                this.name,
                this.phoneNumber,
                this.zipCode);
    }
}

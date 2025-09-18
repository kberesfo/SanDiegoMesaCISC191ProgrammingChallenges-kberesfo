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
 *         - Represents a person with properties like name, phone number, and
 *         zip code
 *         - Provides methods to get and set person details
 *         - Implements toString method for string representation of person
 *         information
 */
public class Person {
    // instance vars
    private String name;
    private String phoneNumber;
    private String zipCode;

    Person(String name, String phoneNumber, String zipCode) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
    }

    /**
     * Purpose: get the current name
     * 
     * @return the name of the person
     */
    public String getName() {
        return this.name;
    }

    /**
     * Purpose: set a new name
     * 
     * @param name set the name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Purpose: get the current phone number
     * 
     * @return the
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Purpose: set a new phone number
     * 
     * @param phoneNumber set a new phone number for the person
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Purpose: get the current zipcode
     * 
     * @return get the person's zipcode
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Purpose: zet a new zipcode
     * 
     * @param zipCode set the persons zipcode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Purpose: display this person's information as a string
     */
    @Override
    public String toString() {
        return String.format(
                "%s %s %s",
                this.name,
                this.phoneNumber,
                this.zipCode);
    }
}

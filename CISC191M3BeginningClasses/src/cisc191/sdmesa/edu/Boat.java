package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * 
 * @author Kiernan Beresford
 * 
 *         Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 *         Version/date: 8/27/25
 * 
 *         Responsibilities of class:
 * 
 */

public class Boat {
	// the class
	private static int nextSerialNumber = 0;
	// has-a make
	private String make;
	// has-a color
	private Color color;
	// has-a speed
	private int speed;
	// has-a price
	private int price;
	// has-a serialNumber
	private int serialNumber;
	// has-a Person (owner)
	private Person owner;
	// has-a Person (captain)
	private Person captain;

	Boat() {
		// set defaults here
		this.make = null;
		this.color = null;
		this.speed = 0;
		this.price = -1;
		this.serialNumber = Boat.createNewSerialNumber();
	}

	/**
	 *
	 * @param String make
	 * @param Color  color
	 */
	Boat(String make, Color color) {
		this();
		this.make = make;
		this.color = color;
	}

	/**
	 * 
	 * @param Boat boat
	 */
	Boat(Boat boat) {
		this();
		this.make = boat.getMake();
		this.color = boat.getColor();
		this.speed = boat.getSpeed();
		this.price = boat.getPrice();
	}

	/**
	 * Purpose: create a new unique serial number
	 * 
	 * @return int
	 */
	public static Integer createNewSerialNumber() {
		// increment then return
		return ++Boat.nextSerialNumber;
	}

	/**
	 * Purpose: Return the instances serial number
	 * 
	 * @return int
	 */
	public int getSerialNumber() {
		return this.serialNumber;
	}

	/**
	 * Purpose: increase the instance's speed
	 * 
	 */
	public void speedUp() {
		this.speed += 1;
	}

	/**
	 * Purpose: decreases the instance's speed
	 */
	public void slowDown() {
		this.speed = Math.max(0, this.speed - 1);
	}

	/**
	 * Purpose: Get the make of the boat
	 * 
	 * @return String
	 */
	public String getMake() {
		// accessor
		return this.make;
	}

	/**
	 * Purpose: Get the color
	 * 
	 * @return Color
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Purpose: Set the color
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Purpose: get the speed
	 * 
	 * @return int
	 */
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * Purpose: get the price
	 *
	 * @return int
	 */
	public int getPrice() {
		return this.price;
	}

	/**
	 * Purpose: set the price
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Purpose: Get the current owner
	 * 
	 * @return Person
	 */
	public Person getOwner() {
		return this.owner;
	}

	/**
	 * Purpose: Set the current owner
	 * 
	 * @param Person owner
	 */
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	/**
	 * Purpose: get the current captain
	 * 
	 * @return Person captain
	 */
	public Person getCaptain() {
		return this.captain;
	}

	/**
	 * Purpose: set a new captain for the boat
	 * 
	 * @param Person captain
	 */
	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	/**
	 * Purpose: display the
	 */
	@Override
	public String toString() {
		return String.format(
				"Boat: make: %s color: %s",
				this.make,
				this.color.toString());
	}

}

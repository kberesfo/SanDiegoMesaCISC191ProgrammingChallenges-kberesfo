package cisc191.sdmesa.edu;

import java.awt.Color;

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
 *         Version/date: 9/14/25
 * 
 *         Responsibilities of class:
 *         - Represent a generic cycle (e.g., bicycle, tricycle, etc.) with
 *         common properties.
 *         - Track and assign a unique, immutable frame number to each cycle
 *         instance.
 *         - Store the make/brand of the cycle as an immutable property.
 *         - Define abstract methods for wheel count, color retrieval, and color
 *         modification, to be implemented by subclasses.
 *         - Provide accessors for make and frame number.
 *         - Implement equality based on frame number uniqueness.
 *         - Provide a string representation including frame number.
 */

public abstract class Cycle {
	// Cycle has a newFrameNumber tracking the next frame number
	private static int newFrameNumber = 0;
	// A cycle has a make, that is immutable
	final private String make;
	// A cycle has a unique frame number, that is *immutable*;
	final private int frameNumber;

	/**
	 * 
	 * @param String newMake
	 */
	public Cycle(String newMake) {
		this.make = newMake;
		this.frameNumber = ++Cycle.newFrameNumber;
	}

	abstract int getNumberOfWheels();

	/**
	 * 
	 * @return the color of the bike; can be null
	 */
	abstract Color getColor();

	/**
	 * Changes the color of the bike
	 * 
	 * @param newColor
	 */
	abstract void setColor(Color newColor);

	/**
	 * 
	 * @return make or brand that was set when the bike was made
	 */
	public String getMake() {
		return this.make;
	}

	/**
	 * 
	 * @return the unique serial number that was stamped in the frame when the bike
	 *         was made
	 * @see https://www.eta.co.uk/bicycle-insurance/frequently-asked-questions/how-to-find-a-bicycle-frame-number/
	 */
	public int getFrameNumber() {
		return this.frameNumber;
	}

	/**
	 * @return true if the frame number are the same
	 */
	@Override
	public boolean equals(Object other) {
		// Hint: use instanceof
		// See: https://www.sitepoint.com/implement-javas-equals-method-correctly/
		if (other instanceof Cycle) {
			// cast to cycle, it feels silly but i guess java doesn't type narrow
			Cycle cycle = (Cycle) other;
			if (cycle.getFrameNumber() == this.frameNumber) {
				return true;
			}
		}

		return false;
	}

	/**
	 * @return String describing the object, including type, make and frame number
	 */
	@Override
	public String toString() {
		return String.format("(%d)", this.frameNumber);
	}

}

package cisc191.sdmesa.edu;

import java.awt.Color;

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
 *         - Represent a unicycle, which is a type of Cycle with only one wheel.
 *         - Implement the Movable interface, allowing speed control (speed up,
 *         slow down, get speed).
 *         - Store and manage the color of the unicycle, allowing it to be set
 *         and retrieved.
 *         - Store and manage the speed of the unicycle.
 *         - Provide a string representation including make and frame number.
 *         - Inherit and implement abstract methods from Cycle (number of
 *         wheels, color management).
 */
public class Unicycle extends Cycle implements Movable {
	private int speed;
	// has-a color
	private Color color;

	/**
	 * 
	 * @param make the make of the unicycle
	 */
	Unicycle(String make) {
		super(make);
	}

	/**
	 * Purpose: return the number of wheels
	 * 
	 * @return the number of wheels of the unicycle
	 */
	public int getNumberOfWheels() {
		return 1;
	}

	/**
	 * Purpose: Paint the cycle
	 * 
	 * @param color the color to paint the unicycle
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Purpose: get the current color of the cycle
	 * 
	 * @return the color of the unicycle
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Purpose: return a string representation of the unicycle
	 * 
	 * @return a string representation of the unicycle
	 */
	@Override
	public String toString() {
		return String.format("%s %s", this.getMake(), super.toString());
	}

	/**
	 * Purpose: get the speed of the unicycle
	 * 
	 * @return the speed of the unicycle
	 */
	@Override
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * Purpose: decrease the speed of the unicycle
	 */
	@Override
	public void slowDown() {
		this.speed = Math.max(0, --this.speed);

	}

	/**
	 * Purpose: increase the speed of the unicycle
	 */
	@Override
	public void speedUp() {
		this.speed++;
	}
}

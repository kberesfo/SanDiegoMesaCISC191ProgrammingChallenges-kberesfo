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
 *         Version/date: 9/14/25
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
	// has-a color
	private Color color;
	// has-a speed
	private int speed;

	/**
	 * 
	 * @param String make
	 */
	Unicycle(String make) {
		super(make);
	}

	/**
	 * Purpose: return the number of wheels
	 * 
	 * @return int
	 */
	public int getNumberOfWheels() {
		return 1;
	}

	/**
	 * Purpose: Paint the cycle
	 * 
	 * @param Color color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Purpose: get the current color of the cycle
	 * 
	 * @return Color
	 */
	public Color getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return String.format("%s %s", this.getMake(), super.toString());
	}

	@Override
	public int getSpeed() {
		return this.speed;
	}

	@Override
	public void slowDown() {
		this.speed = Math.max(0, --this.speed);

	}

	@Override
	public void speedUp() {
		this.speed++;
	}
}

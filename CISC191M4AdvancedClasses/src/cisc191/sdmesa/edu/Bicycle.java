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
 *         - Represents a bicycle that inherits from Cycle class
 *         - Manages bicycle properties like color, gear, and speed
 *         - Provides methods to change gears and control movement
 *         - Implements Gearable interface for gear operations
 *         - Implements Movable interface for speed control
 *         - Supports basic bicycle operations like painting and getting wheel
 *         count
 */

public class Bicycle extends Cycle implements Gearable, Movable {
	private int gear = 1;
	private int speed = 0;
	// has-a color
	private Color color;

	/**
	 * Is-a Cycle
	 * Is Gearable
	 * 
	 * @param make
	 */
	Bicycle(String make) {
		super(make);
	}

	/**
	 * Purpose: return the number of wheels
	 * 
	 * @return the number of wheels
	 */
	public int getNumberOfWheels() {
		return 2;
	}

	/**
	 * Purpose: Paint the cycle
	 * 
	 * @param color the color to paint the cycle
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Purpose: get the current color of the cycle
	 * 
	 * @return the current color of the cycle
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Purpose: return a string representation of the bicycle
	 * 
	 * @return a string representation of the bicycle
	 */
	@Override
	public String toString() {
		return String.format("%s %s", this.getMake(), super.toString());
	}

	/**
	 * Purpose: get the gear that the bicycle is currently in
	 * 
	 * @return the gear that the bicycle is currently in
	 */
	public int getGear() {
		return this.gear;
	};

	/**
	 * Purpose: get the speed of the bicycle
	 * 
	 * @return the speed of the bicycle
	 */
	@Override
	public int getSpeed() {

		return this.speed;
	}

	/**
	 * Purpose: increase the gear of the bicycle
	 */
	@Override
	public void gearUp() {
		// maximum number of gears
		this.gear = Math.min(6, ++this.gear);
	}

	/**
	 * Purpose: decrease the gear of the bicycle
	 */
	@Override
	public void gearDown() {
		// minimum number of gears
		this.gear = Math.max(1, --this.gear);
	}

	/**
	 * Purpose: increase the speed of the bicycle
	 */
	@Override
	public void speedUp() {
		this.speed++;
	}

	/**
	 * Purpose: decrease the speed of the bicycle
	 */
	@Override
	public void slowDown() {
		this.speed = Math.max(0, --this.speed);
	}
}

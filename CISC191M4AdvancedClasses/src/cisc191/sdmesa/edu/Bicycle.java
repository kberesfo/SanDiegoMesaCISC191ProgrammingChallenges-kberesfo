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
 *         Version/date: 9/3/25
 * 
 *         Responsibilities of class:
 *         A a Bicycle is a Cycle with two wheels
 */

// TODO: Implement and comment all IS-A (inheritance) and IS (implements)
// relationships separately

public class Bicycle extends Cycle implements Gearable, Movable {
	// has-a color
	private Color color;
	// has-a gear
	private int gear = 1;
	// has-a speed
	private int speed = 0;

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
	 * @return int
	 */
	public int getNumberOfWheels() {
		return 2;
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

	/**
	 * 
	 * @return the gear that object is currently in
	 */
	public int getGear() {
		return this.gear;
	};

	@Override
	public int getSpeed() {

		return this.speed;
	}

	@Override
	public void gearUp() {
		// maximum number of gears
		this.gear = Math.min(6, ++this.gear);
	}

	@Override
	public void gearDown() {
		// minimum number of gears
		this.gear = Math.max(1, --this.gear);
	}

	@Override
	public void speedUp() {
		this.speed++;
	}

	@Override
	public void slowDown() {
		this.speed = Math.max(0, --this.speed);
	}
}

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
 *         Version/date: 9/3/25
 * 
 *         Responsibilities of class:
 *         A Unicycle is a Cycle with only one wheel
 *         A Unicycle:
 *         - is Movable
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

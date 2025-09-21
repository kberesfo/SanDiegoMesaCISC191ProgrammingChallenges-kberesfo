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
 *         - ElectricMountainBike models an electric mountain bike with color,
 *         gear, speed, and charge state.
 *         - It supports changing gears, adjusting speed, charging the battery,
 *         and painting the bike.
 *         - Implements Gearable and Chargeable interfaces, and extends Cycle.
 */
public class ElectricMountainBike extends Cycle implements Gearable, Chargeable {
	private int gear = 1;
	private int speed = 0;
	private int charge;
	// has-a color
	private Color color;

	/**
	 * Is-a Cycle
	 * Is Gearable
	 * 
	 * @param make the make of the electric mountain bike
	 */
	ElectricMountainBike(String make) {
		super(make);
	}

	/**
	 * Purpose: return the number of wheels
	 * 
	 * @return the number of wheels of the electric mountain bike
	 */
	public int getNumberOfWheels() {
		return 2;
	}

	/**
	 * Purpose: Paint the cycle
	 * 
	 * @param color the color to paint the electric mountain bike
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Purpose: get the current color of the cycle
	 * 
	 * @return the current color of the electric mountain bike
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Purpose: return a string representation of the electric mountain bike
	 * 
	 * @return a string representation of the electric mountain bike
	 */
	@Override
	public String toString() {
		return String.format("%s %s", this.getMake(), super.toString());
	}

	/**
	 * Purpose: get the gear that the electric mountain bike is currently in
	 * 
	 * @return the gear that the electric mountain bike is currently in
	 */
	public int getGear() {
		return this.gear;
	};

	/**
	 * Purpose: increase the gear of the electric mountain bike
	 */
	@Override
	public void gearUp() {
		// maximum number of gears
		this.gear = Math.min(8, ++this.gear);
	}

	/**
	 * Purpose: decrease the gear of the electric mountain bike
	 */
	@Override
	public void gearDown() {
		// minimum number of gears
		this.gear = Math.max(1, --this.gear);
	}

	/**
	 * Purpose: get the speed of the electric mountain bike
	 * 
	 * @return the speed of the electric mountain bike
	 */
	@Override
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * Purpose: increase the speed of the electric mountain bike
	 * 
	 */
	@Override
	public void speedUp() {
		this.speed++;
		this.charge = Math.max(0, --this.charge);
	}

	/**
	 * Purpose: decrease the speed of the electric mountain bike
	 */
	@Override
	public void slowDown() {
		this.speed = Math.max(0, --this.speed);
		this.charge = Math.max(0, --this.charge);
	}

	/**
	 * Purpose: charge the electric mountain bike
	 * 
	 * @param charge the charge to charge the electric mountain bike to
	 */
	@Override
	public void chargeTo(int charge) {
		this.charge = charge;
	}

	/**
	 * Purpose: get the current charge
	 * 
	 * @return the current charge of the electric mountain bike
	 */
	@Override
	public int getCharge() {
		return this.charge;
	}

}

package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * 
 * @author
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
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
 *         Version/date:
 * 
 *         Responsibilities of class:
 *         ElectricMountainBike is a Bicyle that is Movable, Gearable, and
 *         Electric
 */

// TODO: Implement and comment all IS-A (inheritance) and IS (implements)
// relationships separately

public class ElectricMountainBike extends Cycle implements Gearable, Chargeable {
	// has-a color
	private Color color;
	// has-a gear default = 1
	private int gear = 1;
	// has-a speed
	private int speed = 0;
	// has-a charge state
	private int charge;

	/**
	 * Is-a Cycle
	 * Is Gearable
	 * 
	 * @param String make
	 */
	ElectricMountainBike(String make) {
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
	public void gearUp() {
		// maximum number of gears
		this.gear = Math.min(8, ++this.gear);
	}

	@Override
	public void gearDown() {
		// minimum number of gears
		this.gear = Math.max(1, --this.gear);
	}

	@Override
	public int getSpeed() {
		return this.speed;
	}

	/**
	 * Note: this could be made better by setting speed ot 0 when charge = 0
	 */
	@Override
	public void speedUp() {
		this.speed++;
		this.charge = Math.max(0, --this.charge);
	}

	/**
	 * Note: this could be made better by setting speed ot 0 when charge = 0
	 */
	@Override
	public void slowDown() {
		this.speed = Math.max(0, --this.speed);
		this.charge = Math.max(0, --this.charge);
	}

	/**
	 * 
	 */
	@Override
	public void chargeTo(int charge) {
		this.charge = charge;
	}

	/**
	 * Purpose: get the current charge
	 * 
	 * @return int charge
	 */
	@Override
	public int getCharge() {
		return this.charge;
	}

}

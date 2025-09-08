package edu.sdmesa.cisc191;

import java.awt.Color;

import edu.gatech.cc.DigitalPicture;
import edu.gatech.cc.Pixel;

/**
 * Lead Author(s):
 * 
 * @author Kiernan Beresford
 *
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
 *         Version/date: 8/28/25
 * 
 *         Responsibilities of class: Group several picture filters into a
 *         single class Logic
 * 
 */
public class Logic {

	public static void exampleArray() {
		char letterA = 'a';
		char letterB = 'b';

		char[] letters = new char[2];

		letters[0] = letterA;
		letters[1] = letterB;

		for (char letter : letters) {
			System.out.println(letter);
		}

		char[][] letterMatrix = new char[1][2];

		letterMatrix[0][0] = letterA;
		letterMatrix[0][1] = letterB;

		for (char[] row : letterMatrix) {
			for (char letter : row) {
				System.out.println(letter);
			}
		}

	}

	public static char[] testCharArray(char[][] incomingArray) {
		for (char[] row)
		for (char letter : incomingArray) {
			System.err.println(letter);
		}

		return incomingArray;
	}

	/**
	 * Alters the picture so that each pixel's blue channel has been zeroed out.
	 * All
	 * other channels remain the same
	 * 
	 * @param picture the image to be altered
	 */
	public static void zeroBlue(DigitalPicture picture) {

		// obtain a representation of the picture as a 2D array of Pixel objects
		Pixel[][] pixels2D = picture.getPixels2D();

		// Traverse the rows
		for (int row = 0; row < pixels2D.length; row++) {
			// traverse all the columns
			for (int col = 0; col < pixels2D[row].length; col++) {
				Pixel pixel = pixels2D[row][col];
				// invoke the setBlue method on each Pixel object
				pixel.setBlue(0);
			}
		}

	}

	/**
	 * Purpose: Make the picture black & white, and gray
	 * 
	 * @param picture
	 */
	public static void blackAndWhite(DigitalPicture picture) {
		// obtain a representation of the picture as a 2D array of Pixel objects
		Pixel[][] pixels2D = picture.getPixels2D();

		// Traverse the 2D array
		for (int row = 0; row < pixels2D.length; row++) {
			for (int col = 0; col < pixels2D[row].length; col++) {
				Pixel pixel = pixels2D[row][col];
				// Code that goes inside nested for-loop
				int val = pixel.getRed() + pixel.getGreen() + pixel.getBlue();

				// part 2 - Calculate the average!
				val = val / 3;

				// Part 3 - Set the new red, green, value to be the calculated average
				pixel.setRed(val);
				pixel.setGreen(val);
				pixel.setBlue(val);
			}
		}

	}

	/**
	 * Purpose: Invert the colors of image
	 * 
	 * @param picture
	 */
	public static void negative(DigitalPicture picture) {
		// obtain a representation of the picture as a 2D array of Pixel objects
		Pixel[][] pixels2D = picture.getPixels2D();

		// Traverse the 2D array
		for (int row = 0; row < pixels2D.length; row++) {
			for (int col = 0; col < pixels2D[row].length; col++) {

				Pixel pixel = pixels2D[row][col];

				// Part 3 - Set the new red, green, value to be the calculated average
				pixel.setRed(255 - pixel.getRed());
				pixel.setGreen(255 - pixel.getGreen());
				pixel.setBlue(255 - pixel.getBlue());
			}
		}

	}

	/**
	 * Purpose: Simulate that the picture was taken at sunset
	 * 
	 * @param picture
	 * @param redMultiplier       Factor increase of the red (usually > 1)
	 * @param greenBlueMultiplier Factor increase of green and blue (usually < 1)
	 */
	public static void makeSunset(
			DigitalPicture picture,
			double redMultiplier,
			double greenBlueMultiplier) {

		// obtain a representation of the picture as a 2D array of Pixel objects
		Pixel[][] pixels2D = picture.getPixels2D();
		int tempMaxRed = 0;

		// Traverse the 2D array
		for (int row = 0; row < pixels2D.length; row++) {
			for (int col = 0; col < pixels2D[row].length; col++) {
				Pixel pixel = pixels2D[row][col];
				// calc new red & green
				int newRed = (int) (pixel.getRed() * redMultiplier);
				int newGreen = (int) (pixel.getGreen() * greenBlueMultiplier);
				int newBlue = (int) (pixel.getBlue() * greenBlueMultiplier);

				if (tempMaxRed < newRed)
					tempMaxRed = newRed;
				// i think we should actually be scaling the value here
				pixel.setRed(Math.min(255, newRed));
				pixel.setGreen(newGreen);
				pixel.setBlue(newBlue);
			}
		}

		// traverse the image a second time to scale red values and ensure they are
		// below 255
		// for (int row = 0; row < pixels2D.length; row++) {
		// for (int col = 0; col < pixels2D[row].length; col++) {
		// Pixel pixel = pixels2D[row][col];
		// // calc new red & green
		// // scaledR = (r/rmax) * 255
		// double scaledRed = ((double) pixel.getRed()) / (tempMaxRed) * 255.0;
		// // set the new red value to the scaled value
		// pixels2D[row][col].setRed((int) scaledRed);
		// }
		// }

	}

	/**
	 * Purpose: Flip the image left to right (as used in many selfie cams)
	 * 
	 * @param picture
	 */
	public static void flipHorizontal(DigitalPicture picture) {
		Pixel[][] pixels2D = picture.getPixels2D();

		Color pixelColor;

		for (int row = 0; row < pixels2D.length; row++) {
			for (int col = 0; col < pixels2D[row].length / 2; col++) {
				// find length of row
				int numCols = pixels2D[row].length;
				// pixels2D[row][col].color into pixelColor
				pixelColor = pixels2D[row][col].getColor();
				// take right mirror pixel and move it to its left mirror
				pixels2D[row][col].setColor(pixels2D[row][numCols - (1 + col)].getColor());
				// replace outer with
				pixels2D[row][numCols - (1 + col)].setColor(pixelColor);
			}
		}

	}

	/**
	 * Purpose: Turn the picture up-side-down
	 * 
	 * @param picture
	 */
	public static void flipVertical(DigitalPicture picture) {
		Pixel[][] pixels2D = picture.getPixels2D();

		Color pixelColor;

		for (int row = 0; row < pixels2D.length / 2; row++) {
			for (int col = 0; col < pixels2D[row].length; col++) {
				// find length of row
				int numRows = pixels2D.length;
				// pixels2D[row][col].color into pixelColor
				pixelColor = pixels2D[row][col].getColor();
				// take bottom mirror color and move it to its top mirror
				pixels2D[row][col].setColor(pixels2D[numRows - (1 + row)][col].getColor());
				// replace outer with
				pixels2D[numRows - (1 + row)][col].setColor(pixelColor);
			}
		}

	}

	/**
	 * Purpose: Make the image less sharp
	 * 
	 * @param picture
	 */
	public static void blur(DigitalPicture picture) {
		// define the pixel matrix
		Pixel[][] pixels2D = picture.getPixels2D();
		// instantiate the color avg
		Color colorAvg;
		// iterate over the rows
		for (int row = 0; row < pixels2D.length - 1; row++) {
			// iterate over the cols
			for (int col = 0; col < pixels2D[row].length - 1; col++) {
				// moving block 2x2
				Pixel topLeft = pixels2D[row][col];
				Pixel topRight = pixels2D[row][col + 1];
				Pixel bottomLeft = pixels2D[row + 1][col];
				Pixel bottomRight = pixels2D[row + 1][col + 1];

				// find avg of the 4 blocks
				int redAvg = (int) (topLeft.getRed() + topRight.getRed() + bottomLeft.getRed() + bottomRight.getRed())
						/ 4;
				int greenAvg = (int) (topLeft.getGreen() + topRight.getGreen() + bottomLeft.getGreen()
						+ bottomRight.getGreen()) / 4;
				int blueAvg = (int) (topLeft.getBlue() + topRight.getBlue() + bottomLeft.getBlue()
						+ bottomRight.getBlue())
						/ 4;

				// set the new avg color
				colorAvg = new Color(
						redAvg,
						greenAvg,
						blueAvg);

				// set the avg colors
				topLeft.setColor(colorAvg);
			}
		}
	}

	/*
	 * Use the main method in this file to visually inspect the "filters" that
	 * you are
	 * applying to the image(s)! Please see the comment(s) for examples.
	 */
	// public static void main(String[] arg)
	// {
	//
	// // Create a myPicture object from the provided file name.
	// // If you use your own image, be sure to place it in the images folder
	// // of this project
	// DigitalPicture myPicture = new Picture("bees.png");
	// myPicture.setTitle("Original Image");
	//
	// // Use the explore method of the object to view the picture.
	// myPicture.explore();
	//
	// /*
	// * Apply the filter then invoke explorer again to view the changes. :)
	// * ---------------------------------------------------------------------
	// * ---------------
	// */
	//
	// // Apply one of the filters then view the image again with explore!
	// zeroBlue(myPicture); // <----- Change this to one of the other filters
	// // that you have written
	// myPicture.setTitle("After Filter"); // change the title of the JFrame
	// myPicture.explore();
	//
	// }

}

package edu.sdmesa.cisc191;

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
 *         Version/date: 8/30/25
 * 
 *         Responsibilities of class: group standard math functions for arrays
 *         into a single class
 * 
 */

// See INSTRUCTIONS in TestM1Challenge

public class M1Challenge {
	/**
	 * Purpose: add two numbers
	 * 
	 * @param a one number
	 * @param b another number
	 * @return the sum of a and b
	 */
	public static int add(int a, int b) {
		return a + b;
	}

	/**
	 * Purpose: multiply two numbers
	 * 
	 * @param a one number
	 * @param b another number
	 * @return the product of a and b
	 */
	public static int multiply(int a, int b) {
		// multiply
		return a * b;
	}

	/**
	 * Purpose: return the first element in the array given
	 * 
	 * @param array to search
	 * @return first element
	 */
	public static int getFirst(int[] array) {
		// first element of an array
		return array[0];
	}

	/**
	 * Purpose: return the last element in the array given
	 * 
	 * @param array to search
	 * @return last element
	 */
	public static int getLast(int[] array) {
		// last element of an array
		return array[array.length - 1];
	}

	/**
	 * Purpose: return the middle element in an array with an odd number of elements
	 * 
	 * @param array to search
	 * @return middle element
	 */
	public static int getMiddle(int[] array) {
		// middle of an array. this will even "work" on even arrays because of int
		// division
		return array[array.length / 2];
	}

	/**
	 * Purpose: find the max value in an array
	 * 
	 * @param array
	 * @return int
	 */
	public static int max(int[] array) {
		// create holder for max
		int temp = array[0];
		// iterate over the array
		for (int num : array) {
			// find max val
			temp = Math.max(num, temp);
		}
		// return max val
		return temp;
	}

	/**
	 * Purpose: find the min value in a given array
	 * 
	 * @param array
	 * @return int
	 */
	public static int min(int[] array) {
		// create holder for min
		int temp = array[0];
		// iterate over array
		for (int num : array) {
			// find min value
			temp = Math.min(num, temp);
		}
		// return min val
		return temp;
	}

	/**
	 * Purpose: Find the sum of a given array
	 * 
	 * @param array
	 * @return int
	 */
	public static int sum(int[] array) {
		// create holder for sum
		int temp = 0;
		// iterate over the nums
		for (int num : array) {
			// increment sum
			temp += num;
		}
		// return sum
		return temp;
	}

	/**
	 * Purpose: find the average of a given array
	 * 
	 * @param array
	 * @return double
	 */
	public static double average(int[] array) {
		// convert to double for higher precision
		return ((double) M1Challenge.sum(array)) / array.length;
	}

	// Use this template for the other methods
	/**
	 * Purpose:
	 * 
	 * @param array
	 * @return
	 */
	// public static ??? ???(???[] array)
	// {
	// return ???;
	// }

}

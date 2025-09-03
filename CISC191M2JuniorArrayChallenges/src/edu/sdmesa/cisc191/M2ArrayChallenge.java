package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * @author Kiernan Beresford
 *
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 8/27/25
 * 
 * Responsibilities of class: Manipulate arrays both in-place and through copies
 * 
 */
/**
 */
public class M2ArrayChallenge {
	/**
	 * Purpose: Find a given value in the array given
	 * 
	 * @param array to search
	 * @param char
	 * @return true if the value is in the array, otherwise false
	 */
	public static boolean contains(char[] array, char value) {
		// iterate over the array chars
		for (char v : array) {
			// check if the values are equal
			if (value == v) {
				// if they are equal return true
				return true;
			}
		}
		// if no match is found return false
		return false;
	}

	// Use this template for the methods
	/**
	 * Purpose: find the first instance of a value
	 * 
	 * @param array
	 * @param char
	 * @return index of value or -1 if not found
	 */
	public static int find(char[] array, char value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value)
				return i;
		}

		return -1;
	}

	// Use this template for the methods
	/**
	 * Purpose: count the number of instances of a value
	 * 
	 * @param array
	 * @param char
	 * @return int occurrences of value
	 */
	public static int countValues(char[] array, char value) {
		int count = 0;

		for (char v : array) {
			if (v == value)
				count += 1;
		}

		return count;
	}

	/**
	 * Purpose: Check if the given array's elements are in order
	 * 
	 * @param array
	 * @return boolean
	 */
	public static boolean inOrder(char[] array) {
		// iterate over the array
		for (int i = 1; i < array.length; i++) {
			// typecast to ascii then compare char value
			if (!((int) array[i - 1] < (int) array[i]))
				// if i-1 !< i return false
				return false;
		}

		return true;
	}

	/**
	 * Purpose: Modify the array in place swap index and index +1
	 * 
	 * @param array
	 * @return char[]
	 */
	public static char[] swapElements(char[] array, int index) {
		// check if the array if the index will be in bounds
		if (array.length - 1 <= index)
			return array;
		// temp char holder
		char temp;
		// copy current index to holder
		temp = array[index];
		// copy index +1 to index
		array[index] = array[index + 1];
		// set index +1 to temp
		array[index + 1] = temp;
		// return array
		return array;
	}

	/**
	 * Purpose: Run one iteration of bubble sort
	 * 
	 * @param array
	 * @return char[]
	 */
	public static char[] bubbleUp(char[] array) {
		// iterate over the array
		for (int i = 1; i < array.length; i++) {
			// if the hex code of i-1 is larger than i bubble index
			if ((int) array[i - 1] > (int) array[i])
				// call the swap elements and return the array
				M2ArrayChallenge.swapElements(array, i - 1);
		}
		// return the array
		return array;
	}

	/**
	 * Purpose: Run the bubble sort
	 * 
	 * Im pretty sure there is a fixed iteration number like O(n)
	 * 
	 * @param array
	 * @return char[]
	 */
	public static char[] bubbleSort(char[] array) {
		// im cheating just using the while loop
		while (!(M2ArrayChallenge.inOrder(array))) {
			// call bubble up method
			M2ArrayChallenge.bubbleUp(array);
		}
		// return the sorted array
		return array;
	}

	/**
	 * Purpose: Copy a given array
	 * 
	 * @param array
	 * @return char[]
	 */
	public static char[] copy(char[] array) {
		// create a new a array with len == array.length
		char[] arrayCopy = new char[array.length];
		// iterate over the array
		for (int i = 0; i < array.length; i++) {
			// create a copy
			arrayCopy[i] = array[i];
		}
		// return copy
		return arrayCopy;
	}

	/**
	 * Purpose: Check every element of a given array to see if they are equal
	 * 
	 * @param array1
	 * @param array2
	 * @return boolean
	 */
	public static boolean arrayElementsEqual(char[] array1, char[] array2) {
		// return false if they aren't the same length
		if (array1.length != array2.length) {
			return false;
		}
		// iterate over the array
		for (int i = 0; i < array1.length; i++) {
			// if the element of array 1 != array 2 return false
			if (array1[i] != array2[i])
				return false;
		}
		// else return true
		return true;
	}

	/**
	 * Purpose: Create a reverse copy of a given array
	 * 
	 * @param array
	 * @return char[]
	 */
	public static char[] backwards(char[] array) {
		// create a new array of equal len
		char[] backArray = new char[array.length];
		// iterate over array
		for (int i = 0; i < array.length; i++) {
			// use the length of the array to to find its mirror index
			backArray[i] = array[array.length - (1 + i)];
		}
		// return the array copy
		return backArray;

		// modify in place
		/*
		 * if (array.length == 0)
		 * // return array;
		 * 
		 * char temp;
		 * // round down for odd arrays
		 * for (int i = 0; i < array.length / 2; i++) {
		 * temp = array[array.length - (1 + i)];
		 * 
		 * array[array.length - (1 + i)] = array[i];
		 * array[i] = temp;
		 * }
		 * 
		 * return array;
		 */
	}

	/**
	 * Purpose: Check if a given word is a palindrome
	 * 
	 * @param array
	 * @return boolean
	 */
	public static boolean isPalindrome(char[] array) {
		// iterate over the array length / 2
		for (int i = 0; i < array.length / 2; i++) {
			// check if the array's mirror is equal
			if (array[i] != array[array.length - (1 + i)])
				// if any of them don't equal exit and return false
				return false;
		}
		// else return true
		return true;
	}

	/**
	 * Purpose: Get a given element in a row by column matrix
	 * 
	 * @param matrix
	 * @param row
	 * @param column
	 * @return int
	 */
	public static int getElement(int[][] matrix, int row, int column) {
		// standard row column format
		return matrix[row][column];
	}

	/**
	 * Purpose: add all numbers in a given row
	 * 
	 * @param matrix
	 * @param row
	 * @return int
	 */
	public static int addRow(int[][] matrix, int row) {
		// create a return
		int temp = 0;
		// iterate over all numbers in a given row
		for (int num : matrix[row]) {
			// sum the numbers
			temp += num;
		}
		// return the sum
		return temp;
	}

	/**
	 * Purpose: add all numbers in a given column
	 * 
	 * @param matrix
	 * @param column
	 * @return int
	 */
	public static int addColumn(int[][] matrix, int column) {
		// define the return
		int temp = 0;
		// iterate over all the rows
		for (int[] row : matrix) {
			// iterate sum the entries for a specific column
			temp += row[column];
		}
		// return the sum
		return temp;
	}

	/**
	 * Purpose: sum the diagonal left to right
	 * 
	 * @param matrix
	 * @return int
	 */
	public static int addLeftToRightDiagonal(int[][] matrix) {
		// instantiate the return
		int temp = 0;
		// return 0 if the matrix isn't square
		if (matrix.length == 0 || matrix.length != matrix[0].length)
			// i should throw an illegal argument error but i don't want to
			return temp;
		// set the col counter
		int col = 0;
		// iterate over the rows
		for (int[] row : matrix) {
			// add current value to sum
			temp += row[col];
			// increment the column
			col++;
		}
		// return the sum
		return temp;
	}

	/**
	 * Purpose: sum of the right to left diagonal
	 * 
	 * @param matrix
	 * @return int
	 */
	public static int addRightToLeftDiagonal(int[][] matrix) {
		// instantiate sum
		int temp = 0;
		// check if matrix is square
		if (matrix.length == 0 || matrix.length != matrix[0].length)
			// i should throw an illegal argument error but i don't want to
			return temp;
		// start at last col
		int col = matrix[0].length - 1;
		// iterate over rows
		for (int[] row : matrix) {
			temp += row[col];
			// decrement col
			col--;
		}
		// return sum
		return temp;
	}

	/**
	 * Purpose: Sum all the array.length-1 entries
	 * 
	 * @param matrix
	 * @return sum of last element in each row
	 */
	public static int addLastRowElement(int[][] matrix) {
		int temp = 0;
		// iterate over rows
		for (int[] row : matrix) {
			// get the last element in every row and sum
			temp += row[row.length - 1];
		}
		// return sum
		return temp;
	}

	/**
	 * Purpose: sum all the entries in the matrix
	 * 
	 * @param matrix
	 * @return int
	 */
	public static int addAll(int[][] matrix) {
		int temp = 0;
		// iter row
		for (int[] row : matrix) {
			// iter over every col in row
			for (int num : row)
				temp += num;
		}

		return temp;
	}
	// Use this template for the methods
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

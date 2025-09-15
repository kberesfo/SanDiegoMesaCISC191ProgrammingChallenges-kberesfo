package edu.sdmesa.cisc191;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
	public static boolean isPalindrome(char[] letters) {
		// Use a Queue and a Stack to see if the letters
		// are the same front-to-back and back-to-front
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();

		for (int i = 0; i < letters.length; i++) {
			// first in first out
			queue.add(letters[i]);
			stack.add(letters[i]);
		}
		// iterate over the containers (Do while is also valid)
		while (!queue.isEmpty()) {
			// pop or remove comparing the outer first to last
			if (queue.remove() != stack.pop())
				// if they don't equal return false
				return false;
		}
		// all elements equal
		return true;
	}

}

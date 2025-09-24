package edu.sdmesa.cisc191;

import java.util.Stack;

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
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a producer that produces strings
 *         - Implements the Producer interface
 *         - Uses a Stack to store the strings
 */
public class StringStackProducer implements Producer<String> {
    Stack<String> stack;

    /**
     * Purpose: create a new String stack producer
     * 
     * @param stack the stack to produce to
     */
    StringStackProducer(Stack<String> stack) {
        this.stack = stack;
    }

    /**
     * Purpose: produce a string to the stack
     * 
     * @param item the string to produce
     */
    @Override
    public void produce(String item) {
        this.stack.add(item);
    }
}

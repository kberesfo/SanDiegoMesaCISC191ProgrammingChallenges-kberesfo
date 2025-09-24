package edu.sdmesa.cisc191;

import java.util.EmptyStackException;
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
 *         - Represents a consumer that consumes strings
 *         - Implements the Consumer interface
 *         - Uses a Stack to store the strings
 */
public class StringStackConsumer implements Consumer<String> {
    Stack<String> stack;

    /**
     * Purpose: create a new String stack consumer
     * 
     * @param stack the stack to consume from
     */
    StringStackConsumer(Stack<String> stack) {
        this.stack = stack;
    }

    /**
     * Purpose: consume a string from the stack
     * 
     * @return the consumed string
     */
    @Override
    public String consume() {
        try {
            return this.stack.pop();
        } catch (EmptyStackException e) {
            // return null when stack is empty
            return null;
        }
    }
}

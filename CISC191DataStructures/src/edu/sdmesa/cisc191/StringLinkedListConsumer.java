package edu.sdmesa.cisc191;

import java.util.LinkedList;
import java.util.NoSuchElementException;

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
 *         - Uses a LinkedList to store the strings
 */
public class StringLinkedListConsumer implements Consumer<String> {
    LinkedList<String> list;

    /**
     * Purpose: create a new String linked list
     * 
     * @param list the linked list to consume from
     */
    StringLinkedListConsumer(LinkedList<String> list) {
        this.list = list;
    }

    /**
     * Purpose: consume a string from the linked list
     * 
     * @return the consumed string
     */
    @Override
    public String consume() {
        try {
            return this.list.removeFirst();
        } catch (NoSuchElementException e) {
            return null;
        }

    }
}

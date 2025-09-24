package edu.sdmesa.cisc191;

import java.util.LinkedList;

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
 *         r123454321. “Returning Null in a Method Whose Signature Says Return
 *         Int?” Stack Overflow, 20 June 2013,
 *         stackoverflow.com/questions/17221759/returning-null-in-a-method-whose-signature-says-return-int.
 * 
 *         Version/date: 9/18/25
 * 
 *         Responsibilities of class:
 *         - Represents a producer that produces strings
 *         - Implements the Producer interface
 *         - Uses a LinkedList to store the strings
 */
public class StringLinkedListProducer implements Producer<String> {
    LinkedList<String> list;

    /**
     * Purpose: create a new String linked list
     * 
     * @param list the linked list to produce to
     */
    StringLinkedListProducer(LinkedList<String> list) {
        this.list = list;
    }

    /**
     * Purpose: produce a string to the linked list
     * 
     * @param item the string to produce
     */
    @Override
    public void produce(String item) {
        list.add(item);
    }

}

package edu.sdmesa.cisc191;

import java.util.Queue;

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
 *         - Uses a Queue to store the strings
 */
public class StringQueueProducer implements Producer<String> {
    Queue<String> queue;

    /**
     * Purpose: create a new String queue producer
     * 
     * @param queue the queue to produce to
     */
    StringQueueProducer(Queue<String> queue) {
        this.queue = queue;
    }

    /**
     * Purpose: produce a string to the queue
     * 
     * @param item the string to produce
     */
    @Override
    public void produce(String item) {
        this.queue.add(item);
    }
}

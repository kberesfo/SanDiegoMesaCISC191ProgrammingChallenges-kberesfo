package edu.sdmesa.cisc191;

import java.util.NoSuchElementException;
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
 *         - Represents a consumer that consumes strings
 *         - Implements the Consumer interface
 *         - Uses a Queue to store the strings
 */
public class StringQueueConsumer implements Consumer<String> {
    Queue<String> queue;

    /**
     * Purpose: create a new String queue consumer
     * 
     * @param queue the queue to consume from
     */
    StringQueueConsumer(Queue<String> queue) {
        this.queue = queue;
    }

    /**
     * Purpose: consume a string from the queue
     * 
     * @return the consumed string
     */
    @Override
    public String consume() {
        try {
            return this.queue.remove();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}

package edu.sdmesa.cisc191;

import java.util.NoSuchElementException;
import java.util.Queue;

public class StringQueueConsumer implements Consumer<String> {
    Queue<String> queue;

    StringQueueConsumer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public String consume() {
        try {
            return this.queue.remove();
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}

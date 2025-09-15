package edu.sdmesa.cisc191;

import java.util.Queue;

public class StringQueueProducer implements Producer<String> {
    Queue<String> queue;

    StringQueueProducer(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void produce(String item) {
        this.queue.add(item);
    }
}

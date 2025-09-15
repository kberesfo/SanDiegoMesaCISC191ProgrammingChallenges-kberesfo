package edu.sdmesa.cisc191;

import java.util.Stack;

public class StringStackProducer implements Producer<String> {
    Stack<String> stack;

    StringStackProducer(Stack<String> stack) {
        this.stack = stack;
    }

    @Override
    public void produce(String item) {
        this.stack.add(item);
    }
}

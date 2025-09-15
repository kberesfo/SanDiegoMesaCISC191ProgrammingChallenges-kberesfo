package edu.sdmesa.cisc191;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class StringStackConsumer implements Consumer<String> {
    Stack<String> stack;

    StringStackConsumer(Stack<String> stack) {
        this.stack = stack;
    }

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

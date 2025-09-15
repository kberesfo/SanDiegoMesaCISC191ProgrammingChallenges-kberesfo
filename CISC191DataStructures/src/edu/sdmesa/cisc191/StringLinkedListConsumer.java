package edu.sdmesa.cisc191;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StringLinkedListConsumer implements Consumer<String> {
    LinkedList<String> list;

    StringLinkedListConsumer(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public String consume() {
        try {
            return this.list.removeFirst();
        } catch (NoSuchElementException e) {
            return null;
        }

    }
}

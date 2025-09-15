package edu.sdmesa.cisc191;

import java.util.LinkedList;

public class StringLinkedListProducer implements Producer<String> {
    LinkedList<String> list;

    /**
     * Purpose: create a new String linked list
     * 
     * @param list
     */
    StringLinkedListProducer(LinkedList<String> list) {
        this.list = list;
    }

    @Override
    public void produce(String item) {
        list.add(item);
    }

}

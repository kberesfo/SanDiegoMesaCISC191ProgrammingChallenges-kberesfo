package edu.sdmesa.cisc191;

import java.util.HashMap;
import java.util.Map;

// https://stackoverflow.com/questions/17221759/returning-null-in-a-method-whose-signature-says-return-int

public class PhoneDirectory {
    Map<String, Person> directory;

    /**
     * Locally defined person
     */
    public class Person {
        private String name;
        private int number;

        /**
         * Purpose:
         * 
         * @param name
         * @param number
         */
        Person(String name, int number) {
            this.name = name;
            this.number = number;
        }

        /**
         * Purpose:
         * 
         * @return int
         */
        public int getNumber() {
            return this.number;
        }

        /**
         * Purpose:
         * 
         * @param int number
         */
        public void setNumber(int number) {
            this.number = number;
        }

        /**
         * Purpose:
         * 
         * @return String
         */
        public String getName() {
            return this.name;
        }
    }

    /**
     * Purpose
     */
    PhoneDirectory() {
        this(new HashMap<String, Person>());
    }

    /**
     * Purpose:
     * 
     * @param ArrayList<Person> directory
     */
    PhoneDirectory(Map<String, Person> directory) {
        this.directory = directory;
    }

    /**
     * Purpose:
     * 
     * @param String name
     * @return int
     */
    public Integer findNumberForPerson(String name) {
        if (this.directory.containsKey(name))
            return this.directory.get(name).getNumber();

        return null;
    }

    /**
     * Purpose:
     * 
     * @param String name
     * @param int    number
     */
    public void setNumberForPerson(String name, int number) {
        // add a person to the directory
        if (this.directory.containsKey(name))
            this.directory.get(name).setNumber(number);

        // if the person doesn't exist add them
        this.directory.put(name, new Person(name, number));
    }

    /**
     * Purpose:
     * 
     * @param String name
     */
    public void forget(String name) {
        if (this.directory.containsKey(name))
            this.directory.remove(name);
    }
}

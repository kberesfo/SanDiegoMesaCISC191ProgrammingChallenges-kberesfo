package cisc191.sdmesa.edu;

public class Example {
    // instance variable
    String instanceVar1;
    // Has-A ExampleNestedClass
    ExampleNestedClass hasAExample;
    // Has-Many ExampleNestedClasses
    ExampleNestedClass[] hasManyExamples;

    // this is just an example class for demo.
    public class ExampleNestedClass {
        // instance variable
        String name = "Kiernan";

        /**
         * Purpose access the constant string name
         * 
         * @return String name
         */
        public String getName() {
            return name;
        }
    }

    /**
     * Purpose: Overloaded constructor
     */
    Example() {
        this("Hello World!");
    }

    /**
     * Purpose: Demo classes
     * 
     * @param instanceVar1
     */
    Example(String instanceVar1) {
        this.instanceVar1 = instanceVar1;
        this.hasAExample = new ExampleNestedClass();
        this.hasManyExamples = new ExampleNestedClass[] {
                new ExampleNestedClass(),
                new ExampleNestedClass()
        };
    }

    /**
     * Purpose: Demo
     */
    public void printHelloWorld() {
        System.err.println(instanceVar1);
        return;
    }

    /**
     * Purpose: Demo accessing the methods in has a relationship
     */
    public void printName() {
        System.err.println(this.hasAExample.getName());
        return;
    }

    /**
     * Purpose: Demo the has many / aggregations
     */
    public void printNames() {
        // iterate over the hasManyExamples
        for (int i = 0; i < this.hasManyExamples.length; i++) {
            // print my name for each time it was accessed
            // System.err.println(exampleClass.getName());

            this.hasManyExamples[i] = this.hasManyExamples[i];
        }

        return;

    }

}

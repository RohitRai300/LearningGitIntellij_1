package src.com.java.functionalInterfaces;

import java.util.function.Consumer;

// Consumer is a functional interface with abstract method as accept(Object), it takes one input and returns no result
// it takes input and simply prints it on screen
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> input = (String s)->{
            System.out.println(s);
        };
        input.accept("Rohit Rai");
    }
}

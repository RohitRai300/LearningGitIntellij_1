package src.com.java.functionalInterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;


// Supplier is a functional interface with abstract method as get(), it takes no input and returns one result
// it doesnt takes any input and simply prints result on screen
public class SupplierDemo {
    public static void main(String[] args) {

        // Example 1
        Supplier<Integer> supp = ()->{
            return "Rohit".length();
        };
        System.out.println(supp.get());

        //Example 2
        //More simplified LambdaExpression
        Supplier<LocalDateTime> time = ()-> LocalDateTime.now();
        System.out.println(time.get());

    }
}

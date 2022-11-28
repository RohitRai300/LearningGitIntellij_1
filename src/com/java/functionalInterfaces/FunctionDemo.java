package src.com.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String, Integer> func = (String s) -> s.length();
        System.out.println(func.apply("Rohit"));



    }

}

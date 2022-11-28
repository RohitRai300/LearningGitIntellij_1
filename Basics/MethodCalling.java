package Basics;

public class MethodCalling {

    public static void display1(){
        System.out.println("Inside Display1");
    }

    public static void display2(){
        System.out.println("Inside display2");
    }

    public static void main(String[] args) {
        System.out.println("Before Call from main");
        display1();
        display2();
        System.out.println("After Call from main");
    }
}

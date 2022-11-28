package src.com.java.lambda;

interface Shape{
    void draw();
}

//class Rectangle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Inside rectangle method");
//    }
//}
//
//class Circle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Inside circle method");
//    }
//}


public class LambdaExample {
    public static void display(Shape ref){
        ref.draw();
    }
    public static void main(String[] args) {

        Shape rect = ()->{System.out.println("inside rectangle");};
//      rect.draw();
        // passing lambda as parameter
        display(rect);


        Shape cir = ()->{System.out.println("inside circle");};
        cir.draw();

        Shape square = ()->{System.out.println("inside square");};
        square.draw();

    }
}

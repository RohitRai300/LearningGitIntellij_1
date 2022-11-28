package src.com.java.lambda;

interface additionInterface{
    int add(int a ,int b);
}

class addAble implements additionInterface{

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}

public class Parameterized_Lambda {
    public static void main(String[] args) {

      // Standard method 1:
//        addAble abc = new addAble();
//        int result = abc.add(10,20);
//        System.out.println(result);

        // Lambda Expression
        additionInterface abc = (int a,int b)-> {return a+b; } ;
        int res = abc.add(10,2);
        System.out.println(res);

        // Lambda expression simplified
        additionInterface ab = (a,b)->(a+b);
        int res1 = ab.add(10,15);
        System.out.println(res1);

        // Multiple statements in lambda exp
        additionInterface additionInterface = (int a, int b)->{
            int c = a+b;
            return c;
        };
        System.out.println(additionInterface.add(10,20));
    }
}

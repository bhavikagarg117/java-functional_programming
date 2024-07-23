package Functional_Programming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryNBinary {
    public static void main(String[] args) {
        UnaryOperator<String> o1= n-> n+n;
        System.out.println(o1.apply("Ok"));

        System.out.println("----------------------");
        BinaryOperator<Integer> o2= (a,b)-> a*2 + b*2 ;
        System.out.println(o2.apply(4,5));


    }
}

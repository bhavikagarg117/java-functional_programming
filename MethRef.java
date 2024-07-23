package Functional_Programming;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethRef {
    public static void main(String[] args) {
        Function<String,String> o1= String::toUpperCase;
        System.out.println(o1.apply("Hello"));

        System.out.println("------------------");

        Consumer<String> o2= System.out::print;
        o2.accept("redbluegreen");













    }
}

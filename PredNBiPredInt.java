package Functional_Programming;

import java.util.function.Predicate;
import java.util.function.BiPredicate;


public class PredNBiPredInt {
    public static void main(String[] args) {
        Predicate<Integer> obj= n -> n>10 ;
        Predicate<Integer> obj2= n -> n<20 ;
        System.out.println(obj.and(obj2).test(15));
        System.out.println(obj.negate().test(11));

        System.out.println("-----------------");
        BiPredicate<String, String> obj1= (s1,s2)-> s1.equalsIgnoreCase(s2);
        System.out.println(obj1.test("hello","hi"));
        System.out.println(obj1.test("hello","HELLO"));

    }
}

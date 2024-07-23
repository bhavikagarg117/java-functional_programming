package Functional_Programming;
import java.util.function.*;
public class FunNBiFunInt {
    public static void main(String[] args) {
        Function<Integer,Integer> a1= n-> n*2;
        Function<Integer,Integer> a2= n-> n+3;
        Function<Integer,Integer> ans= a1.compose(a2);
        Function<Integer,Integer> other= a1.andThen(a2);
        System.out.println(ans.apply(3));
        System.out.println(other.apply(3));

        System.out.println("-----------------------------------------------------------------");

        BiFunction<String,Integer,String> obj2= (a,b)-> a+b;
        System.out.println("the string returned is "+obj2.apply("high",5));

        System.out.println("-----------------------------------------------------------------");

        BiFunction<Integer,Integer,Boolean> obj3= (a,b)-> a>b;
        System.out.println(obj3.apply(3,4));





    }
}

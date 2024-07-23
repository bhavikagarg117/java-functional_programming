package Functional_Programming;

import java.time.LocalDate;
import java.util.function.*;

public class ConstructorRef {
    public static void main(String[] args) {

        Function<Integer,Integer> o1= Integer::new;
        Integer num= o1.apply(3);
        System.out.println(num);

        System.out.println("------------");

        Supplier<LocalDate> o2= LocalDate::now;
        System.out.println(o2.get());

    }
}
